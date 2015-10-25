package bai6_10;

public class SoPhuc {
	double thuc,ao;

	public double getThuc() {
		return thuc;
	}

	public void setThuc(double thuc) {
		this.thuc = thuc;
	}

	public double getAo() {
		return ao;
	}

	public void setAo(double ao) {
		this.ao = ao;
	}
	void in(){
		System.out.println(thuc+"+"+ao+"*i");
		
	}
	SoPhuc cong(SoPhuc a){
		SoPhuc b=new SoPhuc();
		b.thuc=thuc+a.thuc;
		b.ao= ao +b.ao;
		return b;
	}
	SoPhuc tru(SoPhuc a){
		SoPhuc b=new SoPhuc();
		b.thuc=thuc-a.thuc;
		b.ao= ao -b.ao;
		return b;
	}
	SoPhuc nhan(SoPhuc a){
		SoPhuc b=new SoPhuc();
		b.thuc=thuc*a.thuc - ao*a.ao;
		b.ao=thuc*a.ao +ao*a.thuc;
		return b;
	}
	SoPhuc layLienHop(){
		SoPhuc a=new SoPhuc();
		a.thuc = thuc;
		a.ao = -ao;
		return a;
	}
	double moDun(){
		return(Math.sqrt(thuc*thuc+ao*ao));
	}
	
	
	SoPhuc chia(SoPhuc a){
		SoPhuc b= new SoPhuc();
		SoPhuc c=a.layLienHop();
		b=this.nhan(c);
		b.thuc=b.thuc/Math.pow(c.moDun(),2);
		b.ao=b.ao/Math.pow(c.moDun(), 2);
		return b;
		
	}
	public static void main(String[] args) {
		SoPhuc a=new SoPhuc();

		a.setAo(3);
		a.setThuc(4);
		a.in();
		System.out.println(a.moDun());
		a.cong(a).in();
		a.tru(a);
		a.layLienHop().in();
		a.nhan(a).in();
		a.chia(a).in();
		double x=a.moDun();
		System.out.println(x);
		
	}
	

}
