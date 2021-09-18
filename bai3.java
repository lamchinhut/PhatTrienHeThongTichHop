import java.util.Scanner;
import static java.lang.Math.sqrt;
public class bai3 {
    public static void main(String[] args) {
        float a, b, c;
        float x1, x2, denta;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a= ");
        a=sc.nextFloat();
        System.out.println("nhập số b= ");
        b=sc.nextFloat(); 
        System.out.println("nhập số c= ");
        c=sc.nextFloat();

        //tính Denta
        denta= (b*b-4*a*c)/(2*a);
        if(denta<0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if(denta==0){
            x1=x2=(-b/(2*a));
            System.out.println("Phương trình có nghiệm kép x1=x2= "+x1);
        }
        else{
            x1 = (float) ((-b + sqrt(denta))/(2*a));
            x2 = (float) ((-b - sqrt(denta))/(2*a));
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1="+x1+"   x2= "+x2);
        }
    }
}
