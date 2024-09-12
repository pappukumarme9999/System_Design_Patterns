package Interpreter_Pattern;

public class Client {
    public static void main(String[] args) {
        Expression firstNumber = new NumberExpression(5);
        Expression secondNumber = new NumberExpression(3);
        Expression addExpression = new AddExpression(firstNumber, secondNumber);

        System.out.println("Result: " + addExpression.interpret());  // Output: 8
    }
}
