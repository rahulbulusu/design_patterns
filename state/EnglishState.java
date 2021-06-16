import java.util.ArrayList;

/**
 * plays two songs: "Twinkle Twinkle Little Star" and "If you're happy 
 * and you know it" in english when you press a certain button. When you press a 
 * language button it switches to spanish or french or stays to english.
 * @author Rahul Bulusu
 */
public class EnglishState implements State{
	private MusicBox box;
	
	/**
	 * sets the music box to the current box
	 * @param box sets the box using this
	 */
	public EnglishState(MusicBox box) {
		this.box = box;
	}
	
	/**
	 * holds the arraylist of lyrics for the song "twinkle twinkle 
	 * little star" in english and plays that song
	 */
	public void pressStarButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("Twinkle, twinkle, little star");
		lyrics.add("How I wonder what you are");
		lyrics.add("Up above the world so high");
		lyrics.add("Like a diamond in the sky");
		lyrics.add("Twinkle, twinkle, little star");
		lyrics.add("How I wonder what you are");
		box.playSong("Twinkle twinkle little star", lyrics);
	}
	
	/**
	 * holds the arraylist of lyrics for the song "If you're
	 * happy and you know it" in english and plays that song
	 */
	public void pressHappyButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("If you're happy and you know it, clap your hands");
		lyrics.add("If you're happy and you know it, clap your hands");
		lyrics.add("If you're happy and you know it and you really want to show it");
		lyrics.add("If you're happy and you know it, clap your hands");
		box.playSong("If you're happy and you know it", lyrics);
	}
	
	/**
	 * displays "already in english mode"
	 */
	public void pressEnglishButton() {
		System.out.println("You are already in English mode");
	}
	
	/**
	 * sets the state to french and displays "switching to french"
	 */
	public void pressFrenchButton() {
		box.setState(box.getFrenchState());
		System.out.println("Switching to French");
	}
	
	/**
	 * sets the state to spanish and displays "switching to spanish"
	 */
	public void pressSpanishButton() {
		box.setState(box.getSpanishState());
		System.out.println("Switching to Spanish");
	}
}
