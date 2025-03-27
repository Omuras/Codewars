package codewars.omuras;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int narc = 0;
        List<Integer> nums = new ArrayList<>();
        int counter = 0;
        String s = String.valueOf(number);

        for (int i = 1; i <= Math.pow(10, s.length()) / 10; i = i * 10) {
            int tempNum = (number / i % 10);
            nums.add(tempNum);
        }

        while (counter < nums.size()) {
            double digit = nums.get(counter);
            narc += Math.pow(digit, nums.size());

            counter++;
        }

        return number == narc;
    }

}

