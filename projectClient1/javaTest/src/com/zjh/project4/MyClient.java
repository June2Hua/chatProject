package com.zjh.project4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class MyClient {
	public static final String ip="127.0.0.1";//服务器的ip地址
	public static final int port=30000;//服务器的端口号
	public static void main(String[] args)throws Exception{
		Socket socket=new Socket(ip,port);//创建与服务器连接的Socket
		Scanner scanner=new Scanner(System.in);//键盘的输入
		String tmp;//用户发送到server的info
		PrintStream printer=new PrintStream(socket.getOutputStream());//用于发送信息到server
		//开启客户端线程，用于监听服务器信息
		System.out.println("请输入用户名:");
		String name=scanner.nextLine();
		ClientThread client=new ClientThread(name,socket);
		client.start();
		//以下用于发送信息到server
		System.out.println("请输入发送信息:");
		while((tmp=scanner.nextLine())!=null){
			System.out.println("请输入发送信息:");
			printer.println(client.getName()+":"+tmp);//输出信息到server端
		}
	}
}



