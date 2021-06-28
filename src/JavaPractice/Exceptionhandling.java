package JavaPractice;

public class Exceptionhandling {

	public static void main(String[] args) {
/*exception-differnt from error
 * super class of all teh exceptions are exception class
 * if we dont knw what exception we r expecting then catch(exception e)
 * super clss of exception is throwable class
	*/
		try {
			throw new Exception("Some Exception");
				
		}catch(Exception e) {
			System.out.println("Some exception is coming");
		}
//Throw is used when we delibrately want to use our own exception
		String data=null;
		if(data==null) {
			try {
				throw new Exception("Data not found");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
//finally blcok will always be executed
		try {
			int i=9/0;
		}catch(Exception e){
			System.out.println("AE");
		}
		finally {
			System.out.println("finally block");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
