package com.ynn.lago20;

/**
 * ��Ŀ�����9*9�ھ��� 
 * 1.����������������п��ǣ���9��9�У�i�����У�j�����С�
 * @author yangnn
 *
 */
public class Nine {

	public static void main(String args[]){
		
		for(int i = 1; i < 10 ; i++){
			for(int j = 1; j< 10 ;j++){
				System.out.print(i + "*" + j + "=" + i*j + "  ");
			}
			System.out.println();
		}
		
	}
}
