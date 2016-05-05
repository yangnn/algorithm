package com.ynn.lago10;

import java.util.Scanner;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 * @author yangnn
 *
 */
public class ConditionOperator {

//	public static final int score = 89;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(score >= 90?"A":score<60?"C":"B");
	}
	
}
