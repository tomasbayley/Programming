import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("1. Pick a number to count by: ");
        int step = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int from = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int to = scan.nextInt();
        
        for(int i = from; i<=to; i+= step){
            System.out.println(i);
        }


       // See detailed instructions on Learn the Part.

        scan.close();
    }
}
