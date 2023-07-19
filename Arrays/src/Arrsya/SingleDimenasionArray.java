package Arrsya;

public class SingleDimenasionArray {
	
	public static void main(String[] args) {
		
		int [] num= {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		double average;
		for (int i : num) {
			sum +=i;
			
		}
		int numlength= num.length;
		average= (double)sum/(double)numlength;
		System.out.println("sum is "+sum);
		System.out.println("average is :"+average);
		int [] n= num;

		for (int nn : n) {
			System.out.print(nn+ " ");
			
		}
		System.out.println( " ");
		for(int i=0; i<numlength;i++) {
			int temp=num[i];
			System.out.print(temp+ " ");
		}
	}

}
