package service;

public class CountNotes {
	public void notesCountImplementation(int notes[], int amount) {

		int[] noteCounter = new int[notes.length];
		boolean flag = false ;
		if (amount==0)
		{
			System.out.println("Amount value is Zero therefore no Notes need to be given");
		}
		else {
			if(amount < notes[0]) {
				System.out.println("Amount values is less then the least currency Note");
			}
			else {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
				if(amount==0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Exact amount cannot be given");
				System.out.println("Remaining value of "+ amount +" cannot be attained with the currency value");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
		
			}
		}
	}
}
