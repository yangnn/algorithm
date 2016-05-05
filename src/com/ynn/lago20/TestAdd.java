package com.ynn.lago20;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
 * 1.程序分析：请抓住分子与分母的变化规律
 * @author yangnn
 *
 */
public class TestAdd {

	public static void main(String args[]){
		
		double a = 1.0; 
		double b = 1.0;
		double c = 0;
		double sum = 0;
		
		for(int i = 0; i < 20 ; i++){
			c = a + b;
			sum += c/a;
			b = a;
			a = c;
		}
		System.out.println(sum);
		
	}
	
}
