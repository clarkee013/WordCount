package example.codeclan.com.wordcount;

import android.icu.lang.UCharacter;

import java.util.Scanner;

import static android.R.id.input;

/**
 * Created by user on 03/07/2017.
 */

public class WordCount {

    public String sentence;
    MainActivity TextBox;


    public String getSentence() {
        sentence = MainActivity.words();
        return sentence.toString();
    }

    public int getWordCountInSentence(String sentence) {
        int wordCount = 0;
        if (sentence.trim().equals("")) {
            return wordCount;
        }
        else {
            wordCount = 1;
        }
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            String str = new String("" + ch);
            if (i+1 != sentence.length() && str.equals(" ") && !(""+ sentence.charAt(i+1)).equals(" ")) {
                wordCount++;
            }
        }
        return wordCount;
    }


}

