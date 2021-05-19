import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Gets access to the protected variable passwordBeginning for use from the Password Decorator class,
 * and creates a new password (phrase) based upon the following characteristic that at 30% of the time it adds 
 * a random special character after the letter.
 * @author Rahul Bulusu
 */
public class SpecialChars extends PasswordDecorator{
	
	/**
	 * Gets the initial "password" phrase from the Password Decorator class.
	 * @param passwordBeginning using super, we have access to it from the Password
	 * Decorator class.
	 */
	public SpecialChars(Password passwordBeginning) {
		super(passwordBeginning);
	}
	
	/**
	 * Loops through the characters in the password, 30% of the time, and adds a random 
	 * special character after the letter.
	 * @return password returns the phrase with special characters
	 */
	public String getPassword() {
		char[] symbols = {'*','!','%','+','.','{','}'};
		Random r = new Random();
		ArrayList<String> characters = new ArrayList<String>();
		for(int i=0; i<password.length(); i++) {
			characters.add(""+password.charAt(i));
				int num = r.nextInt(10);
				if(num <= 2) {
					int num1 = r.nextInt(7);
					characters.add(""+symbols[num1]);
				}
		}
		String[] array = characters.toArray(new String[0]);
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<array.length; i++) {
			sb.append(array[i]);
		}
		password = sb.toString();
		return password;
	}
}
