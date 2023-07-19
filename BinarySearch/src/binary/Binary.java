package binary;

public class Binary {
	
	static public void binarysearch(int a[],int key) {
		
		int low=0;
		int high=a.length-1;
		int mid=low+high/2;
		while(low<=high) {
			if(mid==key) {
				System.out.println("element found at "+a[mid]);
				break;
			}
			else if(mid<key) {
				low=mid+1;
				break;
			} else {
				high=mid-1;
				break;
			}
		}
		
	
		
	}
	
	public static void main(String[] args) {
	
		int[] a= {1,2,3,4,5,6,7,8,10};
		int key=8;
		binarysearch(a,key);
	}

}
