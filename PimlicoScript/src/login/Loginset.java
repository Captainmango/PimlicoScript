package login;

public class Loginset {
/*
 * When dbconnector is finished call data from JB log in details.
 * 
 * Hard code password so that all can use for call tracker.
 */
	public static boolean authenticate(String username,String password) {
		if (username.equals("test") && password.equals("test")) {
			return true;
		}
		return false;
	}
	
}
