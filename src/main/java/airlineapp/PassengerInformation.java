package airlineapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class PassengerInformation {
		
	static  HashMap <String , Integer> passengerName = new  HashMap<String , Integer>();
	//HashMap <String , Integer> Integer;>();
	
	public static boolean travellerName(String name, int noOfTraveller) {
		//HashMap<String, Integer> pname=new HashMap<String, Integer>();
//		passengerName.put("Annie",3);
//		passengerName.put("prabhu", 5);
//		passengerName.put("poorni",2);
		
		passengerName.put(name, noOfTraveller);
		Set <String> keys=passengerName.keySet();
		for(String key : keys) {
			Integer value = passengerName.get(noOfTraveller);
			System.out.println(key + ":" + value);
			
		}
		boolean validName=false;
		if(passengerName.containsKey(name)) {
			validName=true;
		}
		return validName;
	}
	
	public static void addUser(String pname, int travellers) {

		passengerName.put(pname, travellers);

		}
	
	public static boolean passengerMobile(Long number) {
		boolean validMobileNum=false;
		String mblNumber=Long.toString(number);
		if((mblNumber.length()>=1) && (mblNumber.length()<=10)) {
			validMobileNum=true;
		}
		return validMobileNum;		
	}
	
	static ArrayList<String>  passenger= new ArrayList<String>();
	static ArrayList<String> passengePincode=new ArrayList<String>();
	static ArrayList<Integer> passengersAge=new ArrayList<Integer>();
	static ArrayList<String> foodAvailability=new ArrayList<String>();

	

	
	public static String passengerAddress(String address) {
		passenger.add(address);
		
		return address;
		
	}
	public static boolean addressPincode(String pincode) {
		passengePincode.add(pincode);
		boolean validPincode=false;
		if(pincode.length()==6) {
			validPincode=true;
		}
		return validPincode;
		
	}
	
	public static Integer travellersAge(int age) {
		passengersAge.add(age);
		if(age<=10) {
			System.out.println("Kids");
		}
		else if(age>=10 && age<=18) {
			System.out.println("Youth");
		}
		else if(age>=19) {
			System.out.println("Adult");
		}
		
		return age;	
		
	}
	/*public static boolean foodAvailable(String foodNeeds) 
	{
		//foodAvailability.put(foodNeeds);
		boolean valid=false;
		if(foodAvailability.equals(foodNeeds)) {
			valid=true;
		}
		return valid;
		
	}
	*/
	public static String needFood(String available) {
		String need="No";
		if(available.equals(need)) {
			need="Yes";
		}
		else {
			need="No";
		}
		
		return need;
	}
		
	
	
	
	
	



}