package max;

public class Maximun {
	
	static int [] array= {1,34,23,32,345,435,5678,654,3456};
	public static void main(String[] args) {
		int max= array[0];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					max=array[i];
				}
				
			}
			
			
		}
		System.out.println(max);
		
	}
}
