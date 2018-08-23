import java.text.ParseException;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.*;

public class Main {

    public static void main(String[] args) {


        String match_details[]={"ManU(Home) - Chelsea ~ [Normal]","ManU(Home) - Arsenal ~ [Boxing Day]","Chelsea(Home) - ManCity ~ [New Year]","Liverpool - Chelsea ~ [Normal]","Arsenal(Home) - Liverpool ~ [Normal]"};




        String temphold = match_details[0];
        match_details[0] = match_details[4];
        match_details[4] = temphold;


        String temphold2 = match_details[0];
        match_details[0] = match_details[1];
        match_details[1] = temphold2;

        String temphold3 = match_details[2];
        match_details[2] = match_details[3];
        match_details[3] = temphold3;



        for (int x = 0; x<match_details.length;x++){
            match_details[x] = match_details[x].replace('~','-');
            System.out.println(match_details[x]);
        }
        setMatchDate();


    }

    public static String setMatchDate(){

        Thread thread1 = new Thread(new RunnableThread(),"thread1");
        thread1.start();

        try {
            //delay for one second
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
        }
        //Display info about the main thread
        /*System.out.println(Thread.currentThread());
        System.out.println("Thread 1 started"+" "+Thread.currentThread());*/




        Scanner scanner2 =  new Scanner(System.in);
        System.out.println("\n Enter Date \n Format:(yyyy-MM-dd)\n");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date testDate = null;
        String date = scanner2.next();
        System.out.println(date);
        try{
            testDate = df.parse(date);
        } catch (ParseException e){ System.out.println("invalid format");}

        if (!df.format(testDate).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n Enter the desired Team:\n");
        String dTeam = scanner3.next();

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
        String newDate = dateFormat.format(testDate);
        setPairTeam(dTeam,newDate);
        return null;
    }
    public static String setPairTeam(String team, String dDay){

        System.out.println("You are playing: \n"+dDay + " - " + "[" +team + "]");

        return null;
    }

    public static int setMatchDetails(int details){
        return details;
    }
}
