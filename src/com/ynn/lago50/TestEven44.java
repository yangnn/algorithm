package com.ynn.lago50;

import java.util.Scanner;

/**
 * 题目：一个偶数总能表示为两个素数之和。
 * @author yangnn
 *
 */
public class TestEven44 {

	public static void main(String[] args) {
		System.out.println("请输入一个偶数！");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 != 0 || n == 0){
			System.out.println("请输入正确的偶数!");
		}
		
		int a,b,c;
		
		for(a = 3; a <= n/2; a+=2){
			for(b = 2; b <= Math.sqrt(a); b++)
				if(a % b == 0) break;
			if(b > Math.sqrt(a)) 
				c = n - a;
			else
				break;
			for(b = 2; b <= Math.sqrt(c); b++)
				if(c % b == 0) break;
			if(b > Math.sqrt(c)) 
				System.out.println(n + "=" + a +"+" + c);
		}
	}
}
