import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 char ch= sc.next().trim().charAt(0);
		 System.out.println(ch);
		 if(ch >='a'&&ch <='z')
		 {System.out.println("lcase");}
		 else
		 {System.out.println("ucase");}
		 sc.close();

	}

}
