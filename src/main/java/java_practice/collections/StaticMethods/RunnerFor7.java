package java_practice.collections.StaticMethods;

public class RunnerFor7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IStringUtilWithJava7Impl stat = new IStringUtilWithJava7Impl();
		
		String husband = "DINESH";
		String wife = "Gayathri";
		
		System.out.println(stat.covertToLowerCase(husband));
		System.out.println(stat.covertToUpperCase(wife));
		

	}

}
