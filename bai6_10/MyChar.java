package bai6_10;

public class MyChar {
	int soLuong=0;
	char x;
	void dem(String a){
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==x){
				soLuong++;
				
			}
		}
	}
	void in(){
		System.out.println(x+":"+soLuong);
	}
	

}
