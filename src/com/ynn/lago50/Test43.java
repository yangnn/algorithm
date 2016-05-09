package com.ynn.lago50;

/**
 * 求0—7所能组成的奇数个数。 
 * @author yangnn
 *
 */
public class Test43 {

	public static void main(String args[]){
		int sum = 4 + 4*7;
		int s = 4*7;
		for(int i = 1; i < 7; i++){
			s = s*8;
			sum += s;
		}
		System.out.println(sum);
	}
}
