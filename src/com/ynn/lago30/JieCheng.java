package com.ynn.lago30;

/**
 * 题目：求1+2!+3!+...+20!的和 
 * 1.程序分析：此程序只是把累加变成了累乘。
 * @author yangnn
 *
 */
public class JieCheng {

	public static void main(String args[]){
//		long sum = 0;
//		long temp =1;
//		for(int i = 1; i <= 20; i++){
//			temp = 1;
//			for(int j = 2 ; j <= i ;j++){
//				temp =  temp * j;
//			}
//			System.out.println(temp);
//			sum += temp;
//		}
//		System.out.println(sum);
		
		long sum = 0;
		long temp = 1;
		for(int i =1; i <= 20; i++){
			temp = temp *i;
			sum += temp;
		}
		System.out.println(sum);
	}
}
