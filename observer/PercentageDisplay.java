import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

/**
 * displays the percentage number of votes each candidate has in the student election
 * @author Rahul Bulusu
 *
 */
public class PercentageDisplay implements Observer{
	private Subject poll;
	private HashMap<String, Integer> votes;
	private int numVotes;
	
	/**
	 * identifies the poll and registers/assigns each observer (candidate) to the poll
	 * @param poll registers the observers running for the election
	 */
	public PercentageDisplay(Subject poll) {
		this.poll = poll;
		poll.registerObserver(this);
	}
	
	/**
	 * displays and updates the percent number of votes each observer (candidate) has.
	 * @param votes updates the vote count for each candidate
	 */
	public void update(HashMap<String, Integer> votes) {
		this.votes = votes;
		numVotes = 0;
		votes.forEach((president, num) -> {
			numVotes += num;
		});
		display();
	}
	/**
	 * displays/prints to the console the percentage display of the candidate running along with the votes percentage they have in the student election
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
		System.out.println("Current Percent of Votes:");
		temp.forEach((president, num) -> {
			double percent = ((double)num/numVotes)*100;
			System.out.printf("%s: %.1f%%\n",president,percent);
		});	
	}
}
