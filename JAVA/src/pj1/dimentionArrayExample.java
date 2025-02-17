package pj1;

import pj1.dimentionArray;

public class dimentionArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dimentionArray a = new dimentionArray();
		int[][] array1 = a.makeArray();
		
		for(var i = 0; i<array1.length;i++) {
			for(var j = 0;j< array1[i].length;j++) {
				System.out.println(array1[i][j]);
			}
		}
	
	}
}
