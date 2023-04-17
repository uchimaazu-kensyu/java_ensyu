import java.util.Scanner;

public class StringPractice04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = s1.matches("\\d{3}");
        System.out.println(s2);
    }
}