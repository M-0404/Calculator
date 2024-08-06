import java.util.*;
public class main {
    public static void main(String []args)
    {
        Scanner sambit=new Scanner(System.in);
        double number1,number2;
        System.out.println("Enter the 1st Number = ");
        number1=sambit.nextDouble();
        System.out.println("Enter the 2nd Number = ");
        number2=sambit.nextDouble();
        char ch;
        String str;
        System.out.println("Enter the type of Artithmetic Operation you want to perform = ");
        str=sambit.next();
        ch=str.charAt(0);
        switch(ch){
            case '+':
                double sum;
                sum=number1+number2;
                System.out.println("Addition of "+number1+" & "+number2+" is = "+sum);
                break;
            case '-':    
                double sub;
                sub=number1-number2;
                System.out.println("Subtraction of "+number1+" & "+number2+" is = "+sub);
                break;
            case '*':    
                double mul;
                mul=number1*number2;
                System.out.println("Multiplication of "+number1+" & "+number2+" is = "+mul);
                break;
            case '/':    
                double div;
                div=number1/number2;
                System.out.println("Division of "+number1+" & "+number2+" is = "+div);
                break;
            default:
                System.out.println("inavalid Input of Operator, Please try again !!!");
                break;
        }

    }
}
