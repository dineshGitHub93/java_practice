package java_practice.pattern.b1;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int k;
		
		for(int i=1; i<=5; i++) {
			x=i;
			k=5-i+1;
			
			for(int j=1; j<=5; j++) {
				
				if(j%2==1) {
					System.out.print(" "+x);
				}
				else {
					System.out.print(" "+k);
				}
				x = x+5;
				k = k+5;
			}
			
			System.out.println();
		}

	}

}
