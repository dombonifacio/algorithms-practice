import java.util.*;

public class Anagram {

    public boolean IsAnagram(char[] wordOne, char[] wordTwo){


        // only one letter can be used once, once the first letter has been found
        

        // convert char array to arrayList for easier implementation of deleteion element
        ArrayList<Character> copyArrOne = new ArrayList<Character>();
        ArrayList<Character> copyArrTwo = new ArrayList<Character>();

        // insert the letters to copied array
        for (char letter : wordOne){
            copyArrOne.add(letter);
        }

        for (char letter : wordTwo){
            copyArrTwo.add(letter);
        }


        // if sizes don't match, return false
        if (copyArrOne.size() != copyArrTwo.size()){
            return false;

        }

       
        // might cause a char overflow 
        for (int i = 0; i < copyArrOne.size(); i++){
        
            for (int j = 0; j < copyArrTwo.size(); j++){
                if (copyArrOne.get(i) == copyArrTwo.get(j)){
                    // if letter matches, delete the letter from wordTwo array
                    copyArrTwo.remove(j);
                    // make sure to break out of the inner loop once found
                    break;
                    
                
                    
                } 


                
                
            }
            
        }
        // will return a boolean if array is either empty or not
        return copyArrTwo.isEmpty();
      
       
    }


    public char[] ConvertToCharArr(String word){


        char[] charWord = word.toCharArray();

        return charWord;
    }

    public static void main(String[] args){
          
        Anagram sol = new Anagram();
        String anagramOne = "anagram";
        String anagramTwo = "nagaram";
        

        // Our char array words
        char[] charWordOne = anagramOne.toLowerCase().toCharArray();
        char[] charWordTwo = anagramTwo.toLowerCase().toCharArray();

        System.out.println(sol.IsAnagram(charWordOne, charWordTwo));
    
        
        


    }
    
}
