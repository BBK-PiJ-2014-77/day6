import java.lang.Integer;
import java.lang.String;
import java.lang.System;

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("What is the first value");
        String st1 = System.console().readLine();
        int nu1 = Integer.parseInt(st1);
        System.out.println("What is the second value");
        String st2 = System.console().readLine();
        int nu2 = Integer.parseInt(st2);

        Calculator Calc = new Calculator(nu1, nu2);
        int Answer = Calc.Add();
        System.out.println(Answer);
    }
}
