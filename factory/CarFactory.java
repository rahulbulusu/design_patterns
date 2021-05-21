/**
 * Aids in creating a Small Car, Sedan Car, and Luxury Car 
 * @author Rahul Bulusu
 */
public class CarFactory {
	/**
	 * Creates either a small car, a sedan car, a luxury car, or if its not a valid car 
	 * type defaults to a small car automatically. Next, using switch cases it assigns
	 * the make and model for each type of car, assembles it, and breaks. 
	 * @param type refers to the car type (i.e. small, sedan, or luxury)
	 * @param make refers to the make of the car
	 * @param model refers to the model of the car
	 * @return car returns what the car's type, make, and model is
	 */
	public static Car createCar(String type, String make, String model) {
		CarType cartype;
		if(type.equalsIgnoreCase("SMALL")) {
			cartype = CarType.SMALL;
		}
		else if(type.equalsIgnoreCase("SEDAN")) {
			cartype = CarType.SEDAN;
		}
		else if(type.equalsIgnoreCase("LUXURY")) {
			cartype = CarType.LUXURY;
		}
		else {
			System.out.println("Not a valid car type! Defaulting to small car.");
			cartype = CarType.SMALL;
		}
		Car car;
		switch(cartype) {
			case SMALL:
			    car = new SmallCar(make, model);
				car.assemble();
				break;
			case SEDAN:
				car = new SedanCar(make, model);
				car.assemble();
				break;
			case LUXURY:
				car = new LuxuryCar(make, model);
				car.assemble();
				break;
			default:
				car = new SmallCar(make, model);
				car.assemble();
				break;
		}
		return car;
	}
}
