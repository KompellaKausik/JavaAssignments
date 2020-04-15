package Assigment8;
import java.util.*;

class takeInputs{
    Scanner sc = new Scanner(System.in);
    String enterDetails(){
        return sc.next();
    }
}

class validateDetails{

    void entryClearance(String pass, String ageValidity, String attire)  {
        try {
            if (!pass.equals("yes"))
                throw new InvalidPassException("no valid pass");
            if(!ageValidity.equals("yes"))
                throw new  UnderAgeException("under age");
            if(!attire.equals("yes"))
                throw  new UnAppropriateAttireException("You need to have mentioned attire to attend");

        }
        catch(InvalidPassException  | UnderAgeException  | UnAppropriateAttireException e ){
            System.out.println("Entry denied dure to "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Sorry please come next time");
        }
    }

}

public class PartEntry {

    public static void main(String[] args){
        takeInputs t =new takeInputs();
        String pass = t.enterDetails();
        String ageValidity = t.enterDetails();
        String attire = t.enterDetails();
        validateDetails vd = new validateDetails();
        vd.entryClearance(pass,ageValidity,attire);
    }

}
