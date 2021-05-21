/**
 * Is a specific car type called luxury car which has the methods for adding frame and 
 * particular accessories that goes with the luxury car. In addition it holds two 
 * parameters as well.
 * @author Rahul Bulusu
 */
public class LuxuryCar extends Car{
	
	/**
	 * Gets the make and model for a luxury car from the car class using super.
	 * @param make gets the make of the luxury car 
	 * @param model gets the model of the luxury car
	 */
	public LuxuryCar(String make, String model) {
		super(make, model);
	}
	
	/**
	 * Displays "adding a beautiful frame" for the luxury car.
	 */
	protected void addFrame() {
		System.out.println("Adding a beautiful frame");
	}
	
	/**
	 *Overwrites the add engine method from car and displays 
	 *"adding a supped up engine" for a luxury car.
	 * @override 
	 */
	protected void addEngine() {
		System.out.println("Adding a Supped Up Engine");
	}
	
	/**
	 * Adds the following accessories for the luxury car.
	 */
	protected void addAccessories() {
		accessories.add(Accessories.SPORTS_SEATS);
		accessories.add(Accessories.WINDOW_TINT);
		accessories.add(Accessories.HEATED_SEATS);
		accessories.add(Accessories.HIGH_END_SOUND);
		accessories.add(Accessories.TRUNK_ORGANIZER);
		accessories.add(Accessories.BACK_UP_CAMERA);
		accessories.add(Accessories.FLOOR_MATTS);
		accessories.add(Accessories.BLUE_TOOTH);
		accessories.add(Accessories.EXTRA_CUP_HOLDERS);
		accessories.add(Accessories.PHONE_CHARGER);
	}
}
