package bai9;

import java.util.Scanner;

import bai7.LoadFile;

public class TuDien {
	static Tu[] cacTu ;
	static void loadCacTu(){
		String[] a;
		a=LoadFile.vanBan("tudienTrang.txt");
		Tu[] c=new Tu[a.length];
		for(int i=0;i<a.length;i++){
			String[] b= a[i].split(":");
			c[i]=new Tu();
			c[i].key=b[0];
			c[i].mean  = new String[b.length-1];
			for(int j=1;j<b.length;j++){
				c[i].mean[j-1]= b[j];
				
			}
			
			
		}
		cacTu=c;
	}
	static Tu traTu(String a){
		Tu b=new Tu();
		b.key=a;
		for(int i=0;i<cacTu.length;i++){
			if(b.equals(cacTu[i])){
				return cacTu[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		loadCacTu();
		System.out.println("nhap vao tu can tra:");
		Scanner in = new Scanner(System.in);
		String a= in.nextLine();
		
		Tu b=traTu(a);
		if(b!= null) b.in();
		
	}

}
