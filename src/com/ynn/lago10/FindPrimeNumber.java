package com.ynn.lago10;

/**
 * �ж�101-200֮���ж��ٸ���������������������� 
 * �ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮������
 * @author yangnn
 *
 */
public class FindPrimeNumber {

	public static void main(String args[]){
		int count = 0;
		System.out.println("101-200֮��������:");
		for(int i = 101; i <200; i++){
			if(i%2 != 0){
				System.out.print(i+",");
				count++;
			}
		}
		System.out.println("��"+ count +"��");
	}
	
}
