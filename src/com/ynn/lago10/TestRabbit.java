package com.ynn.lago10;


/**
 * ��������
 * 쳲�����������ֵ
 *��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 *С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
 *1.��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
 */
public class TestRabbit {

	public static final int MOUTH = 15;
	
//	public static void main(String args[]){
//		long f1 = 1;
//		long f2 = 2;
//		long f;
//		
//		for(int i = 3; i <MOUTH; i++){
//			f = f1 + f2;
//			f1 = f2;
//			f2 = f;
//			System.out.println("��" + i +"���µ����Ӷ���Ϊ" + f2); 
//		}
//	}
	
	//�ݹ鷽��
	public static void main(String args[]){
		for(int i = 1; i < MOUTH; i++){
			System.out.println("��" + i +"���µ����Ӷ���Ϊ" + fib(i)); 
		}
	}
	
	public static int fib(int mouth){
		if(mouth == 1 || mouth == 2){
			return 1;
		}else{
			return fib(mouth-1) + fib(mouth-2);
		}
	}
	
}
