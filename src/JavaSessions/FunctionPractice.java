package JavaSessions;

public class FunctionPractice {
	
	public int getStudentMarks(String StudentName){
		System.out.println("Student name is :"+StudentName);
		if(StudentName.equals("ANU")) {
			return 90;
		}else if(StudentName.equals("Robin")) {
			return 99;
			}
		else {
			System.out.println("Student Not found");
			return -1;
		}
	}

	public int getStuMark(String StuName) {
		System.out.println("Student Name as per record is :"+StuName);
		switch (StuName) {
		case "Amar": {
			System.out.println("AMar's marks:");
			return 57;
			}
		case "Ujala": {
			System.out.println("ujala's marks:");
			return 89;
			}
		case "Akash": {
			System.out.println("Akash's marks:");
			return 59;
			}
		default:
System.out.println("No student found");
return -1;
		}
	}
	
//waf i/p-browsername(string) and launch browser,return- browsername(string).
	public String launchbrowser(String browsername) {
		System.out.println("browsername is :"+browsername);
		switch (browsername) {
		case "Chrome": {
			System.out.println("Launch chrome");
			return "Chrome";
		}
		case "FF": {
			System.out.println("Launch FF");
			return "FF";
		}
		case "IE": {
			System.out.println("Launch IE");
			return "IE";
		}
		default:
System.out.println("Bropwser not found");
return null;
		}
	}
	
//waf i/p-browsername(string) and launch browser,return- browserversion(int).
	public int browserlaunch(int browserversion) {
		System.out.println("Launched browser version is :"+browserversion);
		switch (browserversion) {
		case 1: {
			System.out.println("launching Chrome version :");
			return 73;
			}
		case 2: {
			System.out.println("launching FF version :");
			return 78;
			}
		
		default:
System.out.println("No browser found");
return -1;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * WAF i/p-Studentname(String),o/p-marks(int)
 */
		FunctionPractice obj=new FunctionPractice();
		int s=obj.getStudentMarks("ZANA");
		System.out.println(s);

		int s1=obj.getStuMark("Akash");
		System.out.println(s1);
		
		String Launch=obj.launchbrowser("FF");
		System.out.println(Launch);
		
		int br=obj.browserlaunch(2);
		System.out.println(br);
	}

}
