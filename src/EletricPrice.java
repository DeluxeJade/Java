import java.util.Scanner;

public class EletricPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        double total  = scanner.nextDouble();
        if(total < 0) System.out.println("Invalid number");
        if(total <= 50) {
            System.out.println("Số kwh đã sử dụng: " + total);
            System.out.println("Tiền điện phải trả: " + total*1800);
        } else if (50 < total && total <= 100) {
            System.out.println("Số kwh đã sử dụng: " + total);
            System.out.println("Tiền điện phải trả: " + (50*1800+(total - 50)*2300));
        } else {
            System.out.println("Số kwh đã sử dụng: " + total);
            System.out.println("Tiền điện phải trả: " + (50*1800+50*2300) + (total -100)*3000);
        }
        scanner.close();
    }


}
