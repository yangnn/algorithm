package com.ynn.lago10;

import java.util.Scanner;

/**
 * ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ����� 
 * 1.�������������while���,����Ϊ������ַ���Ϊ'\n'
 * @author yangnn
 *
 */
public class StChar {

	public static void main(String[] args){
		int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
        	if(Character.isDigit(ch[i])){
        		numCount++;
        	}else if(Character.isSpaceChar(ch[i])){
        		spaceCount++;
        	}else if(Character.isLetter(ch[i])){
        		abcCount++;
        	}else{
        		otherCount++;
        	}
        }
        System.out.println(str);
        System.out.println("��ĸ����Ϊ��"+ abcCount);
        System.out.println("�ո����Ϊ��"+ spaceCount);
        System.out.println("���ָ���Ϊ��"+ numCount);
        System.out.println("�����ַ�����Ϊ��"+ otherCount);
	}
}
