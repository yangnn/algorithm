package com.ynn.lago30;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
 * @author yangnn
 *
 */
public class HuiWenShu {

	public static void main(String args[]){
		System.out.println("请输入一个5位整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 100000 || num < 10000){
			System.out.println("请输入正确的5位整数！");
		}
		
		if(num / 10000 == num % 10){
			if(num / 1000 % 10 == num % 100 /10){
				System.out.println(num + "是回文数");
			}else{
				System.out.println(num + "不是回文数");
			}
		}else{
			System.out.println(num + "不是回文数");
		}
	}
}
