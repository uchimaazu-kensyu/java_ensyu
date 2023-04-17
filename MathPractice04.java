import java.util.Scanner;

public class MathPractice04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextInt();
        var s2 = sc.nextInt();
        var s3 = Math.max(s1,s2);
        System.out.println(s3);
    }
}
