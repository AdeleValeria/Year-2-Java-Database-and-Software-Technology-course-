import java.util.Scanner;
public class StringBuilder{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<=n; i++){
			sb.append(i);
		}
		String f = sb.toString();
		int flen = f.length();
		int a = in.nextInt();
		int b = in.nextInt();
		String s = f.substring(a,b+1);
		int c = in.nextInt();
		String d = Integer.toString(c);
		int occurance = s.length() - s.replace(d, "").length();
		System.out.println(flen+" "+occurance);
		in.close();
	}
}

