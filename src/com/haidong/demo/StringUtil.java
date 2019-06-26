package com.haidong.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtil {
    public static void checkMagazine(String[] magazine, String[] note) {
        System.out.println("Started");

        int i = 0;
        int noteLen = note.length;
        List<String> m = new ArrayList<>(Arrays.asList(magazine));

        while(i<noteLen) {
            String word = note[i];

            if (m.contains(word)) {
                i++;
                m.remove(word);
                continue;
            }

            System.out.print("No");
            return;
        }

        System.out.println("Yes");
        return;
    }
}
