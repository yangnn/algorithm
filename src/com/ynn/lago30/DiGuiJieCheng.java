package com.ynn.lago30;

/**
 * ��Ŀ�����õݹ鷽����5!
 * 1.����������ݹ鹫ʽ��fn=fn_1*4!
 * @author yangnn
 *
 */
public class DiGuiJieCheng {

	public static void main(String args[]){
		System.out.println(fn(5));
	}
	
	public static int fn(int x){
		if(x > 1){
			return x * fn(x-1);
		}else{
			return 1;
		}
	}
	
}
