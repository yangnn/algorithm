package com.ynn.lago20;

import java.util.Scanner;

/**
 *  ��Ŀ����ҵ���ŵĽ������������ɡ� ����(I)���ڻ����10��Ԫʱ���������10%�� �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
 * ����10��Ԫ�Ĳ��֣��ɿ����7.5%��20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%�� 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%�� ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ��Ӽ������뵱������I����Ӧ���Ž���������
 * 1.����������������������ֽ磬��λ��ע�ⶨ��ʱ��ѽ�����ɳ����͡�
 * @author yangnn
 *
 */
public class MoneyAward {

	public static void main(String args[]){
		System.out.println("����������");
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
