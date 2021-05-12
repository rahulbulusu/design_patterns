import java.util.ArrayList;

/**
 * This class holds a list of data in an array list in which you can add or remove items from the list and sort the list as well. 
 * In addition, the class utilizes the SortBehavior class to sort the items based on a specified sorting behavior (i.e bubble sort or insertion sort)
 * @author Rahul Bulusu
 */
public class Listing {
	private String title;
	private ArrayList<String> items = new ArrayList<String>();
	private SortBehavior sortBehavior = new BubbleSort();
	
	/**
	 * Identifies the titles from the ArrayList and creates a listing of them
	 * @param title identifes the titles from the array list
	 */
	public Listing(String title){
		this.title = title;
	}
	
	/**
	 * Adds an item to the ArrayList of items 
	 * @param item The items from the List Driver
	 */
	public void add(String item){
		items.add(item);
	}
	
	/**
	 * Removes an item from the ArrayList of items
	 * @param item The items from the ListDriver
	 */
	public void remove(String item){
		items.remove(item);
	}
	
	/**
	 * Gets the titles from the method Listing and returns all the titles in the array list
	 * @return the title of the listing
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Is used to determine which sort behavior to use for which list (i.e need to use the default Bubble Sort for the Grocery List and Insertion Sort for the Wish List)
	 * @param sortBehavior Determines which behavior to use for the array list (i.e either Bubble Sort, the default, or Insertion Sort)
	 */
	public void setSortBehavior(SortBehavior sortBehavior) {
		this.sortBehavior = sortBehavior;
	}
	
	/**
	 * Returns the full sorted list of items based upon one of the two sorting behaviors 
	 * @return The sorted list based upon either Bubble Sort or Insertion Sort 
	 */
	public ArrayList<String> getSortedList() {
		return sortBehavior.sort(items);
	}
	
	/**
	 * Returns the unsorted list of items to show that it needs to be sorted if not right
	 * @return The unsorted list of items
	 */
	public ArrayList<String> getUnSortedList(){
		return items;	
	}
}
