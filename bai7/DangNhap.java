package bai7;

import java.util.Scanner;

public class DangNhap {
	static User dangNhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap userName");
		String name = in.nextLine();
		System.out.println("nhap passWord");
		String pass = in.nextLine();
		User a = new User(name, pass);
		return a;

	}

	static User[] loadUser() {
		String[] t = LoadFile.vanBan("user.txt");
		User[] a = new User[t.length];
		for (int i = 0; i < t.length; i++) {
			String[] b = t[i].split(" ");
			a[i] = new User(b[0], b[1]);

		}
		return a;

	}
	static boolean coTrongMang(User[] a,User b){
		for(int i=0;i<a.length;i++){
			if(a[i].equals(b)) return true;
			
		}
		return false;
		
		
	}
	static void logIn(){
		User[] a= loadUser();
		
		while(true){
			User b= dangNhap();
			if(coTrongMang(a,b)==false){
				System.out.println("ban da dang nhap sai,nhap lai:");
				continue;
			}
			else break;
			
			
			
		}
		
	}
	static int nhapSo(){
		Scanner in = new Scanner(System.in);
		int so=in.nextInt();
		return so;
	}
	
	public static void main(String[] args) {
		//User[] a = loadUser();
		//System.out.println(a.length);
		logIn();
		Menu b= Menu.loadMenu();
		b.in();
		System.out.println("nhap de chon thao tac:");
		int x=nhapSo();
		
		if(x>=0&&x<=3){
			b.menuCon[x-1].in();
			
		}else if(x==5){
			System.out.println("thoat");
		}
		else{
			System.out.println("nhap sai");
			
		}
	}
	

}
