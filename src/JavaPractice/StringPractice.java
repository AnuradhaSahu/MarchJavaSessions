package JavaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
//String to date conversion
		
		String date="1990-02-02";// yy-mm-dd
		LocalDate dat =LocalDate.parse(date,DateTimeFormatter.ISO_DATE);
		System.out.println(dat);
		
//compare 2 strings
		String s1="The Boeing 747 ";
		String s2=" this year's Australian rules";
		
		if(s1==s2) {
			System.out.println("String equal");
		}else {
			System.out.println("String not equal");
		}
//verify if a string is numeric
		String N="12345";
		System.out.println(N.contains("1"));
		boolean numeric=true;
		try {
			Double d=Double.parseDouble(N);
			
		}catch(NumberFormatException e) {
			numeric=false;

		}
		
		if(numeric) {
			System.out.println("String is numeric "+N);
		}else {
			System.out.println("String is not numeric");
		}
		
//verify if 2 strings are anagrams-
		String st1="DOG";
		String st2="GOD";
	   
		if(st1.length()==st2.length()) {
			
			char[] c1= st1.toCharArray();
			char[] c2=st2.toCharArray();
			
			Arrays.sort(c2);
			Arrays.sort(c1);

			boolean result=Arrays.equals(c1, c2);
			
			if(result) {
				System.out.println(st1 +" and "+ st2 + " are anagrams");
			}			
		}
		
//verify if a string contains a substring
		String str="Welcome to Maldives Enjoy your stay";
		String mal="Maldives";
		String sta="Stay";
		
          boolean result=str.contains(mal);
          if(result) {
	         System.out.println("contains substring "+ mal);
             }else {
	           System.out.println("does not contains substring"+mal);
              }
            result=str.contains(sta);
           if(result) {
	          System.out.println("contains substring "+ sta);
           }else {
	            System.out.println("does not contains substring "+sta);
               }

//iterate through each character of a string;

           String it="Testing Selenium";
           char[] ch=it.toCharArray();
           for(char e:ch) {
        	   System.out.println(e);
           }
		
 //create random stringd
           
		
		
		
		
		
	}

}
