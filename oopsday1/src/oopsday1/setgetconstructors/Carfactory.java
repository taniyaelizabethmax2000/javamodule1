package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c = new Car();
        Car jag = new Car("Yellow",4000000,"Toyota","Innova");
        
        System.out.println(jag.hashCode());
       System.out.println( Integer.toHexString(jag.hashCode()));
        System.out.println(jag);
       
		/*
		 * jag.setColor("Red"); jag.setPrice(3000000); jag.setModel("Premium sedan");
		 * jag.setBrand("Jaguar");
		 */
        
       
        
        System.out.println(jag.getColor());
        System.out.println(jag.getPrice());
        System.out.println(jag.getBrand());
        System.out.println(jag.getModel());
       
		/*
		 * jag.color ="Blue"; jag.price = 3000000; jag.brand ="Jaguar"; jag.model
		 * ="Highend Sedan";
		 * 
		 * System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
        
        
        Car bmw = new Car("Brown",8500000,"BMW","Luxury Suv");
        
        System.out.println(bmw.hashCode());
        System.out.println(Integer.toHexString(bmw.hashCode()));
        System.out.println(bmw);
       
		/*
		 * bmw.setColor("White"); bmw.setPrice(7500000); bmw.setModel("Luxury SUV");
		 * bmw.setBrand("BMW");
		 */
        System.out.println(bmw.getColor());
        System.out.println(bmw.getPrice());
        System.out.println(bmw.getBrand());
        System.out.println(bmw.getModel());
		/*
		 * bmw.color ="White"; bmw.brand ="BMW"; bmw.price =7500000;
		 * bmw.model="Luxury SUV";
		 * 
		 * System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */

        
        //jag="Hello";
        bmw = jag;
	}

}
