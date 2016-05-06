package com.ynn.lago30;

/**
 * 题目：求100之内的素数 
 * @author yangnn
 *
 */
public class SuShu {

	public static void main(String args[]){
		int k = 0;
		int flag = 0;
		for(int i = 2; i < 100; i++){
			flag = 0;
			k = (int) Math.sqrt(i);
			for(int j = 2;j <= k; j++){
				if(i % j == 0){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println(i);
			}
		}
	}
}
