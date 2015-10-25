package bai8;

import java.util.ArrayList;

public class Menu {
	static String nghichDao(String A) {
		char[] B = new char[A.length()];
		for (int i = 0; i < A.length(); i++) {
			int t = A.length() - 1 - i;
			B[i] = A.charAt(t);

		}
		String C = new String(B);
		return C;

	}
	static String chuDauHoa(String A){
		char[] B= A.toCharArray();
		char x=B[0];
		if(x>=97&&x<=122){
			x=(char) ((int)x-32);
		}
		B[0]=x;
		String C=new String(B);
		
		return C;
		
		
	}
	static String chuDauTuHoa(String A){
		char[] B= A.toCharArray();
		for(int i=0;i<B.length-1;i++){
			int x= (int)B[i];
			int y=(int)B[i+1];
			if(x==32 && y>=97&& y<=122){
				y=y-32;
				char z= (char)y;
				B[i+1]=z;
			}
		}
		String C= new String(B);
		return chuDauHoa(C);
	}
	static char[] cacChuHoa(String A){
		char[] b = A.toCharArray();
		ArrayList<Character> r=new ArrayList<>();
		for(int i=0;i<A.length();i++){
			if(b[i]>=65&&b[i]<=90){
				r.add(b[i]);
			}
		}
		char[] c= new char[r.size()];
		for(int i=0;i<c.length;i++){
			c[i]=r.get(i);
			
		}
		
		
		return c;
	}
	static String maHoa(String A){
		char[] B=A.toCharArray();
		for(int i=0;i<B.length;i++){
			int x= (int)B[i];
			if(x==126) {
				x=32;
			}
			else x=x+1;
			B[i] = (char)x;
		}
		
		String C=new String(B);
		return C;
	}

	public static void main(String[] args) {
		String A=LoadString.load();
		System.out.println(nghichDao(A));
		System.out.println(chuDauHoa(A));
		System.out.println(chuDauTuHoa(A));
		char[] c = cacChuHoa(A);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.println(maHoa(A));
	
	}
	
}
