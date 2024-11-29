package java_practice.pattern.b1;

public class Pattern15 {

	public static void main(String args[]) {
	
		int n=5;
		int x,y;
		
		for(int i=1; i<=5; i++) {
			x=i;
			y=n-i+1;
			for(int j=1; j<=5; j++) {
				
				if(j%2==0) {
					System.out.print(" "+x);
				}
				else {
					System.out.print(" "+y);
				}
				x=x+n;
				y=y+n;
			}
			System.out.println();
		}
	}
}
