package journal; 
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Journal {
	
	private LinkedList<String> entries = new LinkedList<>();        //Linked list
	private Stack<String> journalundo= new Stack<>();               //Stack 
	private Queue <String> journalentry = new LinkedList<>();       //Queue
	Scanner input=new Scanner(System.in);                           //Scanner class to allow input of entries

public void newEntry() {            //linked list for storing all entries
	System.out.println("Today's entry: ");
	 {
	String entry= input.nextLine();
    entries.add(entry);            //adds whatever entry is entered to the linked list
    journalundo.push(entry);       //pushes to the stack
    journalentry.add(entry);       //adds to the queue
	}
	
}
	
public void seeEntry() {            //queue for viewing the entries 
	System.out.println("Your entries: ");
	
	for(String entry : entries){
	System.out.println(" "+ journalentry);	
	}
	
}
public void undoEntry() {           //stack for undoing a recently added entry
	
	String entriesToRemove=journalundo.pop();
	entries.remove(entriesToRemove);
	
}

 
	public static void main(String[] args) {
		Journal journal = new Journal();
		
		journal.newEntry();
		journal.seeEntry();
		journal.undoEntry();
		

	}

}
