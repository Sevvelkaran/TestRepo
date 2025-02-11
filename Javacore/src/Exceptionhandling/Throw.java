package Exceptionhandling;
//import java.lang.*;
//import java.io.IOException;

//  static void validate (int num) {
//	  if(num <0) {
//		  throw new ArithmeticException("Invaid value");
//  }else {
//	  System.out.println("Proceed");
//  }
//}
//  public static void main(String [] args) {
//	  try {
//		  validate(-10);
//	  }
//	  catch(Exception e) {
//		  System.out.println(e.getMessage());
//	  }
  //}
	
//	static void fun () throws IllegalAccessException {
//		System.out.println("Inside fun().");
//		throw new IllegalAccessException("demo");
//	}
//	public static void main (String [] args) {
//		try {
//			fun();
//			
//		}
//		catch(IllegalAccessException e) {
//			System.out.println("caught in main ");
//		}
//	}
	
//	void mymethod(int num) throws IOException, ClassNotFoundException{
//		if(num==1) {
//			throw new IOException("IOException Occured");
//		}else {
//			throw new ClassNotFoundException("Class not found Exception");
//		}
//	}
//	public static void main(String [] args) {
//		try {
//			Throw obj = new Throw();
//			obj.mymethod(1);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
	
//	public static void main(String [] args) {
//		try {
//			double data = 25/12.34;
//			System.out.println(data);
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Finally block has been excuted");
//		}
//	}
	
//	class InvalidAgeException extends Exception{
//		InvalidAgeException(String s){
//			super(s);
//		}
//	}
//	
//	public class Throw{
//		static void validate(int age) throws InvalidAgeException{
//			if (age < 18){
//				throw new InvalidAgeException("Not eligibe");
//			}
//			else {
//				System.out.println("Eligible");
//			}
//		}
//		public static void main(String[] args) {
//			try {
//				validate(13);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}

	
		
	//}
class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
		super(s);
	}
}


public class Throw{
	void productCheck(int weight) throws InvalidProductException{
		if(weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	
	public static void main(String [] args) {
		Throw obj = new Throw();
		try {
			
			obj.productCheck(21);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
	

  

