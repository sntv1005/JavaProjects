package programs;

import java.util.StringJoiner;

public class STringJoinere {
	
	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner("&","#","#");
		sj.add("shsh");
		sj.add("dhdh");
		sj.add("hdhdh");
		System.out.println(sj);
		
	}

}
