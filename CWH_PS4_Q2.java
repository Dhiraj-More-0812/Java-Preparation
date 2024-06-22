import java.util.Scanner;
public class CWH_PS4_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks of 2nd subject");
        int sub2 = sc.nextInt();
        System.out.println("enter marks of 3rd subject");
        int sub3 = sc.nextInt();
        float total1 = ((sub1 + sub2 + sub3) / 300f) * 100f;
        System.out.println(total1);
        if (total1 >= 40) {
            System.out.println("student is  passed  ");
            if (sub1 > 33) {
                System.out.println("Student is passed in sub 1");
                if (sub2 > 33) {
                    System.out.println("Student is passed in sub 2");
                    if (sub3 > 33) {
                        System.out.println("Student is passed in sub 3");
                    }
                } else {
                    System.out.println("Student failed");
                }
            }
        }
    }
}
