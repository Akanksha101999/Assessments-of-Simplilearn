package git11Questions;
public class methodTypes {
 //return type
	//int return type
 int add() { 
	 int num1=20;
	 int num2=10;
	 int result=num1+num2;
	 return result;
 } 
	 //float return type
   float sum() {
	   int num1=10;
	   int num2=10;
	   int result=num1+num2;
	  return result;
   }
    
   //Double return type
   double divide() {
	   int x=50;
	   int y=25;
	   int ans=x/y;
	   return ans;
   }
   
   //long return type
   long multiply() {
	   int x=25;
	   int y=30;
	   int ans=x*y;
	   return ans;
   }
   
  // void return type	 
 void show() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
	methodTypes m=new methodTypes();
	int add=m.add();
	float sum=m.add();
	double divide=m.divide();
	long multiply=m.multiply();
	System.out.println("The addition of num1 and num2 is: "+add);
	System.out.println("The sum of num1 and num2 is: "+sum);
	System.out.println("The division of x and y is: "+divide);
	System.out.println("The multiplication of x and y is: "+multiply);
	m.show();
	
}
}

   

