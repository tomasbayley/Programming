import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.println("Enter a number");
        int number = scan.nextInt();
        for(int i = 0; i<=number; i++){
            System.out.println(i);
        }

        scan.close();
    }
}
