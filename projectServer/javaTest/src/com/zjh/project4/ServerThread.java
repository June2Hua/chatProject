package com.zjh.project4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
//������Ϣ
public class ServerThread extends Thread{//������̣߳����ڽ��տͻ��˵���Ϣ����ת�������еĿͻ���
	private Socket socket=null;//������Socket�˿�
	private BufferedInputStream reader=null;//�ͻ��˻�����
	private PrintStream printer=null;//��ӡ��
	private OutputStream output;
	//���캯����ʼ��
	public ServerThread(Socket socket) throws IOException{
		this.socket=socket;
		reader=new BufferedInputStream(socket.getInputStream());
	}
	//�߳�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tmp=null;//�յ��ͻ��˵���Ϣ
		int sum;
		byte[] data=new byte[1024];
		try {
			//�ͻ��˽��շ���˵���Ϣ
			while((sum=reader.read(data))>0){
				tmp=new String(data,0,sum);
				//�����ļ�,�����ļ��ı��Ϊ    file:+�ļ���
				if(tmp.startsWith("file")){
					//������ʱ�ļ�
					String PATH=tmp.substring(tmp.indexOf(":")+1);
					//�����ڷ���˵��ļ�,����ڵ�ǰĿ¼��
					output=new FileOutputStream(new File(PATH));
					while((sum=reader.read(data))>0){
						tmp=new String(data,0,sum);
						output.write(data,0,sum);
						if(sum<1024)
							break;
					}
					//��ʱ�ļ����η��͸�ÿ��ע��Ŀͻ���
					for(Socket s:ChatServer.sockets){//���η��͵����м���list��Socket��
						if(socket!=s){
							output=s.getOutputStream();//������Ӧ�Ĵ�ӡ��
							File file=new File(PATH);
							String fileName=new String("file:"+file.getName());
							output.write(fileName.getBytes());
							output.flush();
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							//�����ļ������ݵ�ÿ���ͻ���
							InputStream inputStream=new FileInputStream(file);
							BufferedInputStream reader=new BufferedInputStream(inputStream);
							while((sum=reader.read(data))>0){
								output.write(data,0,sum);
								if(sum<1024)
									break;
							}
							System.out.println("break;");
						}
					}
				//������Ϣ
				}else{
					for(Socket s:ChatServer.sockets){//���η��͵����м���list��Socket��
							printer=new PrintStream(s.getOutputStream());//������Ӧ�Ĵ�ӡ��
							printer.println(tmp);//��ӡ�յ�����Ϣ
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
