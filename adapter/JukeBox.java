import java.util.HashMap;

/**
 * Has a hashmap of song titles and song objects, adds songs to the hashmap and checks 
 * if the song is in the hashmap and plays that song
 * @author Rahul Bulusu
 */
public class JukeBox {
	private HashMap<String, Song> songs;
	private int currentSong;
	
	/**
	 * creates a hashmap of songs and sets the current song to nothing
	 */
	public JukeBox() {
		songs = new HashMap<String, Song>();
		currentSong = 0;
	}
	/**
	 * adds a song to the hashmap
	 * @param song adds the song to the hashmap by getting the title of the song
	 */
	public void addSong(Song song) {
		songs.put(song.getTitle(), song);
	}
	
	/**
	 * given the song name it checks if that song is in the hashmap and then displays the toString. If the
	 * song name is not in the hashmap, then it prints a sorry message
	 * @param songName checks if the name of the song is the same as the song to compare if it exists
	 */
	public void play(String songName) {
		Song song = songs.get(songName);
		if(song == null) {
			System.out.println("Sorry this song is not in the jukebox!");
		}
		System.out.println(song);
	}
}
