package com.zjh.swingDemo;

import java.awt.*;
import java.awt.event.*;
import java.text.MessageFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyClass extends Frame{
	public static void main(String[] args){
		JFrame frame=new JFrame("��¼");//���
		Label userLabel=new Label("�û���");//�û�����ǩ
		Label passwordLabel=new Label(" ����   ");//�����ǩ
		Button sureButton=new Button("ȷ��");//ȷ����ť
		sureButton.setPreferredSize(new Dimension(100,40));//���ð�ť��С
		TextField userText=new TextField();//�û���������
		userText.setPreferredSize(new Dimension(130,36));//����������С
		TextField passwordText=new TextField();//�û���������
		passwordText.setPreferredSize(new Dimension(130,36));//����������С
		Font font=new Font("����",Font.PLAIN,16);//��������Ϊ���壬��СΪ16
		userLabel.setFont(font);//��������
		passwordLabel.setFont(font);//��������
		passwordText.setEchoChar('*');
		Panel topPanel=new Panel();//��һ�м���
		topPanel.add(userLabel);//�û�����ǩ����
		topPanel.add(userText);//�û�����������
		Panel centerPanel=new Panel();//�ڶ��м���
		centerPanel.add(passwordLabel);//�û������ǩ����
		centerPanel.add(passwordText);//�û�������������
		Panel buttomPanel=new Panel();//�����м���
		buttomPanel.add(sureButton);//ȷ����ť����
		frame.setLayout(new GridLayout(3,1));//����Ϊ���񲼾֣�3��1��
		sureButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e){
				// TODO Auto-generated method stub
				
				if(passwordText.getText().equals("123456")){
					try {
						new ChatClient().init(userText.getText());
						frame.setVisible(false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					JOptionPane.showMessageDialog(null,"��¼ʧ��","��ʾ",JOptionPane.PLAIN_MESSAGE);
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		//������Frame��
		frame.add(topPanel);
		frame.add(centerPanel);
		frame.add(buttomPanel);
		frame.pack();//����Ӧ��С
		frame.setVisible(true);//��ʾ
	}
	
}