import java.util.*;

public class AnagramTwo {


    public boolean IsAnagram(char[] wordOne, char[] wordTwo){

        // sort wordOne and wordTwo
        // linear compare them both

        Arrays.sort(wordOne);
        Arrays.sort(wordTwo);

        // if length of both array do not match, it is not an anagram
        if (wordOne.length != wordTwo.length){
            return false;
        }

        int index = 0;
        while (index < wordOne.length && wordOne[index] == wordTwo[index]){
            index++;

            // return true because done scanning for the whole array
            if (index == wordOne.length){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        System.out.println("Hello");

        String anagramOne = "Silent";
        String anagramTwo = "Listen";
        

        // Our char array words
        char[] charWordOne = anagramOne.toLowerCase().toCharArray();
        char[] charWordTwo = anagramTwo.toLowerCase().toCharArray();

        AnagramTwo sol = new AnagramTwo();

        System.out.println(sol.IsAnagram(charWordOne, charWordTwo));
    }
    
}
