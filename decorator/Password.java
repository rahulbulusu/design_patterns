/**
 * Is a base abstract class to make the password more decorated (i.e. used for extending other classes).
 * @author Rahul Bulusu
 */
public abstract class Password {
	protected String password;
	
	/**
	 * Is a base class to get the password for more decorated uses.
	 * @return password returns the phrase 
	 */
	public String getPassword() {
		return password;
	}
}
