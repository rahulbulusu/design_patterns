import java.util.Random;

/**
 * Gets access to the protected variable passwordBeginning for use from the Password Decorator class,
 * and creates a new password (phrase) based upon the following characteristic that for each character
 * in the password, 50% of the time it will be in upper case, and the other 50% will be in lower case.
 * @author Rahul Bulusu
 */
public class RandomCasing extends PasswordDecorator{
	
	/**
	 * Gets the initial "password" phrase from the Password Decorator class.
	 * @param passwordBeginning using super, we have access to it from the Password
	 * Decorator class.
	 */
	public RandomCasing(Password passwordBeginning) {
		super(passwordBeginning);
	}
	
	/**
	 * For each character in the password, 50% of the time it will be in upper case,
	 * and the other 50% it will be in lower case.
	 * @return password returns the phrase with upper case and lower case characters.
	 */
	public String getPassword() {
		Random r = new Random();
		char[] characters = password.toCharArray();
		for(int i=0; i<characters.length; i++) {
			if(Character.isLetter(characters[i])) {
				int num = r.nextInt(2);
				if(num == 0)
					characters[i] = Character.toUpperCase(characters[i]);
			}
		}
		password = String.valueOf(characters);
		return password;
	}
}
