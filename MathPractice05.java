import java.util.Scanner;

public class MathPractice05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextInt();
        var s2 = sc.nextInt();
        var s3 = Math.min(s1,s2);
        System.out.println(s3);
    }
}
