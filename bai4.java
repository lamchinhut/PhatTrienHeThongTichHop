import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        float n;
        float sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào n= ");
        n=sc.nextFloat();
       if(n<0){
           System.out.println("n phải lớn hơn 0");
       }
       for(int i=1;i<=n;i++){
           sum+=i;
       }
       System.out.println("tổng các số= "+sum);
    }
}
