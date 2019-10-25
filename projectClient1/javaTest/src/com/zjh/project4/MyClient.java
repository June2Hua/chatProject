package com.zjh.project4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class MyClient {
	public static final String ip="127.0.0.1";//��������ip��ַ
	public static final int port=30000;//�������Ķ˿ں�
	public static void main(String[] args)throws Exception{
		Socket socket=new Socket(ip,port);//��������������ӵ�Socket
		Scanner scanner=new Scanner(System.in);//���̵�����
		String tmp;//�û����͵�server��info
		PrintStream printer=new PrintStream(socket.getOutputStream());//���ڷ�����Ϣ��server
		//�����ͻ����̣߳����ڼ�����������Ϣ
		System.out.println("�������û���:");
		String name=scanner.nextLine();
		ClientThread client=new ClientThread(name,socket);
		client.start();
		//�������ڷ�����Ϣ��server
		System.out.println("�����뷢����Ϣ:");
		while((tmp=scanner.nextLine())!=null){
			System.out.println("�����뷢����Ϣ:");
			printer.println(client.getName()+":"+tmp);//�����Ϣ��server��
		}
	}
}



