package StringQ;
import java.util.Scanner;

public class frequencyStringInArr {

	public static void main(String[] args) {
		int st[]=new int[26];
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			st[s.charAt(i)-'a']++;
		}
		for (int i=0;i<26;i++)
		{
			if(st[i]>0)
				System.out.println((char)(i+'a')+"-"+st[i]);
		}
		sc.close();
	}

}
