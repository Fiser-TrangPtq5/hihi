package bai8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoadString {
	static String load(){
		File f= new File("1.txt");
		FileReader fr=null;
		BufferedReader bfr= null;
		String s=null;
		try {
			fr=new FileReader(f);
			bfr=new BufferedReader(fr);
			s=bfr.readLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return s;
		
	}
	public static void main(String[] args) {
		System.out.println(load());
	}

}
