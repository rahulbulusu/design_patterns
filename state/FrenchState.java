import java.util.ArrayList;

/**
 *plays two songs: "Twinkle Twinkle Little Star" and "If you're happy 
 *and you know it" in french when you press a certain button. When you press a 
 *language button it switches to spanish or english or stays to french.
 *@author Rahul Bulusu
 */
public class FrenchState implements State{
	private MusicBox box;
	
	/**
	 *sets the music box to the current box
	 *@param box sets the box using this
	 */
	public FrenchState(MusicBox box) {
		this.box = box;
	}
	
	/**
	 *holds the arraylist of lyrics for the song "twinkle twinkle 
	 *little star" in french and plays that song
	 */
	public void pressStarButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("Brille, brille, petite étoile,");
		lyrics.add("Comme j’aimerais savoir qui tu es!");
		lyrics.add("Si haut au-dessus du monde,");
		lyrics.add("Comme un diamant dans le ciel.");
		lyrics.add("Brille, brille, petite étoile,");
		lyrics.add("Comme j’aimerais savoir qui tu es!");
		box.playSong("Brille, brille, petite étoile", lyrics);
	}
	
	/**
	 *holds the arraylist of lyrics for the song "If you're
	 *happy and you know it" in french and plays that song
	 */
	public void pressHappyButton() {
		ArrayList<String> lyrics = new ArrayList<String>();
		lyrics.add("Si tu es heureux et que tu le sais, tape des mains");
		lyrics.add("Si tu es heureux et que tu le sais, tape des mains");
		lyrics.add("Si tu es heureux et que tu le sais et que tu veux vraiment le montrer");
		lyrics.add("Si tu es heureux et que tu le sais, tape des mains");
		box.playSong("Si tu es heureux et que tu le sais", lyrics);
	}
	
	/**
	 *sets the state to english and displays "switching to english"
	 */
	public void pressEnglishButton() {
		box.setState(box.getEnglishState());
		System.out.println("Switching to English");
	}
	
	/**
	 *displays "already in french mode"
	 */
	public void pressFrenchButton() {
		System.out.println("You are already in French mode");
	}
	
	/**
	 *sets the state to spanish and displays "switching to spanish"
	 */
	public void pressSpanishButton() {
		box.setState(box.getSpanishState());
		System.out.println("Switching to Spanish");
	}
}
