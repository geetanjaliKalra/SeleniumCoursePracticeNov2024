package testng;

import org.testng.annotations.Test;

public class CRUDOperations {

	public int addUser() {
		return 123;
	}

	public String getUser(int uid) {
		return "User info is " + uid;
	}

	public String updateUser(int uid) {
		return ("updated user id" + uid);
	}

	public void deleteUser(int uid) {
		System.out.println("user deleted " + uid);
	}

	@Test
	public void addUserTest() {
		int uid = addUser();
		System.out.println(getUser(uid));

	}

	@Test
	public void getUserTest() {
		int uid = addUser();
		String user = getUser(uid);
		System.out.println(user);

	}

	@Test
	public void updateUserTest() {
		int uid = addUser();
		updateUser(uid);
		String user = getUser(uid);
		System.out.println(user);
	}
	
	@Test
	public void deleteUserTest() {
		int uid= addUser();
		deleteUser(uid);
		
		
	}
}
