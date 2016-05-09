package com.ynn.lago50;

import java.util.Scanner;

/**
 * 判断一个素数能被几个9整除 
 * @author yangnn
 *
 */
public class TestPrime45 {

	public static void main(String args[]){
		int m9=9,sum=9;
		int zi,n1=1,c9=1;
		System.out.println("请输入质数");
		Scanner sc = new Scanner(System.in);
		zi = sc.nextInt();
		while(n1!=0){ 
			if((sum%zi) == 0)
				n1=0;
			else{
				m9=m9*10;
				sum=sum+m9;
				c9++;
			}
		}
		System.out.println(sum +",can be divided by:"+c9);
	}
}
