import java.util.*;
public class DaysInAMonth {
    /**
     * A Number of Days in a Month calculator using a switch statement
     * Created 20-Apr-2018 by Silviu
     */
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        boolean searching = true;
        try {
            while (searching) {
                int nDays = 0;
                System.out.println("Insert number of month:");
                int monthIndex = scan.nextInt();

                if (monthIndex < 0 || monthIndex > 12) {
                    System.out.println("Invalid number of a month!");
                    searching = true;
                } else {
                    System.out.println("Insert year:");
                    int year = scan.nextInt();
                    String monthName = "";

                    switch (monthIndex) {
                        case 1:
                            monthName = "January";
                            nDays = 31;
                            break;
                        case 3:
                            monthName = "March";
                            nDays = 31;
                            break;
                        case 4:
                            monthName = "April";
                            nDays = 30;
                            break;
                        case 5:
                            monthName = "May";
                            nDays = 31;
                            break;
                        case 6:
                            monthName = "June";
                            nDays = 30;
                            break;
                        case 7:
                            monthName = "July";
                            nDays = 31;
                            break;
                        case 8:
                            monthName = "August";
                            nDays = 31;
                            break;
                        case 9:
                            monthName = "September";
                            nDays = 30;
                            break;
                        case 10:
                            monthName = "October";
                            nDays = 31;
                            break;
                        case 11:
                            monthName = "November";
                            nDays = 30;
                            break;
                        case 12:
                            monthName = "December";
                            nDays = 31;
                            break;
                        case 2:
                            monthName = "February";
                            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                                nDays = 29;
                            } else {
                                nDays = 28;
                            }
                            break;
                        //daca (year este divizibil cu 4) si (year nu este divizibil cu 100 - asta e pentru anul 1000) atunci (an bisect)
                        //altfel daca (year este divizibil cu 400) atunci (an bisect), altfel (an obisnuit)

                    }
                    System.out.println(monthName + " " + year + " has " + nDays + " days.");
                }
                boolean answering = true;
                while (answering) {
                    System.out.println("Would you like to try again?(Yes/No)");
                    String answer = scan.next();
                    if (answer.equals("Yes")) {
                        answering = false;
                        searching = true;
                    } else if (answer.equals("No")) {
                        System.out.println("Goodbye!");
                        return;
                    } else {
                        System.out.println("Incorect answer!");
                        answering = true;
                    }
                }
            }
        }
            catch (Exception e) {
                System.out.println("Not a valid month or year! Please run again");
        }
     }
   }

