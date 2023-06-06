class lengthOfLastWord {

    public void getLength(String words){
        String[] myWords = words.split(" ");

        for (int i = 0; i < myWords.length; i++){
            System.out.println(myWords[i]);
        }
    }

    public static void Main(String[] args){
        // return the length of the last word

        // Input: s = "Hello World"
        // Output: 5
        // Explanation: The last word is "World" with length 5.


        // Input: s = "   fly me   to   the moon  "
        // Output: 4
        // Explanation: The last word is "moon" with length 4.

        // 1. if there is a split 

        String words = "   fly me   to   the moon  ";

        lengthOfLastWord solution = new lengthOfLastWord();
        solution.getLength(words);


    }
    
}
