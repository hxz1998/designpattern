package com.learning.designmode.simpleFactory;

import static org.junit.Assert.*;
import org.junit.Test;
import com.learning.designmode.*;

public class OperateFactoryTest {

	@Test
	public void testCreateOperate() {
		Operate operate;
		operate = OperateFactory.createOperate("+");
		operate.setNumberA(1);
		operate.setNumberB(2);
		double result = operate.getResult();
		System.out.println(result);
		
	}

}
