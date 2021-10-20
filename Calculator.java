import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double result = 0.0;
        double calcSum = 0;
        double calcNum = 0;
        double calcAvg = 0;
        double num1;
        double num2;
        while (0 == 0) {
            System.out.println("Current Result: " + result);
            System.out.println("\nCalculator Menu \n---------------\n0. Exit Program \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exponentiation \n6. Logarithim \n7. Display Average\n\nEnter Menu Selection: ");
            int chosenOp = scnr.nextInt();
            if (chosenOp == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
                System.exit(0);
            }
            if (chosenOp == 1) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 + num2;
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 2){
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 - num2;
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 3) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 * num2;
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 4) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = num1 / num2;
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 5) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = Exponentiate(num1, num2);
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 6) {
                System.out.println("Enter first operand: ");
                num1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                num2 = scnr.nextDouble();
                result = Logarithimate(num1, num2);
                calcSum += result;
                calcNum++;
            } else if (chosenOp == 7) {
                calcAvg = calcSum / calcNum;
                System.out.println("Sum of calculations: " + calcSum);
                System.out.println("Number of calculations: " + calcNum);
                System.out.println("Average of calculations: " + calcAvg);
            } else {
                System.out.println("Error: Invalid selection!");
            }
        }

    }
    //need to make num1 multiply itself exactly numCopy times
    public static double Exponentiate(double num1, double num2) {
        double result = 0;
        double num1Copy = num1;
        if (num2 > 0) {
            for (int i = 1; i < (num2); i++) {
                num1 = num1 * num1Copy;
            }
            result = num1;
        }
        if (num2 == 0) {
            result = 1;
        }
        if (num2 < 0) {
            for (int i = -1; i > (num2); i--) {
                num1 = num1 * num1Copy;
            }
            result = 1/num1;
        }
        return result;
    }
    public static double Logarithimate(double num1, double num2) {
        double result = 0;
        if (num2 > 0) {
            for (double i = 0; i < num2; i += 0.0001) {
                if ((Exponentiate(num1,i) + 0.1 > num2) && (Exponentiate(num1,i) - 0.1 < num2)) {
                    result = i;
                    break;
                }
            }
        }
        if (num2 < 0) {

        }
        return result;
    }
}
