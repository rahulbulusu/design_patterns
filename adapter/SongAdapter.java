/**
 * converts the tune into a song, get the title, album, and the artist's first and last name 
 * by splitting the string and lastly it converts the categories into its respective genres
 * @author Rahul Bulusu
 */
public class SongAdapter extends Song{
	private Tune tune;
	
	/**
	 * converts the tune into a song
	 * @param tune sets the tune using this
	 */
	public SongAdapter(Tune tune) {
		this.tune = tune;
	}
	
	/**
	 * splits the string from the colon and space to get the left side which is the title and displays it 
	 */
	public String getTitle() {
		return tune.getDisplayTitle().split(":")[0];
	}
	
	/**
	 * splits the string from the colon and space to get the right side which is the album and displays it 
	 */
	public String getAlbum() {
		return tune.getDisplayTitle().split(": ")[1];
	}
	
	/**
	 * splits the string by a space to get the first name of the artist
	 */
	public String getArtistFirstName() {
		return tune.getArtistName().split(" ")[0];
	}
	
	/**
	 * splits the string by a space to get the last name of the artist
	 */
	public String getArtistLastName() {
		return tune.getArtistName().split(" ")[1];
	}
	
	/**
	 * converts the categories into the respective genre
	 */
	public String getGenre() {
		String category = tune.getCategory();
		if(category.equalsIgnoreCase("ROCK") || category.equalsIgnoreCase("Classic Rock"))
			return "Rock";
		else if(category.equalsIgnoreCase("COUNTRY AND WESTERN"))
			return "Country";
		else if(category.equalsIgnoreCase("R&B AND SOUL"))
				return "Hip Hop";
		else if(category.equalsIgnoreCase("EASY LISTENING"))
			return "Jazz";
		else
			return "Other";
	}
}
