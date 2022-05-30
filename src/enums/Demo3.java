package enums;

//Use an enum constructor, instance variable, and method.  
enum Transport {
	CAR(65, 100), TRUCK(55, 600), AIRPLANE(600, 900 ), TRAIN(70, 2500), BOAT(22, 40 );

	private int speed, load; // typical speed of each transport

// Constructor  
	Transport(int s, int c) {
		speed = s;
		load = c;
	}

	int getSpeed() {
		return speed;
	}
	
	int getLoad() {
		return load;
	}
}

class Demo3 {
	public static void main(String args[]) {
		//Transport tp;

		// Display speed of an airplane.
		System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

		// Display all Transports and speeds.
		System.out.println("All Transport speeds: ");
		for (Transport t : Transport.values()) {
			System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour. ");
			System.out.println("And load is " + t.getLoad() + " Kg\n");
		}
		for(Transport t : Transport.values()) System.out.print(t + " posição " + t.ordinal() + ", ");
	}
}