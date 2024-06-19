import java.util.Scanner;
public class Whether_int_or_not {
    public static void main(String[] args){
        System.out.println("Enter the integer value");
        Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
