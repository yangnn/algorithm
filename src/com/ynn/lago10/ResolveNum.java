package com.ynn.lago10;

/**
 * ���������ֽ� ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 * �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
 * (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
 * (2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
 * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
 * @author yangnn
 *
 */
public class ResolveNum {
	
	public static final int NUM = 80;
	
	public static void main(String args[]){
		
		int k = 2;
		int num = NUM;
		System.out.print(num + "=");
		
		while(num > k){
			if(num % k == 0){
				System.out.print(k + "*");
				num = num /k;
			}else{
				k++;
			}
		}
		System.out.print(k);
	}
	
	
}
