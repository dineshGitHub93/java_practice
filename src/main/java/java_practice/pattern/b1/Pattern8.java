package java_practice.pattern.b1;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(" "+x);
				x+=2;
			}
			System.out.println();
		}
	}

}
