package Assignment4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class takeInputs {
    String[] inputDates() {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        String[] inputLine = new String[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
             inputLine[i]= sc.nextLine();
        }
        sc.nextLine();
        return inputLine;
    }
}


class DateRange{

    private SimpleDateFormat simpleDateFormat;
    private Date signUpDate;
    private Date currentDate;
    private String kycFormattedStartDate;
    private String kycFormattedEndDate;
    private String currentDateFormatted;




    void findRange(String sdate, String cdate) throws Exception {
        this.simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        signUpDate = simpleDateFormat.parse(sdate);
        currentDate = simpleDateFormat.parse(cdate);
        if(signUpDate.after(currentDate))
            System.out.println("No Range");
        else
            System.out.println(getRange(signUpDate,currentDate));
    }

    String  getRange(Date signUpDate, Date currentDate) throws Exception{
        @SuppressWarnings("deprecation")
        int currentYear = currentDate.getYear();
        Date kycStartDate = addDays(signUpDate, -30);
        Date kycEndDate = addDays(signUpDate, +30);

        kycFormattedStartDate = simpleDateFormat.format(kycStartDate);
        kycFormattedEndDate = simpleDateFormat.format(kycEndDate);
        currentDateFormatted = simpleDateFormat.format(currentDate);

        if (currentDate.after(kycStartDate) && currentDate.before(kycEndDate))
            return kycFormattedStartDate + " " + currentDateFormatted;
        else
            return kycFormattedStartDate + " " + kycFormattedEndDate;
    }
    public Date addDays(Date date, int days) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        date = calendar.getTime();
        return date;
    }
    }





public class DateWithinRange {

    public static void main(String[] args) throws Exception {
        DateRange d = new DateRange();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String[] signUpDate = new String[n];
        String[] curDate = new String[n];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                signUpDate[count1] = sc.next();
                count1++;
            } else {
                curDate[count2] = sc.next();
                count2++;
            }
        }
        for (int i = 0; i < n; i++)
            d.findRange(signUpDate[i], curDate[i]);

    }

}
