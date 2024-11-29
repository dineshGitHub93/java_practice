package java_practice.collections.StaticMethods;

public class SatictMethodDemo implements CarForStaticMethod {
	
	//@Override
	public static void startCar() { //The method startCar() of type SatictMethodDemo must override or implement a supertype method
		System.out.println("Static method from implemented class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SatictMethodDemo sm = new SatictMethodDemo();
		CarForStaticMethod.startCar();
		sm.startCar();
	}

}
