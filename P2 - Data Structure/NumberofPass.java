import java.util.Scanner;
public class NumberofPass{
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
	   	String s = in.nextLine();
		String temp[] = s.split(" ");
		String w = "pass";
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
   		if (w.equals(temp[i]))
      		count++;
		}	
		System.out.println(count);
	}
}
