package challenges;

public class ReverseAndReplace {

	public static void main(String[] args) {

		String str= "Language";
		StringBuilder sb = new StringBuilder();
		int c=1;
		
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)=='A'||str.charAt(i)=='a'||
					str.charAt(i)=='E'||str.charAt(i)=='e'||
					str.charAt(i)=='I'||str.charAt(i)=='i'||
					str.charAt(i)=='O'||str.charAt(i)=='o'||
					str.charAt(i)=='U'||str.charAt(i)=='u') { sb.append(c);
					c++;
					
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		sb.reverse();
		System.out.println(sb);
		
	}

}
