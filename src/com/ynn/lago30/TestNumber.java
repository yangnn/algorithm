package com.ynn.lago30;

import java.util.Scanner;

/**
 * ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 * @author yangnn
 *
 */
public class TestNumber {

	public static void main(String args[]){
		System.out.println("�����벻����5λ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 100000 || num < 1){
			System.out.println("��������������ȷ");
		}
		int len = 0;
		while(num != 0){
			System.out.print(num %10);
			num = num /10;
			len++;
		}
		System.out.println();
		System.out.println("�ܳ���Ϊ" + len);
	}
}
