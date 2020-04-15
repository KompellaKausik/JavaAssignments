package Assigment9;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class takeInputs{
    Scanner sc = new Scanner(System.in);
    String inputSentence(){
        return sc.nextLine();
    }

}

class RegexCheck{

    void CheckConditions(String input){
        Pattern pattern =Pattern.compile("^[A-Z].*[.]$");
        Matcher match =pattern.matcher(input);
        if (match.matches()) {
            System.out.println("pattern matched");
        } else {
            System.out.println("pattern did not match");
        }

    }

}

public class MatchPattern {

    public static void main(String[] args){
        takeInputs t = new takeInputs();
        String input = t.inputSentence();
        RegexCheck rc =new RegexCheck();
        rc.CheckConditions(input);
    }

}
