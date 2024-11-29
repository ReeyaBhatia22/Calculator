import java.util.Scanner;
public class calculator
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int operation = sc.nextInt();
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        
        switch(operation)
        {
           case 1: System.out.println(num1+num2);
           break;
           case 2: System.out.println(num1-num2);
           break;
           case 3: System.out.println(num1*num2);
           break;
           case 4: System.out.println(num1/num2);
           break;
        }
        sc.close();
    }
}