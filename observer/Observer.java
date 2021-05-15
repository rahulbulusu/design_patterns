import java.util.HashMap;

/**
 * Used for the two ways of displaying the polls: Tally Display and Percentage Display
 * @author Rahul Bulusu
 */
interface Observer {
	
	/**
	 * Updates the number of votes for the name of the president
	 * @param votes updates the votes
	 */
	public void update(HashMap<String, Integer> votes);
}
