import java.util.Scanner;

public class Cash_transfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your cash value: ");
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Input your cash type (VND/USD): ");
        String type = scanner.nextLine();
        double transValue;
        if(type.equals("VND") || type.equals("USD")) {
            transValue = type.equals("VND") ?  value/23000 : value*23000;
            System.out.println(transValue);
        } else {
            System.out.println("This currency is not supported");
        }
        scanner.close();
    }
}
