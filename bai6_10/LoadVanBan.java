package bai6_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadVanBan {
	static String vanBan(){
		File f= new File("TrangCutest.txt");
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
		StringBuffer bf=new StringBuffer();
		for(int i=0;i<t.size();i++){
			bf=bf.append(t.get(i));
			
		}
		
		return bf.toString();
	}

}
