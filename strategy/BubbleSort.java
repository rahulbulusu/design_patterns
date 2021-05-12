import java.util.ArrayList;

/**
 * Does Bubble Sort which is one of the sorting behaviors for the items in the grocery list in alphabetical order
 * @author Rahul Bulusu
 */
public class BubbleSort implements SortBehavior{
	
	/**
	 * Sorts the list of data in alphabetical order
	 * @return the sorted list of data
	 */
	public ArrayList<String> sort(ArrayList<String> data){
	    ArrayList<String> data2 = new ArrayList<String>();
		for(int i=0; i<data.size(); i++){
			data2.add(data.get(i)); //Makes data2 the same as data for manipulation
		}
		String temp = "";
		for(int i=0; i<data2.size()-1; i++) {
			for(int j=0; j<data2.size()-1-i; j++) {
				if(data2.get(j).compareTo(data2.get(j+1))> 0){
					temp = data2.get(j);
					data2.set(j,data2.get(j+1));
					data2.set(j+1,temp);
				}
			}
		}
		return data2;
	}
}
