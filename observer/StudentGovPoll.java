import java.util.ArrayList;
import java.util.HashMap;

/**
 * keeps track of the observers (candidates), the votes, number of updates, and the school
 * @author Rahul Bulusu
 *
 */
public class StudentGovPoll implements Subject{
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private HashMap<String, Integer> votes = new HashMap<String, Integer>();
	private String school;
	private int numUpdates;
	
	/**
	 * identifies the school of the student government poll
	 * @param school identifies the school
	 */
	public StudentGovPoll(String school) {
		this.school = school;
	}

	/**
	 * adds an observer to the ArrayList of observers
	 * @param observer the list of observers in the ArrayList
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	/**
	 * removes an observer to the ArrayList of observers
	 * @param observer the list of observers in the ArrayList
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * notifies the observer with the number of votes they have
	 * @param votes updates the votes for the observer
	 */
	public void notifyObserver(HashMap<String, Integer> votes) {
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update(votes);
		}
	}
	/**
	 * Adds the name of a person running for president and initially starts them off with 0 votes.
	 * @param president add the person's name to the list running for president  for the student government election
	 */
	public void addCandidate(String president) {
		votes.put(president, 0);
	}
	/**
	 * 
	 * @param president is the name of the candidate running to become president in the student election
	 * @param num the number of votes that each person gets running for president
	 */
	public void enterVotes(String president, int num) {
		int oldVotes = votes.remove(president);
		votes.put(president, oldVotes+num);
		numUpdates++;
		if(numUpdates % 4 == 0) {
			notifyObserver(votes);
		}
	}
	/**
	 * Returns the name of the school where the student government poll is happening
	 * @return school the name of the school
	 */
	public String getSchool() {
		return school;
	}
}
