package com.zjh.project4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

class ClientThread extends Thread{
	private Socket socket=null;//Socket����
	private BufferedReader reader=null;//��������ȡ��Ϣ
	private String threadName;
	//���캯��
	public ClientThread(String threadName,Socket socket) throws IOException{
		super(threadName);//Ϊ�̴߳�������threadName
		this.threadName=threadName;//�̵߳�����
		this.socket=socket;
		//��ʼ��reader����
		reader=new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
	}
	//��д���߳�run����,���ڼ������Է���������Ϣ
	@Override
	public void run() {
		String tmp;//���ڱ����ȡ����Ϣ
		try{
			while(true){
				if((tmp=reader.readLine())!=null){//��ȡ����Ϣ
					System.out.println(tmp);//�������
					System.out.println("�����뷢����Ϣ:");
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
	
}
