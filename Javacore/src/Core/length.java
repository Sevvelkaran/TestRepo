package Core;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "\nChandru";
		System.out.println(s1.length());
		String s2 = "  Sevvelkaran";
		System.out.println(s2.length());
		String s3 = new String("Yuvaraj");
		System.out.println(s3.length());
		String str =  20+24+" Sevvelkaran "+"Yuvraj "+"and "+"Chandru "+20+40;
		System.out.println(str);
		
		String s6 = s1.concat(str);
		System.out.println(s6);
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 6));
		System.out.println(str.toUpperCase());
		System.out.println(s2.trim());
		System.out.println(str.startsWith("K"));
		System.out.println(str.endsWith("0"));
		//char [] ch = str.toCharArray();
		//for(int i =0;i<ch.length;i++) {
//		
			if(s1!=s2) {
				System.out.println("hello");
			}
			else {
				System.out.println("Chandru");
			}
		}
	}


