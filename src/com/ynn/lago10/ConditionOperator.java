package com.ynn.lago10;

import java.util.Scanner;

/**
 * ���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
 * ���������(a>b)?a:b��������������Ļ������ӡ�
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
