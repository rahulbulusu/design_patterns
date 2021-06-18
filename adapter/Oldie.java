/**
 * initializes the parameterized constructor, returns the artist's name, displays the title in a particular format and gets the category. 
 * @author Rahul Bulusu
 */
public class Oldie implements Tune{
	private String artistName;
	private String songTitle;
	private String recordTitle;
	private String category;
	
	/**
	 * initializes the artist name, the song title, the record title, and the category using this
	 * @param artistName sets the artist's name
	 * @param songTitle sets the song title
	 * @param recordTitle sets the record title
	 * @param category sets the category
	 */
	public Oldie(String artistName, String songTitle, String recordTitle, String category) {
		this.artistName = artistName;
		this.songTitle = songTitle;
		this.recordTitle = recordTitle;
		this.category = category;
	}
	
	/**
	 * returns the artist's name
	 */
	public String getArtistName() {
		return artistName;
	}
	
	/**
	 * displays the title in the following format (song title (space) record title)
	 */
	public String getDisplayTitle() {
		return songTitle+": "+recordTitle;
	}
	
	/**
	 * returns the category
	 */
	public String getCategory() {
		return category;
	}
}
