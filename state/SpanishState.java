import java.util.ArrayList;

/**
 * plays two songs: "Twinkle Twinkle Little Star" and "If you're happy 
 * and you know it" in spanish when you press a certain button. When you press a 
 * language button it switches to english or french or stays to spanish.
 * @author Rahul Bulusu
 */
public class SpanishState implements State{
	private MusicBox box;
	
	/**
	 * sets the music box to the current box
	 * @param box sets the box using this
	 */
	public SpanishState(MusicBox box) {
		this.box = box;
	}
	
	/**
	 * holds the arraylist of lyrics for the song "twinkle twinkle 
	 * little star" in spanish and plays that song
	 */
	public void pressStarButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("Brilla brilla pequeña estrella");
		lyrics.add("Cómo me pregunto lo que eres");
		lyrics.add("Por encima del mundo tan arriba");
		lyrics.add("Como un diamante en el cielo");
		lyrics.add("Brilla brilla pequeña estrella");
		lyrics.add("Cómo me pregunto lo que eres");
		box.playSong("Brilla brilla pequeña estrella", lyrics);
	}
	
	/**
	 * holds the arraylist of lyrics for the song "If you're
	 * happy and you know it" in spanish and plays that song
	 */
	public void pressHappyButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("Si eres feliz y lo sabes, aplaude");
		lyrics.add("Si eres feliz y lo sabes, aplaude");
		lyrics.add("Si eres feliz y lo sabes y realmente quieres demostrarlo");
		lyrics.add("Si eres feliz y lo sabes, aplaude");
		box.playSong("Si eres feliz y lo sabes, aplaude", lyrics);
	}
	
	/**
	 * sets the state to english and displays "switching to english"
	 */
	public void pressEnglishButton() {
		box.setState(box.getEnglishState());
		System.out.println("Switching to English");
	}
	
	/**
	 * sets the state to french and displays "switching to french"
	 */
	public void pressFrenchButton() {
		box.setState(box.getFrenchState());
		System.out.println("Switching to French");
	}
	
	/**
	 * displays "already in spanish mode"
	 */
	public void pressSpanishButton() {
		System.out.println("You are already in Spanish mode");
	}
}
