package com.ynn.lago20;

/**
 * 题目：输出9*9口诀。 
 * 1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
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
