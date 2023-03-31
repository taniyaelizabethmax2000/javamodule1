package javarecords;

public record Person(String name,int age) {

	public boolean equlas(Object obj) {
		return false;
	}
	
	public int hashCode() {
		return 0;
	}
	public String toString() {
		return null;
	}
}
