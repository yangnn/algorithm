package com.ynn.lago30;

/**
 * ��Ŀ����1+2!+3!+...+20!�ĺ� 
 * 1.����������˳���ֻ�ǰ��ۼӱ�����۳ˡ�
 * @author yangnn
 *
 */
public class JieCheng {

	public static void main(String args[]){
//		long sum = 0;
//		long temp =1;
//		for(int i = 1; i <= 20; i++){
//			temp = 1;
//			for(int j = 2 ; j <= i ;j++){
//				temp =  temp * j;
//			}
//			System.out.println(temp);
//			sum += temp;
//		}
//		System.out.println(sum);
		
		long sum = 0;
		long temp = 1;
		for(int i =1; i <= 20; i++){
			temp = temp *i;
			sum += temp;
		}
		System.out.println(sum);
	}
}
