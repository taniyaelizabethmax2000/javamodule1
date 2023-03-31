package factorymethod;

public class VehicleFactory {

	
		
		public  static vehicle newInstance(String car) {
			vehicle vehicle=null;
			
			if(car==null)
				return null;
			else if(car.equals("Creta"))
				vehicle=new Creta();
			else if(car.equals("Seltos"))
				vehicle=new seltos();
			else if(car.equals("XCross"))
					vehicle=new XCross();
			return vehicle;
		}

	

}
