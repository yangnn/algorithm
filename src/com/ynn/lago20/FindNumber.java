package com.ynn.lago20;

/**
 * ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣� 
 * 1.�����������10�������жϣ��Ƚ���������100���ٿ�����
 * �ٽ���������268���ٿ��������������Ľ�������������������ǽ����
 * @author yangnn
 *
 */
public class FindNumber {

	public static void main(String args[]){
		for(int i = 0; i < 100000; i++){
			if(Math.sqrt(i+100)%1 == 0 && Math.sqrt(i+168)%1 == 0){
				System.out.println(i);
			}
		}
	}
}
