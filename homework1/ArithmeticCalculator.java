
import java.util.*;

public class ArithmeticCalculator {
    /**
     * An arithmetic calculator using the switch statement for two numbers.
     * Created 20-Apr-2018 by Silviu
     */

    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        boolean computing = true;

        try {
            while (computing) {
                System.out.println("Insert first number:");
                double a = scan.nextDouble();
                System.out.println("Insert second number:");
                double b = scan.nextDouble();
                System.out.println("Insert operator:");
                String operator = scan.next();
                double result = 0;

                switch (operator) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    case "%":
                        result = a % b;
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        break;
                }
                System.out.println("Result is: " + result);

                System.out.println("New calculation?(Yes/No)");
                String answer = scan.next();
                if (answer.equals("Yes")) {
                    computing = true;
                }
                else if (answer.equals("No")) {
                    System.out.println("Goodbye");
                    return;
                }
                else{
                    System.out.println("Incorrect answer!");
                    return;
                }
            }
        }
        catch(Exception e) {
            //This catch block catches the exception
            System.out.println("Please insert numbers!");
        }
    }
}



