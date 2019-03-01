/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.map;

/**
 *
 * @author INT303
 */
public class WordFequency implements Comparable<WordFequency>{

    public WordFequency(String word) {
        this.word = word;
        this.count = 1;
    }

    private String word;
    private int count;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    @Override
    public int compareTo(WordFequency word) {
       return this.word.compareTo(word.word); //เรียงจาก A-Z
    }

}
