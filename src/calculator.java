import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, option, ex;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice from following");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
        option = sc.nextInt();
        if (option != 5) {
            System.out.println("Enter the first number");
            num1 = sc.nextInt();
            System.out.println("Enter the second number");
            num2 = sc.nextInt();

        }
        switch (option) {
            case 1:
                System.out.println("Addition  of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of" +num1+ "and" +num2 + "is" +(num1+num2));
                break;
            default:
                System.out.println("invalid");
        }

    }


}


