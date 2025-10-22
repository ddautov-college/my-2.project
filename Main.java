import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        char b = scanner.nextLine().charAt(0);

        System.out.println(a.indexOf(b));

    }
}