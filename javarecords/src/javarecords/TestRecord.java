package javarecords;

public class TestRecord {

	public static void main(String[] args) {
		Person john=new Person("John",30);
		Person sarah=new Person("Sarah",25);
		
		System.out.println(john.name());//prints "John"
		System.out.println(sarah.age());//prints "25"

	}

}
