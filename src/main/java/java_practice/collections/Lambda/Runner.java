package java_practice.collections.Lambda;

public class Runner {
	
	public void classicalWay() {
		BenzImpl benz = new BenzImpl();
		benz.start();
	}

	public void annonymousClass() {
		Icar altoz = new Icar() {
			
			@Override
			public void start() {
						System.out.println("Altroz in Annonymous Started");
			}
		};
		altoz.start();
	}
	
	public void usingLambda() {
		Icar car = ()-> System.out.println("Started using Lambda");
		car.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runner runner = new Runner();
		
		runner.classicalWay();
		runner.annonymousClass();
		runner.usingLambda();

	}

}
