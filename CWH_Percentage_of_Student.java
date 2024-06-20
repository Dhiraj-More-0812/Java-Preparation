import java.util.Scanner;
public class CWH_Percentage_of_Student {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the out of marks for subjects");
        int outof = sc.nextInt();
        System.out.println("Enter the marks for 1st Subject");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks for 2nd subject");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks for 3rd subject");
        int s3 =sc.nextInt();
        System.out.println("Enter the marks for 4th subject");
        int s4 =sc.nextInt();
        System.out.println("Enter the marks for 5th subject");
        int s5 = sc.nextInt();
        float sum = s1 + s2+s3+s4+s4;
        float total = outof * 5;
        float percentage = (sum/total)*100;
        System.out.print("The total percentage of Student is : ");
        System.out.println(percentage);
    }
}
