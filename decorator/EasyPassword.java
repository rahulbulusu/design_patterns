import java.util.Random;

/**
 * Gets the phrase that the user inputed into the console and stores it as the "password." The getPassword method 
 * manipulates the phrase based on a few characteristics to create a new phrase which is an "easy password".  
 * @author Rahul Bulusu
 */
public class EasyPassword extends Password{
	/**
	 * Sets the phrase the user enters as the password.
	 * @param phrase equals to the password
	 */
	public EasyPassword(String phrase) {
		password = phrase;
	}
	/**
	 * Based from the user inputed phrase, it creates a new phrase which is the "password" with no white spaces
	 * and adds a random number between 0 and 100 to the end of the phrase.
	 * @return password returns the phrase based on a certain characteristic discussed above.
	 */
	public String getPassword() {
		String temp = password.replaceAll("\\s", "");
		Random r = new Random();
		int num = r.nextInt(101);
		password = temp + String.valueOf(num);
		return password;
	}
}
