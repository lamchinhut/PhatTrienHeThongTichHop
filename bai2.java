import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhập vào số cần kiểm tra số nguyên tố: \n");
       int n=sc.nextInt();
       if(kiemTraSoNguyenTo(n)){
           System.out.println(n+ "là số nguyên tố");
       }
       else{
           System.out.println(n+ "không là số nguyên tố");
       }
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
    
        return true;
    }
}
 
