package com.ynn.lago10;

/**
 *  ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
 * �����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�
 * @author yangnn
 *
 */
public class TestBall {

	public static void main(String args[]){
		
		double sum = 100;
		double temp = 50;
		for(int i = 1; i < 10;i++){
			sum += temp*2;
			temp = temp * 0.5;
		}
		System.out.println(sum);
		System.out.println(temp);
		
	}
}
