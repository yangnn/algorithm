package com.ynn.lago10;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。 1.程序分析：关键是计算出每一项的值。
 * @author yangnn
 *
 */
public class NumAdd {
	
	public static void main(String args[]){
		System.out.println("请输入数字0-9");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("请输入数字重复次数");
		int b = sc.nextInt();
		int s = 0;
		for(int i = b; i>0; i--){
			s += a * i * Math.pow(10, (b-i));//Math.pow(底数,几次方)
		}
		System.out.println(s);
	}
}
