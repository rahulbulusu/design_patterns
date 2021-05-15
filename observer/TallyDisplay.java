import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * displays the number of votes each candidate has in the student election
 * @author Rahul Bulusu
 *
 */
public class TallyDisplay implements Observer{
	private Subject poll;
	private HashMap<String, Integer> votes;
	
	/**
	 * identifies the poll and registers/assigns each observer (candidate) to the poll
	 * @param poll registers the observers running for the election 
	 */
	public TallyDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObserver(this);
	}
	
	/**
	 * displays and updates the number of votes each observer (candidate) has.
	 * @param votes updates the vote count for each candidate 
	 */
	public void update(HashMap<String, Integer> votes) {
		this.votes = votes;
		display();
	}
	
	/**
	 * displays/prints to the console the tally display of the candidate running along with the number of votes they have in the student election
	 * I referenced the code from: https://www.geeksforgeeks.org/sorting-a-hashmap-according-to-values/
	 * The code referenced sorts the HashMap in descending order to accurately depict the same output as instructor's output by
	 * converting it to a Linked List and sorting the list and converting back to a HashMap.
	 */
	private void display() {
		List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(votes.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
		System.out.println();
		System.out.println("Current Tallies:");
		temp.forEach((president, num) -> {
			System.out.printf("%s: %d\n",president,num);
		});
	}
}
