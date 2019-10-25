package com.zjh.project3;

public class Station extends Thread{
	public static int total=20;//票的张数
	
	public Station(String name){
		super(name);//调用父类构造函数，初始化线程名字
	}
	
	@Override
	public void run() {
		//重写run 方法
		while(true){//若还有剩票，则继续售票
			synchronized (this.getClass()) {//对类加锁
				if(total>0){//若还有存票
					System.out.println(getName()+"卖出了第"+(21-total)+"张票。");//输出售票情况
					total--;//售票，票数减1
				}else{//票数为0
					break;
				}
				
			}
			try{
				sleep(1000);//当前线程休眠1秒
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

