import java.util.Scanner;
import java.util.Random;

public class MUD{
	public static void main (String[] args) {
		Room currentRoom, lobby, kitchen, reservoir, bedroom, library, ballroom, garden, out;
		lobby = new Room("lobby");
		kitchen = new Room("kitchen");
		reservoir =  new Room("reservoir");
		bedroom = new Room("bedroom");
		library = new Room("library");
		ballroom = new Room("ballroom");
		garden = new Room("garden");
		out = new Room("out");

//set exit
		lobby.setExit("north", ballroom);
		lobby.setExit("west", library);
	
		ballroom.setExit("east", kitchen);
		ballroom.setExit("west", bedroom);
		ballroom.setExit("south", lobby);

		kitchen.setExit("west", ballroom);
		kitchen.setExit("north", reservoir);

		reservoir.setExit("south", kitchen);

		bedroom.setExit("east", ballroom);
		bedroom.setExit("south", library);

		library.setExit("north", bedroom);
		library.setExit("east", lobby);
		library.setExit("south", garden);

		garden.setExit("north", library);

		currentRoom = lobby;

		Room[] all = {kitchen, reservoir, bedroom, garden, ballroom};
		Random random = new Random();
		int index = random.nextInt(all.length);
		int index2 = random.nextInt(all.length);
		Room princess = all[index];
		boolean isTaken = false;
		Room monster = all[index2];

		if (!princess.equals(monster)){
		
			System.out.println("Welcome to Castle MUD!\nHow to play:\n1. Type 'go direction' to explore, example: go east.\n2. Find the princess and take her out of the castle.\n3. Type 'end' to exit the game.\n");
			while (true){
			Scanner in = new Scanner(System.in);
			System.out.println("You are in " + currentRoom.name());
			System.out.println("There are " + currentRoom.size() + " exit doors: " + currentRoom.getExit()+"\n");
			String user = in.next();
			if (user.equals("end")){
				break;
			} else {
			String dir = in.next();
			Room nxt = currentRoom.getNext(dir);
			if (nxt != null){
				currentRoom = nxt;
			} else {
				System.out.println("You can't go that way!\n");
			}
			if (nxt.equals(princess)){
				if (isTaken == false){
				System.out.println("Who's that beautiful woman? Let's take her out!");
				isTaken = true;
				lobby.setExit("out", out);
				} 
			}
			if (nxt.equals(monster)){
				System.out.println("Game over");
				break;
			}
			if (nxt.equals(out)){
				System.out.println("Princess: \nThank you for saving my life!");
				break;
			}
			}			
			} 
}
}
}
			




