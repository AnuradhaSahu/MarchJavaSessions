package JavaPractice;

public class InterviewKit1 {

	public static void main(String[] args) {
//Reverse a string
		String s="Anuradha";
		String rev="";
		for(int i=(s.length()-1);i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
//remove special characters from a string
		String s1="@NUR@DH@ $@#U";
		//this replaces just one character
		System.out.println(s1.replace("@", "A"));
		
		//using regular expressions-[^a-zA-Z0-9]
		String regex=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(regex);

//reverse an integer
		int integer=12345;
		String convert=String.valueOf(integer);
		String finalresult="";
		
		for(int i=convert.length()-1;i>=0;i--) {
			finalresult=finalresult+convert.charAt(i);
		}
		System.out.println(finalresult);
		//using string buffer
		System.out.println(new StringBuffer(String.valueOf(integer)).reverse());
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



}
