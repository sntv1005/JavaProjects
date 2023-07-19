package excption;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Filenotfound {
//	public static  void findFile() throws IOException {
//		File newFile = new File("test.txt");
//		FileInputStream stream= new FileInputStream(newFile);
//		
//	}
	
		public static void main(String[] args) {
			try {
//				findFile();
				File newFile = new File("test.txt");
         FileInputStream stream= new FileInputStream(newFile);
				
			}
			catch(Exception e){
				System.out.println(e);
			}
			
		}
	}


