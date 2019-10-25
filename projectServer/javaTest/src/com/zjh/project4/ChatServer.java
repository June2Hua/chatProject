package com.zjh.project4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
	//用于保存接受到客户端的Socket,使用线程安全的list
	public static List<Socket> sockets=Collections.synchronizedList(new ArrayList<>());
	public static final int port=30000;//端口号
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(port);//服务器Socket
		while(true){
			Socket socket=server.accept();//接收是否有客户端发送请求
			System.out.println("接收到一个客户端请求");
			sockets.add(socket);//集合中添加Socket
			new ServerThread(socket).start();//启动线程接收客户端信息.
		}
	}

}
