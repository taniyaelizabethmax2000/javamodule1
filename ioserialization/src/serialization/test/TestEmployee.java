package serialization.test;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestEmployee {

	public static void main(String[] args) throws IOException {
		 
		Employee emp = new Employee(101,"John Doe",4000,"Chumma");
        FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);//writing object to file gives bytestream.
}
} 