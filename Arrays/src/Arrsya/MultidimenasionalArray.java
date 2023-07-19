package Arrsya;

import java.util.Iterator;

public class MultidimenasionalArray {

	public static void main(String[] args) {
		int[][] a = {{1,2,-3},{23,-45,66,45},{1,-2}};
		System.out.println(a[0].length);
		System.out.println(a[0][1]);
		System.out.println(a[2][1]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
			}
		}
	}
}
