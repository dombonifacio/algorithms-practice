import java.util.*;

<<<<<<< HEAD
class Anagram {

    

    
    public boolean IsAnagramOne(char[] arr1, char[] arr2){

       // ['t', 'e', 'a'] - - ['e', 'a', 't']

       // convert 

       // either make a counter to count how many letters matched or decrement an index

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[i]){
                    // word 1 letter matches with word 2 letter, remove that specific index from arr2
                    
                }
=======
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


                
>>>>>>> 3aef93af8929215c520b98ea75d34f88c0dcfd9f
                
            }
            
        }
<<<<<<< HEAD

        

        return false;
    }

    public char[] ToCharArr1(String word){
        char[] arr = {'h'};

        return arr;
    }

    


    public static void main(String[] args){
        // char[] arr = {'t', 'e', 'a'};
        String word1 = "Eat".toLowerCase();
        String word2 = "Tea".toLowerCase();



        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Anagram sol = new Anagram();
        sol.IsAnagramOne(arr1, arr2);

       
    }
}
=======
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
>>>>>>> 3aef93af8929215c520b98ea75d34f88c0dcfd9f
