import java.util.Scanner;
public class CWH_18_C4_else_if_clause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age >50){
            System.out.println("Much experienced");
        }
        else if(age > 40){
            System.out.println("Experienced");
        }
        else if(age > 30){
            System.out.println("Somehow Experienced");
        }

    }
}
