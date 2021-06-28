package JavaPractice;

public class stringmanipulation {

	public static void main(String[] args) {

		String str="This is a java code and i am so happy ";
		
		//length of a string-calculates inclusing space
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(8));

		//characters at index
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('i',3));
		
		//trim- trims spaces from corners
		String s="        Anu              ";
		System.out.println(s);
		System.out.println(s.trim());
		
		//replace-removes the old values with new ones
		String DOB="07-01-1992";
		System.out.println(DOB.replace("-", "/"));
		
		//Upper case
		String uc="i am selenium expert";
		System.out.println(uc.toUpperCase());
		
		//lower case
		String lc="I AM EXPERT IN JAVA";
		System.out.println(lc.toLowerCase());
		
		//substring-capturing small strings in big strng
		
		String s3="We're sorry. The Web address you entered is not a functioning page on our site.";
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(7, 12));
		
		//Split-returntype- string array[]
		String Lang="Java_Python_Ruby_CSharp_C++";
		String lang[]=Lang.split("_");
		System.out.println(lang[0]);
		
		//printing all the values of array
		for(String e:lang) {
			System.out.println(e);
		}
		
		String st="xXtestingXxXseleniumXXxXjavax";
		String S[]=st.split("xX");
		System.out.println(S[0]);
		System.out.println(S[1]);
		System.out.println(S[2]);
		System.out.println(S[3]);

		//reverse a string
		String r="Selenium";
		char c[]=r.toCharArray();
		String rev="";
		for(int i=r.length()-1;i>=0;i--) {
			rev=rev+r.charAt(i);
		}
		System.out.println(rev);
		
		//waf to reverse a string
		System.out.println(reverse("ANU"));
		
		//contains-gives boolean result
		String test="Welcome Admin";
		System.out.println(test.contains("Admin"));
		
		//concat
		String st1="Anuradha";
		String st2="Sahu";
		System.out.println(st1.concat(st2));
		
		//equals-comparison
		String p1="Selenium code";
		String p2="Selenium code";
        System.out.println(p1.equals(p2));
		

		
	}
	
	public static String  reverse(String str) {
		
			String rev="";
			for(int i=rev.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			return rev;
	}

}
