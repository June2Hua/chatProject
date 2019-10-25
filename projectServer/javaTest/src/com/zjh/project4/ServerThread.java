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
//接收信息
public class ServerThread extends Thread{//服务端线程，用于接收客户端的信息，并转发给所有的客户端
	private Socket socket=null;//监听的Socket端口
	private BufferedInputStream reader=null;//客户端缓冲流
	private PrintStream printer=null;//打印流
	private OutputStream output;
	//构造函数初始化
	public ServerThread(Socket socket) throws IOException{
		this.socket=socket;
		reader=new BufferedInputStream(socket.getInputStream());
	}
	//线程
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String tmp=null;//收到客户端的信息
		int sum;
		byte[] data=new byte[1024];
		try {
			//客户端接收服务端的消息
			while((sum=reader.read(data))>0){
				tmp=new String(data,0,sum);
				//接收文件,传输文件的标记为    file:+文件名
				if(tmp.startsWith("file")){
					//保存临时文件
					String PATH=tmp.substring(tmp.indexOf(":")+1);
					//保存在服务端的文件,存放在当前目录下
					output=new FileOutputStream(new File(PATH));
					while((sum=reader.read(data))>0){
						tmp=new String(data,0,sum);
						output.write(data,0,sum);
						if(sum<1024)
							break;
					}
					//临时文件依次发送给每个注册的客户端
					for(Socket s:ChatServer.sockets){//依次发送到所有加入list的Socket中
						if(socket!=s){
							output=s.getOutputStream();//创建对应的打印流
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
							//发送文件的内容到每个客户端
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
				//接收消息
				}else{
					for(Socket s:ChatServer.sockets){//依次发送到所有加入list的Socket中
							printer=new PrintStream(s.getOutputStream());//创建对应的打印流
							printer.println(tmp);//打印收到的信息
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
