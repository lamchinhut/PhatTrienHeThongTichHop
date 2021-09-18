import java.util.Scanner;

public class PhanSo {

	int tu,mau;
	Scanner sc = new Scanner(System.in);
	public PhanSo() {
	}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	public void nhapPS(String x) {
		System.out.println("Nhap vao tu so:");
		tu =sc.nextInt();
		System.out.println("Nhap vao mau so:");
		mau =sc.nextInt();
		System.out.println(x+ " " +tu+"/"+mau);
	}

	//puong thuc nghich dao phan so
	public void nghichdaoPS() {
		int temp;
		temp=tu;
		tu=mau;
		mau=temp;
		System.out.println( +tu +"/" +mau);
	}

	//phuong thuc tong hai phan so
	public void congPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau() + ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		PhanSo tongPhanso = new PhanSo(ts,ms);
		System.out.println("Tong hai phan so = \n"+tongPhanso.tu +"/" +tongPhanso.mau);
	}
	
	//phuong thuc hieu 2 phan so
	public void hieuPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau() - ps.getTu()*this.getMau();
		int ms = this.getMau()*ps.getMau();
		PhanSo hieuPhanso = new PhanSo(ts,ms);
		System.out.println("Hieu hai phan so = \n"+hieuPhanso.tu +"/" +hieuPhanso.mau);
	}
	
	//phuong thuc tich 2 phan so
	public void tichPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getTu();
		int ms = this.getMau()*ps.getMau();
		PhanSo tichPhanso = new PhanSo(ts,ms);
		System.out.println("Tich hai phan so = \n"+tichPhanso.tu +"/" +tichPhanso.mau);
	}
	
	//phuong thuc thuong hai phan so
	public void thuongPhanso(PhanSo ps) {
		int ts = this.getTu()*ps.getMau();
		int ms = this.getMau()*ps.getTu();
		PhanSo thuongPhanso = new PhanSo(ts,ms);
		System.out.println("Thuong hai phan so = \n"+thuongPhanso.tu +"/" +thuongPhanso.mau);
	}
	
	
	public static void main(String[] args) {
	PhanSo ps1 = new PhanSo();
	PhanSo ps2 = new PhanSo();
		ps1.nhapPS("Phan so 1 la:\n");
		ps2.nhapPS("Phan so 2 la:\n");
		ps1.congPhanso(ps2);
		ps1.hieuPhanso(ps2);
		ps1.tichPhanso(ps2);
		ps1.thuongPhanso(ps2);
		System.out.println("Nghịch đảo phân số thứ 1 là");
		ps1.nghichdaoPS();
		System.out.println("-----------------------------------\n");
		System.out.println("Nghịch đảo phân số thứ 2 là");
		ps2.nghichdaoPS();
	}
}