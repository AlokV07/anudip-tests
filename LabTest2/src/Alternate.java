
public class Alternate {

	// initialised the array
	
	public static void main(String[] args) {
		int []arr1 = {11,22,33,44,55,66,77,88,99,110};
		int []arr2 = new int[5];
		
		AlternateArray(arr1,arr2);

	}
	
	// static method for store the alternate value
	
	public static void AlternateArray(int []arr1,int []arr2) {
		int j=0;
		for (int i=0;i<arr1.length;i+=2) {
			arr2[j]=arr1[i];
			j++;
		}
		SumOfArray(arr2);
	}
	
	// static method for print the sum of the alternate array
	
	public static void SumOfArray(int []arr2) {
		int sum=0;
		for (int j=0;j<arr2.length;j++) {
			sum = sum+arr2[j];
		}
		System.out.println("Sum of Alternate Array is : "+sum);
	}
	

}
