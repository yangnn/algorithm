package com.ynn.lago10;

/**
 *  ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"�� ����6=1��2��3.��� �ҳ�1000���ڵ�����������
 * @author yangnn
 *
 */
public class WanShu {

	public static void main(String args[]){
		int k = 2;
		int temp = 1;
		int j = 0;
		int num = 0;
		for(num = 1; num <= 1000; num++){
			k = 2;
			temp = 1;
			j = num;
			while(j >= k){
				if(j % k == 0){
					temp += k;
					j = j / k;
				}else{
					k++;
				}
			}
			if(temp == num){
				System.out.println(num);
			}
		}
	}
}
