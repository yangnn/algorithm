package com.ynn.lago20;

import java.util.Scanner;

/**
 *  题目：企业发放的奖金根据利润提成。 利润(I)低于或等于10万元时，奖金可提10%； 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
 * 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%； 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%， 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 * @author yangnn
 *
 */
public class MoneyAward {

	public static void main(String args[]){
		System.out.println("请输入利润");
		Scanner sc = new Scanner(System.in);
		long money = sc.nextLong();
		long reward = 0;
		if(money > 1000000){
			reward += (money-1000000) * 0.01;
			money = 1000000;
		}
		if(money > 600000){
			reward += (money-600000) * 0.15;
			money = 600000;
		}
		if(money > 400000){
			reward += (money-400000) * 0.03;
			money = 400000;
		}
		if(money > 200000){
			reward += (money-200000) * 0.05;
			money = 200000;
		}
		if(money > 100000){
			reward += (money-100000) * 0.075;
			money = 100000;
		}
		reward += money * 0.1;
		System.out.println(reward);
	}
	
}
