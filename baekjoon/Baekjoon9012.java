package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count =Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			String test = br.readLine();
			Stack<Character> st = new Stack<Character>();
			for(int j=0;j<test.length();j++) {
				char temp=test.charAt(j);
				if(temp=='(') 
					st.push(temp);
				else if(temp==')')
					st.pop();
			}
			if(st.empty()==true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
