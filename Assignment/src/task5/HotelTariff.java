package task5;

public class HotelTariff {

	public static void main(String[] args) {
		//Initialization
	int month=3;
	float roomRent=1000.50F;
	int noOfDays=5;
	float totalRent=0;
	
	//Condition
	if (month == 3 || month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
		roomRent+=roomRent*0.20F;
	}
	totalRent=roomRent*noOfDays;
	System.out.println(totalRent);
	}

}
