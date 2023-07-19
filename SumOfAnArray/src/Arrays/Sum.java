package Arrays;

public class Sum {
	
	static int[] array= {1,3,4,8,16,32,64};
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum= sum+ array[i];
			
		}
		System.out.println(sum);
	}

}
