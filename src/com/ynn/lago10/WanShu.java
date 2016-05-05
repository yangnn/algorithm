package com.ynn.lago10;

/**
 *  题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。 例如6=1＋2＋3.编程 找出1000以内的所有完数。
 * @author yangnn
 *
 */
public class WanShu {

	public static void main(String args[]){
		int k = 2;
		int temp = 1;
		int j = 0;
		int num = 0;
		for(num = 1; num <= 1000; num++){
			k = 2;
			temp = 1;
			j = num;
			while(j >= k){
				if(j % k == 0){
					temp += k;
					j = j / k;
				}else{
					k++;
				}
			}
			if(temp == num){
				System.out.println(num);
			}
		}
	}
}
