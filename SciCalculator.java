import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double currentResult = 0.0;
        double personTotal = 0.0;
        double numCount = 0;

        // this block of code prompts the user to make their first selection from the menu

        System.out.println("Current Result: " + currentResult);
        System.out.println("");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("");

        //this while loop will continue to execute until the user asks to exit with the number 0
        while (currentResult >= -1000000000 && currentResult <= 1000000000) {
            System.out.print("Enter Menu Selection: ");

            int personNumber;
            personNumber = keyboard.nextInt();
            double finalNum = 0.0;
            double firstNum;
            double secondNum;

            //the next three blocks of code are for the special cases from the menu: an invalid number, 0, or 7
            //these cases are special because they do not prompt the user with the menu everytime.

            //the first if block will tell the user that there was an error if they do not pick a valid number from the list
            if (personNumber < 0 || personNumber > 7) {
                System.out.println("Error: Invalid selection!");
            }
            //this else if statement is the only option to break out of the loop
            else if (personNumber == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }
            //this else if statement contains the codes that should be followed if the user chooses the average option
            else if (personNumber == 7) {
                if (numCount == 0) {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println(" ");
                }
                else {
                    System.out.println("Sum of calculations: " + personTotal);
                    System.out.println("Number of calculations: " + (int) numCount);
                    double totalAverage;
                    totalAverage = personTotal / numCount;
                    double personAverage;
                    personAverage = Math.round(totalAverage*100.0)/100.0;
                    System.out.println("Average of calculations: " + personAverage);
                }
            }


            //the rest of the options from the menu are contained in this if else statement
            // because they prompt the user with the menu everytime.
            else if (personNumber >= 1 && personNumber <= 6) {
                    //this if block performs addition
                    if (personNumber == 1) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = firstNum + secondNum;
                    //this if block performs subtraction
                    } else if (personNumber == 2) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = firstNum - secondNum;
                    //this if block performs multiplication
                    } else if (personNumber == 3) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = firstNum * secondNum;
                    //this if block performs division
                    } else if (personNumber == 4) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = firstNum / secondNum;
                    //this if block performs exponentiation (powers)
                    } else if (personNumber == 5) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = Math.pow(firstNum, secondNum);
                    //this if block performs the logarithm fuction
                    } else if (personNumber == 6) {
                        System.out.print("Enter first operand: ");
                        firstNum = keyboard.nextDouble();
                        System.out.print("Enter second operand: ");
                        secondNum = keyboard.nextDouble();
                        finalNum = Math.log(secondNum) / Math.log(firstNum);
                    }

                currentResult = finalNum;

                    //the menu is added again so that it prompts the user after they find a result
                    System.out.println("Current Result: " + currentResult);
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //increment numCount and create a running total of values for the average section
            numCount = numCount + 1;
            personTotal = personTotal + finalNum;
        }
    }
}


