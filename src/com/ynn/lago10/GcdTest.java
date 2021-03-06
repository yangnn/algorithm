package com.ynn.lago10;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 
 * 1.程序分析：利用辗除法。
 * @author yangnn
 *
 */
public class GcdTest {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int first = a;
		int second = b;
		int temp;
		
		if(a < b){
			temp = b;
			b = a;
			a = temp;
		}
		
		while(b != 0){
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println("最大公约数为"+ a);
		System.out.println("最小公倍数为"+ first*second/a);
	}
}
