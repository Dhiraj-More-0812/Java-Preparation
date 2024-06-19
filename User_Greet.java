import java.util.Scanner;
public class User_Greet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello user, Kindly enter your name");
        String name1 = sc.nextLine();
        System.out.println("Hello " + name1 + " have a great day");
    }
}
