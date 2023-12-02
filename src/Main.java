import Model.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Напишите две цифры и знак +, -, * или /");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
            firstNum = scanner.nextDouble();
            secondNum = scanner.nextDouble();
            operator = scanner.next().charAt(0);

            Calculator calculator = new Calculator(operator, firstNum, secondNum );
            System.out.println(calculator.makeCalculation());
        }
    }
