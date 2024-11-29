package java_practice.collections.Lambda;

public class MultiWayRunner {

	public void classicWay() {
		
		InsertSIMImpl sim = new InsertSIMImpl();
		sim.insertSIM();
	}
	
	public void annonymousClass() {
		Isim sim = new Isim() {
			
			@Override
			public void insertSIM() {
				System.out.println("SIM inserted into mobile using annonymous way");
			}
		};
		sim.insertSIM();
	}
	
	public void usingLambda() {
		Isim sim = ()->System.out.println("SIM inserted into mobile using Lambda way");
		sim.insertSIM();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiWayRunner sim = new MultiWayRunner();
		sim.classicWay();
		sim.annonymousClass();
		sim.usingLambda();

	}

}
