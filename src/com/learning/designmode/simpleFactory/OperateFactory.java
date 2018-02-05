package com.learning.designmode.simpleFactory;

public class OperateFactory {
	private static Operate operate;
	static Operate createOperate(String type) {
		switch(type) {
		case "+":operate = new OperateAdd();break;
		case "/":operate = new OperateDiv();break;
		}
		return operate;
	}
}	
