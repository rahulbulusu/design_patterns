/**
 * Is an interface which holds a phrase which is a "password" and gets the password.
 * @author Rahul Bulusu
 */
public abstract class PasswordDecorator extends Password{
	protected Password passwordBeginning;
	
	/**
	 * Sets the beginning password (phrase) as the "password" to use for manipulation for 
	 * a more decorated password.
	 * @param passwordBeginning is set equal to the password 
	 */
	public PasswordDecorator(Password passwordBeginning) {
		this.passwordBeginning = passwordBeginning;
		this.password = passwordBeginning.password;
	}
	/**
	 * gets the password (phrase) for each of the three extended classes. 
	 * @return password returns the phrase 
	 */
	public String getPassword() {
		return password;
	}
}
