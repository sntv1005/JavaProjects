package count;

public class duplicate {
	public static void main(String[] args) {
		String str="madhu ammu i love you chinni";
				int count=0;
				char[] st=str.toCharArray();
				for(int i=0;i<str.length();i++) {
					for(int j=i+1;j<str.length();j++) {
					if(st[i]==st[j] && st[i]!=' ') {
						System.out.print(st[i]);
						count ++;
					}
				}
				}System.out.println(count);
				
				for(int i=st.length-1;i>=0;i--) {
					System.out.print(st[i]);
				}
				
		
		
	}
	

}
