package com.zjh.swingDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

import javax.swing.JTextArea;
//������Ϣ
//D:\clientFile\Hello.txt
public class ClientThread extends Thread{
	private Socket socket=null;//Socket����
	private BufferedInputStream reader=null;//��������ȡ��Ϣ
	private String threadName;
	private JTextArea showText;//��ʾ��
	//���캯��
	public ClientThread(String threadName,Socket socket,JTextArea showText) throws IOException{
		super(threadName);//Ϊ�̴߳�������threadName
		this.threadName=threadName;//�̵߳�����
		this.socket=socket;
		//��ʼ��reader����
		reader=new BufferedInputStream(this.socket.getInputStream());
		this.showText=showText;
	}
	//��д���߳�run����,���ڼ������Է���������Ϣ
	@Override
	public void run() {
		String tmp;//���ڱ����ȡ����Ϣ
		byte[] data=new byte[1024];
		int sum;
		try{
			while(true){
				//���յ�����
				if((sum=reader.read(data))>0){
					tmp=new String(data,0,sum);
					//����Ϊ�ļ�
					if(tmp.startsWith("file")){
						InputStream inputStream=socket.getInputStream();
						File dir=new File("D:\\"+threadName);
						dir.mkdir();//����Ŀ¼  ��  D��\�߳�����
						File file=new File("D:\\"+threadName+"\\"+tmp.substring(tmp.indexOf(":")+1));
						//�����ļ�
						OutputStream output=new FileOutputStream(file);
						while((sum=reader.read(data))>0){
							tmp=new String(data,0,sum);
							output.write(data,0,sum);
							System.out.println(tmp);
							System.out.println(sum);
							if(sum<1024)
								break;
						}
					//����Ϊ��Ϣ
					}else{
						showText.append(tmp);
					}
				}
			}
		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
	
}