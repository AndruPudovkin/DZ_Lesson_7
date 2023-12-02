package Service;

public class Addition implements Operation{

    @Override
    public double calculateResult(double num1, double num2) {
        return num1+num2;
    }
}
