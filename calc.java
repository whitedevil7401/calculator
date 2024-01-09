import java.util.*;
public class calc {
    public static void main (String []args){
        double num1 , num2;

        Scanner first = new Scanner (System.in);
        System.out.println("enter the number ");
        num1 = first.nextDouble();
        num2 = first.nextDouble();

        System.out.println("enter the operator(+,-,/,*,)");
        char operator = first.next().charAt(0);
        double result = 0;

        switch (operator)
        {
            case '+':
            result = num1 + num2;
            break;

            case '-':
            result = num1 - num2;
            break;

            case '*':
            result = num1 * num2;
            break;

            default :
            System.out.println("wrong");
        }

            System.out.println("the final result");
           
            System.out.println();

            System.out.println(num1 + " "+ operator +" "+num2+ " " + "=" + result);
        //rajveer singh
    }
    
}
