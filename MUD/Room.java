import java.util.HashMap;

public class Room{
	String x;
	HashMap<String, Room> exit = new HashMap<String,Room>();

public Room(String x){
	this.x = x;
	}

public void setExit(String dir, Room room){
	exit.put(dir, room);
	}

String name(){
	return x.toString();
	}

String getExit(){
	return exit.keySet().toString().replace("[","").replace("]","");
	}


Room getNext(String dir){
	return exit.get(dir);
}

int size(){
	return exit.size();
}
}

 
