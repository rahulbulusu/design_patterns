import java.util.HashMap;

/**
 * This class is the subject of the Student Government poll. 
 * @author Rahul Bulusu
 */
interface Subject {
	
	/**
	 * Registers the observer
	 * @param observer adds the key of the name of a president
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * removes an observer 
	 * @param observer removes the key of the name of a president
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Notifies the observer with the key of the name and the amount of votes 
	 * @param votes notifies the amount of votes for the name of the president
	 */
	public void notifyObserver(HashMap<String, Integer> votes);
}
