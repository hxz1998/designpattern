package com.learning.designmode.simpleFactory;
/**
 * 运算类
 * @author Mr.Hu
 *
 */
public class Operate {
	private double numberA;	
	private double numberB;
	/**
	 * @return numberA
	 */
	public double getNumberA() {
		return numberA;
	}
	/**
	 * @param numberA 要设置的 numberA
	 */
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	/**
	 * @return numberB
	 */
	public double getNumberB() {
		return numberB;
	}
	/**
	 * @param numberB 要设置的 numberB
	 */
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	/**
	 * @return 计算结果
	 */
	public double getResult() {
		return 0;
	}
	
}
