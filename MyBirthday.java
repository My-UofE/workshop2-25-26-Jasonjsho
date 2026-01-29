// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        int currentDay = Integer.parseInt(args[0]);
        int currentDate = Integer.parseInt(args[1]);
        int myBirthdayDate = Integer.parseInt(args[2]);

        // value below is a constant
        final int DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday 
        int num_of_days_to_bday = myBirthdayDate - currentDate;

        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        int bday_day = (currentDay+num_of_days_to_bday)%DAYS_A_WEEK;

        // 3. Display the result
        System.out.println("Birthday falls on: " + bday_day);

    }
}