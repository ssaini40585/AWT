package com.example;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class DemoAwt6r  extends Frame{

	private TextField tx =new TextField("text field 1");
	private TextField tx2 =new TextField("text field 2");
	private TextField tx3 =new TextField("text field 3");
	
	DemoAwt6r(){
		this.setSize(600, 200);
		this.setVisible(true);
		this.setLocation(100, 50);
		
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 20 , 20);
		this.setLayout( layout);
		add(tx);
		add(tx2);
		add(tx3);
	}
	
}
