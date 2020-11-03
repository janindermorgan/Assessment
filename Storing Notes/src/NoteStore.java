import java.util.Scanner;
public class NoteStore extends TextNote {


		public void storeNote() {
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Note: ");
		String note = ref.next();
		System.out.println("Enter Image URL: ");
		String url = ref.next();

		TextAndImageNote textandimage = new TextAndImageNote();
		TextNote text = new TextNote();
	
		if(url !="") {
			textandimage.TextAndImageNote(note, url);
		}
		else {
			text.TextNote(note);
			
		}
		}
		
		//Can't figure out how to create and save into an array
		public ArrayList<TextNote> getAllTextNotes() {
			
			
		}
		public void getAllTextAndImageNotes() {
			//System.out.println(TextandImageNotes[i]);
		}
	}

