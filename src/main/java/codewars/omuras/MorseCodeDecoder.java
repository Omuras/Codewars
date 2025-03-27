package codewars.omuras;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        List<String> words = new ArrayList<>();
        // Split message to words with "   " and if doesn't exist this it means it's 1 word
        if (morseCode.contains("   ")) {
            words = List.of(morseCode.split("   "));
        } else {
            words.add(morseCode);
        }
        Iterator<String> iterator = words.iterator();
        StringBuilder builder = new StringBuilder();
        // iterate over words
        while (iterator.hasNext()) {
            String word = iterator.next();
            // Split by " " and add it to stringBuilder.
            List.of(word.split(" ")).forEach(letter -> {
                // check if fetched char sequence is valid.
                if (!StringUtils.isEmpty(letter)) {
                    builder.append(MorseCode.get(letter));
                }
            });
            // check if it's first or last element.
            if (iterator.hasNext() && !builder.isEmpty()) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}