package java_practice.collections.Lambda;

public class PanchayathRunner {
	
	String question = "Ponna Kaiya pudhichi izhuthiya?";
	
	public void usingClassicalWay() {
		
		Ipanchayath panchayath = new PanchaythImpl();
		System.out.println(panchayath.Interogstion(question));
	}
	
	public void usingAnnonymousWay() {
		
		Ipanchayath panchayath = new Ipanchayath() {
			
			@Override
			public String Interogstion(String question) {
				// TODO Auto-generated method stub
				return "Enna Annonymous "+question;
			}
		};
		System.out.println(panchayath.Interogstion(question));
	}
	
	public void usingLambda() {
		
		//Ipanchayath panchayath = (String question )->{return "Enna "+question;};
		//Ipanchayath panchayath = (question)->{return "Enna "+question;};
		//Ipanchayath panchayath = question->{return "Enna Lambda "+question;};
		Ipanchayath panchayath = question->"Enna Lambda "+question;
		System.out.println(panchayath.Interogstion(question));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PanchayathRunner panchayath = new PanchayathRunner();
		panchayath.usingClassicalWay();
		panchayath.usingAnnonymousWay();
		panchayath.usingLambda();
		

	}

}
