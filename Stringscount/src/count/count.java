package count;

public class count {
	
	public static void main(String[] args) {
		String str="madhu i love you ";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
