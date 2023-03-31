package observer.main;

import observer.consumers.Newspapers;
import observer.consumers.TVChannel;
import observer.subjectimpl.WeatherStation;

public class TestObserver {

	public static void main(String[] args) {
		TVChannel observer1 = new TVChannel(); // subscriber
		Newspapers observer2 = new Newspapers(); // subscriber
		TVChannel observer3 = new TVChannel();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);

	}

}
