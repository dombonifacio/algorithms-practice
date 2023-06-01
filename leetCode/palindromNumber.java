package leetCode;

import java.util.*;

class palindromNumber {

    void IsPalindrome(int x){
         String temp = Integer.toString(x);
        // System.out.println(temp);

        char[] ch = temp.toCharArray();
        

        for (int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }

        // decrement the for loop, check if the original char matches with the decrementing loop. if it matches, return true, otherwise return false
    }

    public static void main(String[] args){
        System.out.println("Hello");
        palindromNumber solution = new palindromNumber();
        solution.IsPalindrome(36);
    }
}