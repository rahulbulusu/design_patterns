/**
 * Initializes the variables of the parameterized constructor, gets the title, gets the album, gets the artist's first and last name, and converts the genre
 * from uppercase to lowercase format for manipulation
 * @author Rahul Bulusu
 */
public class Track extends Song{
	private String title;
	private String album;
	private String firstName;
	private String lastName;
	private Genre genre;
	
	/**
	 * Initializes the variables of the parameterized constructor
	 * @param title sets the title 
	 * @param album sets the album
	 * @param firstName sets the first name
	 * @param lastName sets the last name
	 * @param genre sets the genre
	 */
	public Track(String title, String album, String firstName, String lastName, Genre genre) {
		this.title = title;
		this.album = album;
		this.firstName = firstName;
		this.lastName = lastName;
		this.genre = genre;
	}
	
	/**
	 * returns the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * returns the album
	 */
	public String getAlbum() {
		return album;
	}
	
	/**
	 * returns the artist's first name
	 */
	public String getArtistFirstName() {
		return firstName;
	}
	
	/**
	 * returns the artist's last name
	 */
	public String getArtistLastName() {
		return lastName;
	}
	
	/**
	 * gets the genre, converts it to lowercase and then makes the first character of the genre uppercase for the formatting
	 */
	public String getGenre() {
		String str = genre.name().toLowerCase();
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}
}
