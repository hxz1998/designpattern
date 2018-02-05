package com.learning.designmode.singleInstance;

import static java.lang.System.out;

public class Session {
	
	private static Session session = null;
	
	static {
		session = new Session();
		System.out.println("静态代码块注入");
	}
	
	private Session() {
		out.println("构造了一个会话");
	}

	public static Session getInstance(){
//		return session = new Session();
		return session;
	}
	
	public void init() {
		System.out.println("init()");
	}
}
