import java.util.*;
import java.util.Scanner;
    public class ScoreDataProcessing{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
	    HashMap<String, String> sidname = new HashMap<String, String>();
	    //nested hashmap to store both the course initial and grade
	    HashMap<String, HashMap<String, String>> sidgrade = new HashMap<String, HashMap<String, String>>();
	    System.out.println("Enter the data below. Whitespace after comma is not allowed.\nFor example:\n3180300812,Adele\n3180300812,Java,95\nType EXIT when you are finished");
	    while (true) {
		String line = in.next();
		String[] sp = line.split(",");
		if (sp.length == 2){
		    sidname.put(sp[0], sp[1]);
		} 
		if (sp.length == 3){
		    boolean isKeyPresent = sidgrade.containsKey(sp[0]); 
		    if (isKeyPresent == false){
			sidgrade.put(sp[0], new HashMap<String, String>());
		    }
		    sidgrade.get(sp[0]).put(sp[1],sp[2]);
		} 
		if (line.equals("EXIT")){
		    break;
		}
	}
	System.out.println("Enter Student ID to check grades:");
	String id = in.next();
	System.out.println(id+", "+sidname.get(id)+", "+sidgrade.get(id).values().toString().replace("[","").replace("]",""));
	in.close();	
    }
    }

