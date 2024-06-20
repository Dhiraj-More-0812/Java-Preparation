import java.util.Scanner;
public class Comparison_user_value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 89;
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        boolean b1 = num2>num1;
        System.out.println("So, the number which is entered by user is greater than given is : " + b1);
    }
}
