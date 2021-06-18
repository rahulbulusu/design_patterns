/**
 * Is an abstract base class for track and song adapter
 * All the methods are abstract: it gets the title, album, the artist's first and last name, the genre of the song.
 * Has a toString method where it prints out the way it needs to be formatted 
 * @author Rahul Bulusu
 */
public abstract class Song {
	public abstract String getTitle();
	public abstract String getAlbum();
	public abstract String getArtistFirstName();
	public abstract String getArtistLastName();
	public abstract String getGenre();
	
	/**
	 * prints out the song in this formatted and includes these elements 
	 */
	public String toString() {
		return getTitle()+"\n"+"Album: "+getAlbum()+"\n"+"By: "+getArtistFirstName()+" "+
				getArtistLastName()+"\n"+"Genre: "+getGenre()+"\n";
	}
}
