package com.ynn.lago20;

import java.util.Scanner;

/**
 * ��Ŀ��������������x,y,z���������������С��������� 
 * 1.���������������취����С�����ŵ�x�ϣ�
 * �Ƚ�x��y���бȽϣ����x>y��x��y��ֵ���н�����
 * Ȼ������x��z���бȽϣ����x>z��x��z��ֵ���н�����������ʹx��С��
 * @author yangnn
 *
 */
public class TestCompare {

	public static void main(String args[]){
		System.out.println("������3������");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int temp = 0;
		if(x > y){
			temp = y;
			y = x;
			x= temp;
		}
		if(y > z){
			temp = y;
			y = z;
			z= temp;
		}
		if(x > y){
			temp = y;
			y = x;
			x= temp;
		}
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
}
