package com.learning.designmode.simpleFactory;

public class OperateDiv extends Operate {

	/* £¨·Ç Javadoc£©
	 * @see com.learning.designmode.Operate#getResult()
	 */
	@Override
	public double getResult() {
		if(getNumberB() <= 0) {
			
		}
		return getNumberA() / getNumberB();
	}
	
}
