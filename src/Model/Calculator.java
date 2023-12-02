package Model;

import Service.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private char operation;
    private double num1;
    private double num2;
    private Map<Character, Operation> operationMap = new HashMap<>();



    public Calculator(char operation, double num1, double num2) {
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
            System.out.println(operationMap.get(operation));
        } else {
            System.out.println("Invalid sign");
        }
        return operationMapValue.calculateResult(num1, num2);
    }
}
