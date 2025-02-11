package Exceptionhandling;
import java.lang.*;
public class ThrowExcep {

	public static void main(String[] args) {
		
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code");
		
//		try {
//			int a[]= new int [2];
//			System.out.println(a[3]);
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println(e);
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		System.out.println("out of the box");
		
//		
//		try {
//			int a [] = new int [5];
//					a[5] = 30/0;
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		//System.out.println("The array is printed");
		
		

	}

}
