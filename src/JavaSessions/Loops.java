package JavaSessions;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do-while
		int h=1;
		do{
			System.out.println(h);
			h++;
		}while(h<10);
		
		//while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//for loop
		for(int j=1;j<=100;j++) {
			System.out.println(j);
		}

		/*Infite Loop
		for(;;) {
			System.out.println("welcome");
		}
		*/

		for(char c='a';c<='z';c++) {
			System.out.println(c);
			System.out.println(c+0);//prints the acsii value
		}
		for(int even=0;even <=10;even=even+2) {
			System.out.println(even);
		}
		for(int eve=0;eve<=10;) {
			if(eve%2==0) {
				System.out.println("even");
			}
			eve++;
		}
	}

}
