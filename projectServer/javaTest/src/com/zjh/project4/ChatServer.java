package com.zjh.project4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
	//���ڱ�����ܵ��ͻ��˵�Socket,ʹ���̰߳�ȫ��list
	public static List<Socket> sockets=Collections.synchronizedList(new ArrayList<>());
	public static final int port=30000;//�˿ں�
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(port);//������Socket
		while(true){
			Socket socket=server.accept();//�����Ƿ��пͻ��˷�������
			System.out.println("���յ�һ���ͻ�������");
			sockets.add(socket);//���������Socket
			new ServerThread(socket).start();//�����߳̽��տͻ�����Ϣ.
		}
	}

}
