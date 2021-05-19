/**
 * Gets access to the protected variable passwordBeginning for use from the Password Decorator class, 
 * and creates a new password (phrase) based upon the following characteristic of adding symbols to make 
 * a stronger password.
 * @author Rahul Bulusu
 */
public class Symbols extends PasswordDecorator{
	
	/**
	 * Gets the initial "password" phrase from the Password Decorator class.
	 * @param passwordBeginning using super, we have access to it from the Password
	 * Decorator class.
	 */
	public Symbols(Password passwordBeginning) {
		super(passwordBeginning);
	}
	
	/**
	 * Adds symbols to the password based on the following conversion provided by 
	 * the instructor.
	 * @return password returns the phrase with symbols 
	 */
	public String getPassword() {
		password = password.replace("a", "@");
		password = password.replace("b", "8");
		password = password.replace("e", "3");
		password = password.replace('g', '9');
		password = password.replace('i', '!');
		password = password.replace('o', '0');
		password = password.replace('s', '$');
		password = password.replace('t', '7');
		return password;
	}
}
