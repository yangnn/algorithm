package com.ynn.lago10;

import java.util.Scanner;

/**
 * ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
 * ����������м��̿��ơ� 1.����������ؼ��Ǽ����ÿһ���ֵ��
 * @author yangnn
 *
 */
public class NumAdd {
	
	public static void main(String args[]){
		System.out.println("����������0-9");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("�����������ظ�����");
		int b = sc.nextInt();
		int s = 0;
		for(int i = b; i>0; i--){
			s += a * i * Math.pow(10, (b-i));//Math.pow(����,���η�)
		}
		System.out.println(s);
	}
}
