package com.zjh.project1_;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static int func() throws Exception{
		Scanner scanner=new Scanner(System.in);//获取输入
		System.out.println("请输入1-100之间的整数");//提示用户
		return scanner.nextInt();//返回用户输入的数字
	}
	public static void main(String[] args){
		Random random=new Random();//随机数类
		int randomNum=random.nextInt(100)+1;//产生1-100的随机数
		int inputNum=-1;//用户输入
		int total=0;//猜测的次数
		boolean flag=true;//flag用于判断是否继续循环
		Scanner scanner=new Scanner(System.in);
		while(flag){//判断是否继续
			flag=false;
			try{
				inputNum=func();//获取用户的输入
				total++;//猜测次数加1
			}catch(Exception e){
				flag=true;//若输入的类型为非整数，则继续循环
			}
			if(flag){//输入非整数，提示用户“输入了错误的字符”
				System.out.println("输入错误的字符");
			}else{//输入的数字为整数，判断是否猜对，并给出提示信息
				flag=true;//继续循环
				if(inputNum==randomNum){//猜中的情况
					System.out.println("恭喜你，猜中了");//提示猜中
					System.out.println("猜测的总次数为："+total);
					System.out.println("是否重新开始，重新开始请输入‘1’，其余情况为退出");//提示用户
					String restart=scanner.nextLine();//输入
					if("1".equals(restart)){//判断用户是否输入为“1”
						total=0;//猜测次数归零
						randomNum=random.nextInt(100)+1;//重新获得随机数
					}
					else//输入为非“1”情况
						flag=false;//退出，取消继续循环
				}else if(inputNum<randomNum)//数字偏小
					System.out.println("您输入的数字偏小了");
				else//数字偏大
					System.out.println("您输入的数字偏大了");
			}
		}
		System.out.println("游戏结束");
	}
}
