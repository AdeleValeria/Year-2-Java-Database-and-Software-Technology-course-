 import java.util.Scanner;
    public class SumofColumns{
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
	    int table[][]=new int[4][3];
    	    for(int row=0; row<4; row++){
        	for(int col=0;col<3;col++){
            	table[row][col]=in.nextInt();
		}
        	}
	    //System.out.println(table.length); -> to check the length of the row
		int scr;
		for (int i = 0; i<3; i++){
		scr = 0;
			for (int j = 0; j<4; j++){
			scr = scr + table[j][i];
    			}
		System.out.print(scr+" ");

    		}
    }
    }

