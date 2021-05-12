import java.util.ArrayList;

/**
 * Does Insertion Sort which is one of the sorting behaviors for the items in the wish list in alphabetical order
 * @author Rahul Bulusu
 */
public class InsertionSort implements SortBehavior{
    
	/**
     * Sorts the list in alphabetical order using Insertion Sort
	 * @return the sorted list of data
     */
    public ArrayList<String> sort(ArrayList<String> data){
	    ArrayList<String> data2 = new ArrayList<String>();
        for(int i=0; i<data.size(); i++){
            data2.add(data.get(i)); //Makes data2 the same as data for manipulation
            int index = i;
            String temp = "";
            while(index != 0 && data2.get(index-1).compareTo(data2.get(index)) > 0){
                index = index-1;
                temp = data2.get(index);
				data2.set(index,data2.get(index+1));
				data2.set(index+1,temp);
            }
        }
        return data2;
    }
}