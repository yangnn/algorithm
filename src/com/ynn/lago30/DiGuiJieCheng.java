package com.ynn.lago30;

/**
 * 题目：利用递归方法求5!
 * 1.程序分析：递归公式：fn=fn_1*4!
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
