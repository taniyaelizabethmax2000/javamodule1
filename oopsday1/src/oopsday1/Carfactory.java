package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car jag = new Car();
       
        jag.color ="Blue";
        jag.price = 3000000;
        jag.brand ="Jaguar";
        jag.model ="Highend Sedan";
        
        System.out.println(jag.color);
        System.out.println(jag.price);
        System.out.println(jag.brand);
        System.out.println(jag.model);
        
        
        Car bmw = new Car();
        bmw.color ="White";
        bmw.brand ="BMW";
        bmw.price =7500000;
        bmw.model="Luxury SUV";
        
        System.out.println(bmw.color);
        System.out.println(bmw.price);
        System.out.println(bmw.brand);
        System.out.println(bmw.model);

        
        //jag="Hello";
        bmw = jag;
	}

}
