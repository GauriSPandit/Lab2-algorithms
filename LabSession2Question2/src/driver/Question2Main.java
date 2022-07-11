package driver;

import java.util.Scanner;

import service.CountNotes;
import service.MergeSortImplementation;

public class Question2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		CountNotes countNotes = new CountNotes();

		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] currencyNotes = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currencyNotes[i] = sc.nextInt();
		}
		
		mergeSortImplementation.mergeSort(currencyNotes,0,currencyNotes.length-1);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		countNotes.notesCountImplementation(currencyNotes, amount);
	}

}
