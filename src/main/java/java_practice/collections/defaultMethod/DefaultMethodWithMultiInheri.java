package java_practice.collections.defaultMethod;

public class DefaultMethodWithMultiInheri implements Ioption1, Ioption2{

	
//	@Override
//	public void joinColleage() {
//		System.out.println("Im going to select 3rd option");
//	}
	
//	public void joinColleage() {
//		Ioption1.super.joinColleage();
//	}
	
	public void joinColleage() {
		Ioption2.super.joinColleage();
	}
	public static void main(String[] args) {
		
		DefaultMethodWithMultiInheri dmem = new DefaultMethodWithMultiInheri();
		dmem.joinColleage();
		
		Ioption1 opt = new DefaultMethodWithMultiInheri();
		opt.joinColleage();
	}
}
