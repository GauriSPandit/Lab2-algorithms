package driver;

import java.util.Scanner;

import service.CountTransaction;

public class PayMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");// Request size of the Array
		int arraySize = sc.nextInt();
		int[] transactions = new int[arraySize];
		
		System.out.println("Enter the values of array");//Request the values of Array
		for(int i=0;i<arraySize;i++)//Accept the values of array 
			{
				transactions[i] = sc.nextInt();
			}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalNumOfTarget = sc.nextInt();
		
		while (totalNumOfTarget !=0) {
			
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
		
			CountTransaction countTransaction =new CountTransaction();
			int flag= countTransaction.countTransaction(target,arraySize, transactions);
			if(flag==0) {
				System.out.println("Given target is not achived");
			}
			totalNumOfTarget--;
		}
		
	}

}
