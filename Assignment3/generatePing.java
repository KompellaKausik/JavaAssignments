package Assignment3;




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class takeInputs{
    private Scanner sc = new Scanner(System.in);
    public String inputURL(){
        System.out.println("enter URL to ping");
        return sc.next();
    }

}


class PingUrl{
    ArrayList<Float> times = new ArrayList<>();
    void ExecutePingRequest(String command){

        try {
            Process pingProcess = Runtime.getRuntime().exec(command);  // this process executes a system command
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(pingProcess.getInputStream()));

            String s = "";
            boolean f= false;
            int count=0;

            while ((s = inputStream.readLine()) != null && count<5) {
                if(f){
                    count++;
                 times.add(Float.parseFloat(s.split(" ")[7].split("=")[1]));                       // printing the output generated from ping
                }
                else
                    f=true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void printMedian(){             // this method will return the median of the times

        Collections.sort(times);
        int size = times.size();
        if(size%2==0){
            System.out.println((times.get(size/2)+times.get((size/2)+1))/2);
        }
        else
            System.out.println("median of times is "+(times.get(size/2)));
    }

   void testForMedian(String ip){
       ExecutePingRequest("ping -c 5 "+ip);
       printMedian();
   }
}

public class generatePing {

    public static void main(String[] args) {

        //String ip = "google.com";
        takeInputs t = new takeInputs();
        String ip = t.inputURL();
        PingUrl p = new PingUrl();
        p.testForMedian(ip);

    }
}