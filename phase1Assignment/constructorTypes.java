package git11Questions;

public class constructorTypes {
	int number;
	int x;
	public constructorTypes() {
		x=2;
	}
	public constructorTypes(int num) {
		number =num;
		System.out.println("Parameterized constructor " +num);
		
		
	}

	public static void main(String[] args) {
    constructorTypes ct=new constructorTypes();
	System.out.println("Zero parameterized constructor- " +ct.x);
    constructorTypes obj=new constructorTypes(50);

	}

}