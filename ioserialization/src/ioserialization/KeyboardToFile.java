package ioserialization;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		 System.out.println("entered main");
		String data =null;//data is in keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);//readers and inputstream are to get input into program
		//bufferreader is for input from keyboard
		FileWriter writer=new FileWriter("Nammadefile.txt");
		System.out.println("Enter some text");
		data=reader.readLine();
		while(!data.equals("quit")) {
		
		//readline will  block main until we give input
		//System.out.println("you have entered .."+data);
			writer.write(data);
		data=reader.readLine();
	}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main existed..");
	}
	
}
