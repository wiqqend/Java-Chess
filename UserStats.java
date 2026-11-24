import java.io.*;
import java.util.*;

public class UserStats {
    
    public static class Record{
        private final String id;
        private final String name;
        private int wins;
        private int games;

        private Record(String id, String name) {
            this.id = id;
            this.name = name;
        }
        public String getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public int getWins(){
            return wins;
        }
        public int getGames(){
            return games;
        }
        public double getWinRate(){
            if (games == 0){
                return 0;
            }
            else{
                return 100.0 * wins / games;
            }
        }
        public String statsOutput(){
            return id + "," + name + "," + wins + "," + games + "," + getWinRate() + "%";
        }
    }

    private final String fileName;
    private final List<Record> records = new ArrayList<>();

    public UserStats(String fileName){
        this.fileName = fileName;
        load();
    }
    public Record find(String id){
        for (Record r : records){
            if (r.id.equalsIgnoreCase(id.trim())){
                return r;
            }
        }
        return null;
    }
    public Record create(String id, String name){
        name = name.trim();
        if (name.isEmpty()) {
            name = id;
        }
        Record r = new Record(id.trim(), name);
        records.add(r);
        return r;
    }

    public boolean recordWin(Record winner, Record loser){
        if (winner != null) {
            winner.wins++;
            winner.games++;
        }
        if (loser != null) {
            loser.games++;
        }
        return save();
    }
    
    public boolean recordDraw(Record p1, Record p2){
        if (p1 != null) {
            p1.games++;
        }
        if (p2 != null) {
            p2.games++;
        }
        return save();
    }

    public void load(){
        File file = new File(fileName);
        if (!file.exists()){
            return;
        }
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    Record r = new Record(parts[0], parts[1]);
                    r.wins = Integer.parseInt(parts[2]);
                    r.games = Integer.parseInt(parts[3]);
                    records.add(r);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading user stats: " + e.getMessage());
        }

    }
    public boolean save(){
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            for (Record r : records) {
                out.println(r.statsOutput());
            }
        return !out.checkError();
        } catch (IOException e) {
            return false;
        }
    }
}
