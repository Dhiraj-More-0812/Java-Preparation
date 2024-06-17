import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("input first integer");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        int num1 = sc.nextInt();
        System.out.println("input first float value");
        float f3 = sc.nextFloat();
        System.out.println("input second integer");
        int num2 = sc.nextInt();
        System.out.println("input second float value");
        float f2 = sc.nextFloat();
        int sum = num1 + num2;
        float sum2 = f3+f2;
        System.out.print("the sum of entered integers is : ");
        System.out.println(sum);
        System.out.print("sum of entered float vlaues is :");
        System.out.println(sum2);
        System.out.println("Enter a string");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("Enter string 2");
        String str2 = sc.nextLine();
        System.out.println(str2);


    }
}
