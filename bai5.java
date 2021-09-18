import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        System.out.println("nhập vào số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double arr[] = new double[n];
        double tong = 0;

        for(int i=0;i<n;i++){
            System.err.println("nhập phần tử thứ "+(i+1)+": ");
            arr[i]=sc.nextDouble();
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                tong+=arr[i];
            }
        }
        
        System.out.println("tổng các số dương của dãy số thực: "+tong);


        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]+ "\t");
        // }
    }


}
