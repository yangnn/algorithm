package com.ynn.lago30;

/**
 * ��Ŀ����5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ�ʵ������ˣ���˵�ȵ�2�˴����ꡣ
 * �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ
 * ����ʵ�һ���ˣ���˵��10�ꡣ
 * ���ʵ�����˶�� 
 * 1.������������õݹ�ķ������ݹ��Ϊ���ƺ͵��������׶Ρ�
 * Ҫ��֪�����������������֪�������˵�����,�������ƣ��Ƶ���һ�ˣ�10�꣩���������ơ�
 * @author yangnn
 *
 */
public class TestAge {

	public static void main(String args[]){
		System.out.println(age(5));
	}
	
	public static int age(int num){
		if(num > 1){
			return age(num - 1) + 2;
		}else{
			return 10;
		}
	}
}
