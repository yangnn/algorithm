package com.ynn.lago50;

/**
 *  ��Ŀ����̲����һ�����ӣ���ֻ�������֡���һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ������ֻ���ӰѶ��һ
 * �����뺣�У�������һ�ݡ��ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ������ͬ���Ѷ��һ�����뺣�� ��
 * ������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ��ʺ�̲��ԭ�������ж��ٸ����ӣ�
 * @author yangnn
 *
 */
public class MonkeyPeach41 {

	public static void main(String args[]){
		int n = 1;
		while(true){
			if(isSmallNumber(5*n +1)){
				break;
			}
			n++;
		}
		System.out.println(5*n+1);
	}
	
	public static boolean isSmallNumber(int number){
		int i = 0;
		while(i < 5 && number > 0){
			if((number-1) % 5 == 0){
				int temp = (number-1) / 5 +1;
				number -= temp;
				i++;
			}else{
				return false;
			}
		}
		return true;
	}
}
