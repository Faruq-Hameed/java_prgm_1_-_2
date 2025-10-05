import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public record Samples() {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("faruq");
        names.add("faruq");
        names.add("faruq");

        List<String> namesB = new ArrayList<>();
        namesB.add("faruq");
        namesB.add("faruq");
        namesB.add("faruq");
        System.out.println(names);
        System.out.println(namesB);
        System.out.println(names == namesB);
        System.out.println(names.equals(namesB));
        System.out.println(names.hashCode()  + " " + namesB.hashCode());
        
        Map<String, Integer> scores = new HashMap<>();

        String name = "faruq";
        scores.put("first", 9);
        scores.put("third", 10);
        scores.put("second", 5);

        Map<String, Integer> scoresB = new HashMap<>();

        scoresB.put("fifth", 10);
        scoresB.put("first", 9);
        scoresB.put("second", 5);
        scoresB.put("third", 10);
        scoresB.put("forth", 10);
        scoresB.put("sixth", 5);


        System.out.println(scores);
        System.out.println(scoresB);
        for(String key: scoresB.keySet()){
            System.out.println(key);
            System.out.println(key + " : " + scoresB.get(key));
        }
        System.out.println("printing values");
        for (Integer score: scoresB.values()){
            System.out.println(score);
        }

        Set<String> sets = new HashSet<>();
        sets.add("faruq");
        sets.add("faryq");
        sets.add("farjq");
        sets.add("faruq");
        System.out.println(sets);
        // System.out.println(scores.equals(scoresB));
        Set<Integer> cleanedScores = new HashSet<>();

        for (Integer score : scoresB.values()) {
            cleanedScores.add(score);
            
        }
        System.out.println(cleanedScores);
    }

}
