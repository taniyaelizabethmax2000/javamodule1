package serialization.test;
import java.io.FileInputStream; //to write in file
import java.io.IOException;
import java.io.ObjectInputStream; //inputstream means bring from file etc.
import java.io.ObjectStreamClass; 

public class TestEmployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	  FileInputStream fis =new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  Object obj =ois.readObject();
	  Employee ref = (Employee)obj;
	  System.out.println(ref);
	}

}
