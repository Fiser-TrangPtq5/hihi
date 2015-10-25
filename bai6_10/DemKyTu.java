package bai6_10;

public class DemKyTu {
	
	
	public static void main(String[] args)   {
		MyChar[] A= new MyChar[94];
		for(int i=0;i<94;i++){
			A[i]= new MyChar();
			A[i].x=(char)(i+33);
			
		}
		String s=LoadVanBan.vanBan();
		for(int i=0;i<94;i++){
			A[i].dem(s);
			if(A[i].soLuong!=0){
				A[i].in();
				
			}
			
		}
		

}
}