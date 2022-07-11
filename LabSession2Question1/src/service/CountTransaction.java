package service;

public class CountTransaction {

	public int countTransaction(int target, int arraySize, int[] transactions){
		
		int sum=0;
		int flag=0;
		
		for(int i=0; i<arraySize;i++) {
			sum =sum+transactions[i];
				
				if(sum>=target) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					flag=1;
					break;
				}
		}
		
		return flag;
	}
	
}
