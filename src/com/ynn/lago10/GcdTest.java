package com.ynn.lago10;

import java.util.Scanner;

/**
 * ��Ŀ����������������m��n���������Լ������С�������� 
 * 1.�������������շ������
 * @author yangnn
 *
 */
public class GcdTest {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int first = a;
		int second = b;
		int temp;
		
		if(a < b){
			temp = b;
			b = a;
			a = temp;
		}
		
		while(b != 0){
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println("���Լ��Ϊ"+ a);
		System.out.println("��С������Ϊ"+ first*second/a);
	}
}
