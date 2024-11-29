package java_practice.learn.basics;

public class TwoSum {
	
	
	
	public int[] twoSum(int[] num, int target) {
		
		int len = num.length;
		
		for(int cell =1; cell<len; cell++) {
			for(int right = cell; right <len; right++) {
				int left = right -cell;
				System.out.println("Two sum value : "+(num[left]+num[right]));
				if(num[left]+num[right]==target) {
					return new int[]{left,right};
				}
			}
		}
		
		return new int[0];
	}

	public static void main(String[] args) {
		int[] num = {2,5,6,7,8,1};
		int target = 9;
		
		// TODO Auto-generated method stub
		TwoSum obj = new TwoSum();
		int[] num1= obj.twoSum(num, target);
		System.out.println(num1[0]+" "+num1[1]);
		
		
	}

}
