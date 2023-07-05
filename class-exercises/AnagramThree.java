import java.util.Arrays;

public class AnagramThree {


    public boolean IsAnagram(char[] wordOne, char[] wordTwo){

        // anagrams have the same number sum of discint letters in each word.
        // stressed = desserts
        // d = 1, e = 2, r = 1, s = 3


        if (wordOne.length != wordTwo.length){
            return false;
        }


       

        // the array will hold values of 0
        int[] asciiValuesArr = new int[256];


      
        for (int i = 0; i < wordOne.length; i++){
            // we can access a specific index in the asciiValues using the character's ascii code
             // convert the char to integer to get the ascii value
            int asciiCharValOne = (int)wordOne[i];
            int asciiCharValTwo = (int)wordTwo[i];
            asciiValuesArr[asciiCharValOne] += 1;
            // must not have duplicate
            asciiValuesArr[asciiCharValTwo] -= 1;




        }


        // if there are values in the ascii values arr length greater than 0, it is not an anagram
        for (int i = 0; i < asciiValuesArr.length;i++){
            if (asciiValuesArr[i] != 0){
                return false;
            }
        }

        return true;

    }

   

    public static void main(String[] args){
           
        AnagramThree sol = new AnagramThree();
        String anagramOne = "desserts";
        String anagramTwo = "stressed";
        

        // Our char array words
        char[] charWordOne = anagramOne.toLowerCase().toCharArray();
        char[] charWordTwo = anagramTwo.toLowerCase().toCharArray();


        System.out.println(sol.IsAnagram(charWordOne, charWordTwo));
    

        


    }
}
