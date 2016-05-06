package com.ynn.lago30;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * @author yangnn
 *
 */
public class TestNumber {

	public static void main(String args[]){
		System.out.println("请输入不多于5位的正整数");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 100000 || num < 1){
			System.out.println("输入正整数不正确");
		}
		int len = 0;
		while(num != 0){
			System.out.print(num %10);
			num = num /10;
			len++;
		}
		System.out.println();
		System.out.println("总长度为" + len);
	}
}
