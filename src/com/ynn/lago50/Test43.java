package com.ynn.lago50;

/**
 * ��0��7������ɵ����������� 
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
