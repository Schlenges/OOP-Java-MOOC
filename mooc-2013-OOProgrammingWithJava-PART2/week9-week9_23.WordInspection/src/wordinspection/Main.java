package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        // test your code here

        File file = new File("../shortList.txt");
        WordInspection wordInspection = new WordInspection(file);
        int count = wordInspection.wordCount();
        System.out.println(count);
        System.out.println(wordInspection.wordsContainingZ());
        System.out.println(wordInspection.wordsEndingInL());
        System.out.println(wordInspection.palindromes());
        System.out.println(wordInspection.wordsWhichContainAllVowels());

        // all words are in file src/wordList.txt

    }
}
