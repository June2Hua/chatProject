package com.zjh.project4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

class ClientThread extends Thread{
	private Socket socket=null;//Socket对象
	private BufferedReader reader=null;//缓冲流读取信息
	private String threadName;
	//构造函数
	public ClientThread(String threadName,Socket socket) throws IOException{
		super(threadName);//为线程创建名字threadName
		this.threadName=threadName;//线程的名字
		this.socket=socket;
		//初始化reader对象
		reader=new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
	}
	//重写多线程run方法,用于监听来自服务器的消息
	@Override
	public void run() {
		String tmp;//用于保存读取的信息
		try{
			while(true){
				if((tmp=reader.readLine())!=null){//读取到信息
					System.out.println(tmp);//输出内容
					System.out.println("请输入发送信息:");
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
	
}
