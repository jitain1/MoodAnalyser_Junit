package com.bridgelabz;

public class MyException extends Exception {
	
	public MyException() {
	}
	
	enum Message {
		NULL, EMPTY;
	}
	
	public MyException(Message message) {
		super();			
	}
	
	
}