package stack;
import java.util.ArrayDeque;
public class BalancedParanthesis {
	
	static boolean Matching(char a, char b) {
		return (a=='('&&b==')'||a=='['&&b==']'||a=='{'&&b=='}');
	}

	public static void main(String[] args) {
		String s= "({[]})";
		ArrayDeque<Character> st= new ArrayDeque<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{st.add(c);}
			else if( st.isEmpty()==true)
			{
				System.out.println("not Mathcing");
			}
			else if(Matching(st.peek(),c)==false)
			{
				System.out.println("not Mathcing");
			}
			else st.pop();
		}
		if (st.isEmpty()==true)
			System.out.println("not Mathcing");
	}
}
// 