import java.util.Scanner;

public class StringPractice03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = s1.indexOf("s");
        System.out.println(s2);
    }
}