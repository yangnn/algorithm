package com.ynn.lago30;

import java.util.Scanner;

/**
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ
 * @author yangnn
 *
 */
public class HuiWenShu {

	public static void main(String args[]){
		System.out.println("������һ��5λ����");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 100000 || num < 10000){
			System.out.println("��������ȷ��5λ������");
		}
		
		if(num / 10000 == num % 10){
			if(num / 1000 % 10 == num % 100 /10){
				System.out.println(num + "�ǻ�����");
			}else{
				System.out.println(num + "���ǻ�����");
			}
		}else{
			System.out.println(num + "���ǻ�����");
		}
	}
}
