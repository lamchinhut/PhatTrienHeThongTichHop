import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("\nNhập vào chuỗi: \n");
        chuoi = sc.nextLine();
        System.out.println("Chuỗi sau khi đã in hoa: \n");
        System.out.println(chuoi.toUpperCase());
    }
}
