import java.util.Scanner;

import static java.lang.Math.sqrt;
public class Diem {
    int x,y;
    Scanner sc = new Scanner(System.in);
    public Diem(int x, int y){
        this.x = x;
        this.y = y;
    }

    //phuong thuc gan toa do cho x,y
    public Diem(){
        this.x = 0;
        this.y = 0;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    //phuong thuc nhap toa do
    public void nhapToaDo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x= ");
        x=sc.nextInt();
        System.out.println("nhập y= ");
        y=sc.nextInt();
    }

    //phuong thuc in ra man hinh toa do theo dang (X,y)
    public void inToaDo(){
        System.out.println("tọa độ (x,y) là: "+ "(" + x+ ","+ y+ ")");
    }

    //phuong thuc tinh khoang cach tu diem do den goc toa do (0,0)
    public double tinhToaDO(){
        double kc = sqrt(x*x+y*y);
        return kc;
    }


    public static void main(String[] args) {
        Diem toaDo = new Diem();
        toaDo.nhapToaDo();
        toaDo.inToaDo();
        System.out.println("khoang cach tu diem den goc toa do: "+toaDo.tinhToaDO());
    }
}
