import java.util.*;

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
                
            }
            
        }

        

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