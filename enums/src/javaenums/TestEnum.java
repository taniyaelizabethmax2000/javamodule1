package javaenums;

public class TestEnum {
public static void main(String[] args) {
	DayOfWeek today =DayOfWeek.SATURDAY;//here today is enum instance and DayOfWeek is enum
	System.out.println("Today is" +today.getName());
	//This would output:"Today is saturday"
	
	
	switch(today) {
	case MONDAY:
		System.out.println("Work hard");
		break;
	case TUESDAY:
		System.out.println("Work little more");
		break;
	case WEDNESDAY:
		System.out.println("work work little more");
		break;
	case THURSDAY:
		System.out.println("work work more,WEEKEND IS AROUND SOON ");
		break;
	case FRIDAY:
		System.out.println("yeAH weekend has arrived,party hard");
		break;
	case SATURDAY:
		System.out.println("enjoy morning coffee,go shopping ");
		break;
	case SUNDAY:
		System.out.println("do ALL CLEANING WORKS,SNOOOOOOOOOZZZZZZZZZZZZZZZZZZ");
		break;
	}
}
}
