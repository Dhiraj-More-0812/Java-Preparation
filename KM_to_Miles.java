import java.util.Scanner;
public class KM_to_Miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of kilometers you want to convert it into miles");
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println("So, the miles of " + km +" kilometers is " + miles);

    }
}
