package bai9;

public class Tu {
	String key;
	String[] mean;
	public Tu(){
		
	}
	public Tu(String key,String[] mean){
		this.key= key;
		this.mean= mean;		
	}
	public void in(){
		System.out.print(key+":" );
		for(int i=0;i<mean.length;i++){
			if(i<mean.length-1){
				System.out.print(mean[i]+",");
			}
			else System.out.print(mean[i]);
			
		}
		
	}
	public boolean equals(Tu a){
		if(key.equals(a.key)==true){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String[] nghia={"cute","xinh dep"};
		Tu Trang= new Tu("Trang",nghia);
		Trang.in();
		
		
		
	}
	
}
