package java_practice.collections.defaultMethod;


@FunctionalInterface
public interface Browser {
	
	void browser();

	default void readPDF() {
		System.out.println("User can ready PDF");
	}
	

}
