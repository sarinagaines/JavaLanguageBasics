/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgfx8languagebasicss20;

import java.util.Calendar; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author  Sarina Gaines
 *          Sgfx8
 *          01/31/2020
 *          Challenge 3: Language BasicsS20
 * 
 */
public class Sgfx8LanguageBasicsS20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char c1 = 'D'; 
        char c2 = 68; 
        
        short qualityScore = 89; 
        
        float weight = 154.7f; 
        float height = 70.87f;
        
        boolean sunny = true; 
        boolean warm = false; 
        
 
        
        /* http://www.java2s.com/Code/JavaAPI/java.util/CalendarHOUROFDAY.html*/
        Calendar current = Calendar.getInstance(); 
        int hour = current.get(Calendar.HOUR_OF_DAY); 
        int minute = current.get(Calendar.MINUTE);  
        
        String greeting = "Hello"; 
        String myPawPrint = "Sgfx8"; 
        
        if(c1 == c2)
        {
            System.out.println(c1 + " and " + c2 + " are the same.\n"); 
        }
        else
        {
            System.out.println(c1 + " and " + c2 + " are NOT the same. \n"); 
        }
        
        
        if(qualityScore >= 0 && qualityScore <=60)
        {
            System.out.println("The quality is bad.\n"); 
        }
        else
        {
            System.out.println("Good quality.\n"); 
        }
        
       
        /* how to square https://alvinalexander.com/java/how-square-number-in-java-method-function*/
        float bmi =  (float) ((float)(weight * 703)/ (Math.pow(height,2)));
       
        System.out.print("My BMI = "); 
        System.out.printf("%.2f", bmi ); 
        System.out.println("\n"); 
        
        
        if(sunny == true && warm == true)
        {
            System.out.println("Go hiking. \n"); 
         
        }
        else if(sunny == false && warm == true)
        {
            System.out.println("Go barbeque. \n"); 
        }
        else
        {
            System.out.println("Stay Home. \n"); 
        }
        
        switch(hour)
        {
            /*https://javarevisited.blogspot.com/2013/02/add-leading-zeros-to-integers-Java-String-left-padding-example-program.html
            adding leading zeros to time
            */
            case 5:
            case 6: 
            case 7: 
            case 8:
            case 9: 
            case 10:
                 System.out.printf("The current time is %02d:%02d in the MORNING.\n", hour, minute);
                break; 
            case 11:
            case 12: 
            case 13: 
            case 14:
            case 15: 
            case 16:
                System.out.printf("The current time is %02d:%02d in the AFTERNOON.\n", hour, minute);
                break; 
            case 17:
            case 18: 
            case 19: 
            case 20:
            case 21: 
            case 22:
                System.out.printf("The current time is %02d:%02d in the EVENING.\n", hour, minute);
                break; 
            case 23: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
                System.out.println("The current time is " + hour + ":" + minute + " in the NIGHT.\n"); 
             
            default: 
                System.out.println("You have the wrong time.\n"); 
                
        }
        
        for(int i = 3; i <= 9; i++)
        {
            if(i%2 == 0)
                System.out.println("Count:" + i);      
        }
        System.out.println("\n"); 
        
        int countDown = 3; 
        while(countDown>0)
        {
            System.out.println("Count Down:" + countDown); 
            countDown--; 
            
            if(countDown == 0)
                System.out.println("Houston, we have a lift off! \n"); 
            
        }
        
        invokeMe(greeting, myPawPrint); 
    }
        public static void invokeMe(String greeting, String pawPrint){
        
    
        
        /* figured out how to format date and create date from the website below: 
            https://mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
          
          read up more on how to format and add AM/PM from the website below:
          https://stackoverflow.com/questions/18734452/display-current-time-in-12-hour-format-with-am-pm*/
        
         DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a"); 
         Date date = new Date();
         
         System.out.println(greeting + ", my pawprint is " + pawPrint + " and today's date is " + sdf.format(date)); 
    }
    
}
