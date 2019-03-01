/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT303
 */
public class FrequencyCounter {

    Map<String, WordFequency> Frequency;

    public FrequencyCounter() {
        Frequency = new HashMap(125);
    }

    public void process(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "!@#$%^&*()_+}?><}{[]|\\ /1234567890,.'");
            while (stk.hasMoreElements()) {
                String word = stk.nextToken();
                if (Frequency.get(word) == null) {
                    Frequency.put(word, new WordFequency(word));
                } else {
                    Frequency.get(word).increment();
                }

            }
        }

    }

    public void clear() {
        Frequency.clear();
    }

    public String toString() {
        StringBuilder stb = new StringBuilder(Frequency.size() * 20);
        List<WordFequency> words = new ArrayList(Frequency.values());
        Collections.sort(words);
        for (WordFequency word : words) {
            stb.append(String.format("%-15s : %3d\n", word.getWord(), word.getCount()));
        }
        return stb.toString();
    }
    public List <WordFequency> getResult() {
        return new ArrayList(Frequency.values());
    }
}
