import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * presses certain buttons to play the song or switch language states,
 * gets the language states (english, french, spanish), and plays the 
 * lyrics in the language selected very slowly
 * @author Rahul Bulusu
 */
public class MusicBox {
	private State englishState;
	private State frenchState;
	private State spanishState;
	private State state;
	
	/**
	 * sets the state variables using this
	 */
	public MusicBox() {
		englishState = new EnglishState(this);
		frenchState = new FrenchState(this);
		spanishState = new SpanishState(this);
		state = englishState;
	}
	
	/**
	 * Calls press star button on the state variable
	 */
	public void pressStarButton() {
		state.pressStarButton();
	}
	
	/**
	 * calls press happy button on the state variable
	 */
	public void pressHappyButton() {
		state.pressHappyButton();
	}
	
	/**
	 * calls press English button on the state variable
	 */
	public void pressEnglishButton() {
		state.pressEnglishButton();
	}
	
	/**
	 * calls press French button on the state variable
	 */
	public void pressFrenchButton() {
		state.pressFrenchButton();
	}
	
	/**
	 * calls press Spanish button on the state variable
	 */
	public void pressSpanishButton() {
		state.pressSpanishButton();
	}
	
	/**
	 * changes the state accordingly
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * returns the english state
	 */
	public State getEnglishState() {
		return englishState;
	}
	
	/**
	 * returns the french state
	 */
	public State getFrenchState() {
		return frenchState;
	}
	
	/**
	 * returns the spanish state
	 */
	public State getSpanishState() {
		return spanishState;
	}
	
	/**
	 * slowly displays the lyrics from the arraylist of the song 
	 */
	public void playSong(String songName, ArrayList<String> lyrics) {
		System.out.println("\nPlaying: "+songName);
		for(String s : lyrics) {
			try {
				TimeUnit.MILLISECONDS.sleep(10000);
			} catch (Exception e) {}
			System.out.println(s);
		}
		System.out.println();
	}
}
