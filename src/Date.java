import java.util.Scanner;

public class Date {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a month (1-12): ");
        String month  = "";
        Scanner scanner;
        int userMonth = sc.nextInt();
        if (userMonth == 1 ) {
            month = "January";}
            else if (userMonth == 2) {
                month = "February";}
            else if (userMonth == 3){
                month = "March";}
            else if (userMonth == 4) {
                month = "April";}
            else if (userMonth == 5) {
                month = "May";}
            else if (userMonth == 6){
                month ="June";}
            else if (userMonth == 7){
                month = "July";}
            else if (userMonth == 8) {
                month ="August";}
            else if (userMonth == 9){
                month = "September";}
            else if (userMonth == 10) {
                month = "October";}
            else if (userMonth == 11) {
                month = "November";}
            else if (userMonth == 12) {
                month = "December";
        }

            // End - Section for handling the months!!!
        // Section for day!
        System.out.println("Please enter the day of the month: ");
         int dayOfMonth = sc.nextInt();
         // end - section for day
        sc.nextLine();
        // Section for year
        String year = "20";
        System.out.println("Please say the year (20xx): ");
        String userYear = sc.nextLine();
        year = year + userYear;
        //end - section for year

        //Print out the date!
        String message = "It is" + month + " " + dayOfMonth +
                ", " + year;
        System.out.println(message);


    }
}
