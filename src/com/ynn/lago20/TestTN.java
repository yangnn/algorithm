package com.ynn.lago20;

/**
 * ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣� 1.��������������ڰ�λ��ʮλ����λ�����ֶ���1��2��3��4��
 * ������е����к���ȥ �����������������С�
 * @author yangnn
 *
 */
public class TestTN {

	public static void main(String args[]){
		int num = 0;
		for(int i = 1; i < 5; i++){
			for(int j = 1; j < 5; j++){
				for(int k = 1; k < 5; k++){
					if(i != j && i != k && j != k){
						System.out.println(i * 100 + j * 10 + k);
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}
