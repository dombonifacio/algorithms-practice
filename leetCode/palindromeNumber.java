public class palindromeNumber {
    

    public void IsPalindrome(int num){

        String temp = Integer.toString(num);

        for (int i = 0; i < temp.length(); i++){
            System.out.println(temp.charAt(i));
        }
        


      
    }

    public static void main(String[] args){
        String word = "Hello";
        int nums = 45;


        
        // palindromeNumber sol = new palindromeNumber();

        // sol.IsPalindrome(nums);

        String originalStr = "Hello";
    

            
        for (int i = originalStr.length() - 1; i >= 0; i--) {
            System.out.println(originalStr.charAt(i));
        }
        
     
    }
}
