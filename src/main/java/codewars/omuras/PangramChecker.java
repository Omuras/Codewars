package codewars.omuras;

import java.util.List;

public class PangramChecker {
    public boolean check(String sentence){
        List<String> alphabet = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        String upperCase = sentence.toUpperCase();
        List<String> split = List.of(upperCase.split(""));
        System.out.println(split);
        return split.containsAll(alphabet);
    }
}