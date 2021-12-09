import java.util.Scanner;
    public class LowerCase{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
	    String st = in.nextLine();
	    int lines = in.nextInt();
	    int table[][] = new int [lines][2];
	    String[] chr = new String[lines];
	    for (int row=0; row<lines; row++){
		for (int col=0; col<2; col++){
		    table[row][col] = in.nextInt();
		}
		chr[row] = in.next();
	    }
	    for (int i=0; i<lines; i++){
		for (int j=0; j<1; j++){
		String sub = st.substring(table[i][j], table[i][j+1]+1);
		String ch = chr[i];
		int occurance = sub.length() - sub.replace(ch,"").length();
		System.out.println(occurance);
		}
	    }
	    in.close();
	}
    }

