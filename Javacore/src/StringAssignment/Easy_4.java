package StringAssignment;
import java.util.*;
public class Easy_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		
		System.out.println(s1.toUpperCase());
		String s2 = s1.toUpperCase();
		char [] ch = s2.toCharArray();
		for(int i =0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
