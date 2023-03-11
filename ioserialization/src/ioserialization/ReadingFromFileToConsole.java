package ioserialization;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFileToConsole {

	public static void main(String[] args) throws IOException {
		
  FileReader reader = new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
  		 //give me keyboardtofile to read.
 BufferedReader buffer = new BufferedReader(reader);//read from file
 
 String data=buffer.readLine();
 while(data!=null) {
	 System.out.println(data);
	 
	 data=buffer.readLine();
 }
		
 reader.close();
 buffer.close();
	
	}

}
