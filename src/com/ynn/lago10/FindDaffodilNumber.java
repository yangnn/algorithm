package com.ynn.lago10;

/**
 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
 * ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
 * 1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 * @author yangnn
 *
 */
public class FindDaffodilNumber {

	public static void main(String args[]){
		int a,b,c,data;
		for(int i = 100; i < 1000; i++){
			a = i / 100;
			b = i%100/10;
			c = i%100%10;
			data = a*a*a+b*b*b+c*c*c;
			if(data == i)
				System.out.println(i);
		}
	}
	
}
