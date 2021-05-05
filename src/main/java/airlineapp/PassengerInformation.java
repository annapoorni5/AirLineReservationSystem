package airlineapp;

import java.util.HashMap;
import java.util.Set;


public class PassengerInformation {
		
	static HashMap<String, String> userListMap = new HashMap<String, String>();
	
	public static boolean login(String userName) {

		boolean validUser = false;
		boolean isUserExists = searchDetails(userName, null);
		if (isUserExists) {
		System.out.println("Accepted,You can Sign in!");
		validUser = true;

		} else {
			validUser=false;
		}
		return validUser;
		}

		
		public static boolean searchDetails(String userName, String passWord) {
		boolean validUserName = false;
		Set<String> keys = userListMap.keySet();
		for (String key : keys) {
		String value = userListMap.get(key);
		System.out.println(key + ":" + value);
		}
		if (userListMap.containsKey(userName) ) {
		String value = userListMap.get(userName);

		   validUserName = true;
		}

		return validUserName;
		}
		
		


		public static void displayAllUser() {
			// TODO Auto-generated method stub
			System.out.println("############ List All Users #########");
			Set<String> keys = userListMap.keySet();
			for (String key : keys) {
			String value = userListMap.get(key);
			System.out.println(key + ":" + value);
			}
			
		}
		public static boolean addUserStatus(String userName) {
			User add = new User();
			add.status = false;
			if (userListMap.containsKey(userName)) {
			add.status = true;
			}
			return add.status;
			}
		
		public static void delUser(String userName) {
			if (userListMap.containsKey(userName)) {
			userListMap.remove(userName);

			}
			}
		
		public static boolean delUserStatus(String userName) {
			User del = new User();
			del.status = false;
			if (userListMap.containsKey(userName)) {
			del.status = false;
			} else {
			del.status = true;
			}
			return del.status;
			}
		
		public static void updUserName(String oldUserName, String newUserName) {
			if (userListMap.containsKey(oldUserName)) {
			userListMap.remove(oldUserName);
			userListMap.put(newUserName, oldUserName);

			}

			}
		public static boolean updUserNameStatus(String newUserName) {
			User updUserName = new User();
			updUserName.status = false;
			if (userListMap.containsKey(newUserName)) {
			updUserName.status = true;
			}
			return updUserName.status;
			}


		public static void addUser(String name) {
			// TODO Auto-generated method stub
			
			
		}


		


}
