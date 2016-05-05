package com.ynn.lago10;

/**
 * 判断101-200之间有多少个素数，并输出所有素数。 
 * 判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数
 * @author yangnn
 *
 */
public class FindPrimeNumber {

	public static void main(String args[]){
		int count = 0;
		System.out.println("101-200之间素数有:");
		for(int i = 101; i <200; i++){
			if(i%2 != 0){
				System.out.print(i+",");
				count++;
			}
		}
		System.out.println("共"+ count +"个");
	}
	
}
