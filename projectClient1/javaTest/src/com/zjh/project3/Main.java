package com.zjh.project3;

public class Main {

	public static void main(String[] args) {
		Station station1=new Station("窗口1");//窗口1
		Station station2=new Station("窗口2");//窗口2
		Station station3=new Station("窗口3");//窗口3
		station1.start();//开启线程窗口1
		station2.start();//开启线程窗口2
		station3.start();//开启线程窗口3
	}
}
