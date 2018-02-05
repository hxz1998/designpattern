package com.learning.designmode.simpleFactory;

public class OperateAdd extends Operate {

	/* £¨·Ç Javadoc£©
	 * @see com.learning.designmode.Operate#getResult()
	 * 
	 */
	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}
	
}
