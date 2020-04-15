package Assignment2;

/*
      I gave two solutions one with time complexity O(nm) and space complexity O(1)
      another one with time complexity O(n) and space complexity O(m) (where m is the number of unique letters)

 */


import java.util.HashSet;
import java.util.Scanner;

class takeInputs{

    private Scanner sc = new Scanner(System.in);
    public String inputLine(){
        System.out.println("Enter a sentence");
        return sc.next();
    }

}

class CheckAlphabets {


//     boolean checkInputString(String input) {
//         String StringtoCompare = input.toLowerCase();
//         for (char c = 'a'; c <= 'z'; ++c) { //looping through all the letters and checking whether they are present or not
//             if (!StringtoCompare.contains(c + "")) {
//                 return false;    // return false if a letter is not present
//             }
//         }
//         return true;
//     }

    boolean checkInputString(String input){

        HashSet<Character> set = new HashSet<>(); //hashset to store characters
        for(int i = 0; i<input.length();i++){
            set.add(input.charAt(i));   // looping through all the characters and adding them to hashset
        }
        if(set.size()==26) // as hash set doesnt store duplicate characters if length is 26 then all the alphabets are present
             return true;
        else
            return false;

    }

}

public class CheckAllAlphabets {

        public static void main(String[] args) {
            CheckAlphabets c = new CheckAlphabets();
            takeInputs t = new takeInputs();
            String input = t.inputLine();  // take string input
            if(c.checkInputString(input)){ // checking whether the sentence contains all the alphabets or not
                System.out.println("input contains all the alphabets");
            }
            else
                System.out.println("input does not contains all the alphabets");
        }

}
