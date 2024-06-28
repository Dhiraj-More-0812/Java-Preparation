import java.util.Scanner;
public class CWH_15_PS3_Q3 {
    public static void main(String[] args) {
        String letter = "Dear name. Thanks a lot";
        System.out.println("Enter the guy name you wanna thank");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(letter.replace("name",name));
    }
}
