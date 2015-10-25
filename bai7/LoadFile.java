package bai7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadFile {
	public static String[] vanBan(String a){
		File f= new File(a);
		FileReader fr= null;
		BufferedReader bfr=null;
		ArrayList<String> t= new ArrayList<>();
		
		try {
			fr=new FileReader(f);
			bfr= new BufferedReader(fr);
			
			do{
				String s;
				s=bfr.readLine();
				if(s==null) break;
				t.add(s);
				
			}
			while(true);
		} catch (Exception e) {
			// TODO: handle exception
		}
		String[] B= new String[t.size()];
		for(int i=0;i<B.length;i++){
			B[i]= t.get(i);
			
		}
		return B;
		
		
	}
	public static void main(String[] args) {
		String C[] = LoadFile.vanBan("menu.txt");
		for(int i=0;i<C.length;i++){
			System.out.println(C[i]);
		}
		
	}

}

