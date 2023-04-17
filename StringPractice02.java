import java.util.Scanner;

public class StringPractice02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = s1.startsWith("http");
        System.out.println(s2);
    }
}