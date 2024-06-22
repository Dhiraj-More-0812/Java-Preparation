import java.util.Scanner;
public class CWH_13_Strings {
    public static void main(String[] args) {
        int a = 10;
        float b =20.45f;
        String str1= "New world!!";
        System.out.println(str1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str2 = sc.next();
        System.out.println(str2);
        System.out.println("Enter a string");
        String str3 = sc.nextLine();
        System.out.println(str3);
        System.out.format("Integer a is %d and integer b is %f",a,b);
    }
}
