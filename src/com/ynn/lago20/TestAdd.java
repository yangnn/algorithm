package com.ynn.lago20;

/**
 * ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡� 
 * 1.�����������ץס�������ĸ�ı仯����
 * @author yangnn
 *
 */
public class TestAdd {

	public static void main(String args[]){
		
		double a = 1.0; 
		double b = 1.0;
		double c = 0;
		double sum = 0;
		
		for(int i = 0; i < 20 ; i++){
			c = a + b;
			sum += c/a;
			b = a;
			a = c;
		}
		System.out.println(sum);
		
	}
	
}
