package com.ynn.lago20;

/**
 * ��Ŀ�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��
 *  �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ��
 *  ���Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١� 
 * 1.�����������ȡ����˼ά�ķ������Ӻ���ǰ�ƶϡ�
 * @author yangnn
 *
 */
public class MonkeyEatPeach {

	public static void main(String args[]){
		int num = 1;
		for(int i = 9; i > 0 ; i--){
			num = (num + 1) * 2;
			System.out.println("��" + i +"���֮ǰ��" + num);
		}
		System.out.println(num);
	}
}
