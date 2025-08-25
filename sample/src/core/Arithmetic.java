package core;

public interface Arithmetic {
	int add(int x, int y);
	default void display() {
		System.out.println("this is default");
	}
static void message() {
System.out.println("this is static method");	
}
}
