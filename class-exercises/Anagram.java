import java.util.*;

public class Anagram {

    public boolean IsAnagram(char[] wordOne, char[] wordTwo){



        // how many elements will be deleted
        int counter = 0;
        // compare the copyArr length with wordTwo, if both length are the same, then they are anagram
        char[] copyArr = new char[counter];

        if (wordOne.length == wordTwo.length){
            for (int i = 0; i < wordOne.length; i++){
                for (int j = 0; j < wordOne.length; j++){
                    if (wordOne[i] == wordTwo[j]){
                        // if letter matches with wordOne, increment counter
                        counter++;
                    }
                }
            }
            
        }

        


        return false;
        // check if both char arrays have the same length
       
    }


    public char[] ConvertToCharArr(String word){


        char[] charWord = word.toCharArray();

        return charWord;
    }

    public static void main(String[] args){
       
        Anagram sol = new Anagram();
        String anagramOne = "ssa";
        String anagramTwo = "Eat";
        

        // Our char array words
        char[] charWordOne = anagramOne.toLowerCase().toCharArray();
        char[] charWordTwo = anagramTwo.toLowerCase().toCharArray();

        System.out.println(sol.IsAnagram(charWordOne, charWordTwo));
    
        
        


    }
    
}
