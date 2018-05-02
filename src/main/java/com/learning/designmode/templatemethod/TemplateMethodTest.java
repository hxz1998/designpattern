package com.learning.designmode.templatemethod;

import org.junit.Test;

public class TemplateMethodTest {
    @Test
    public void test() {
        TemplateMethod templateMethod1 = new TemplateMethodImpl("HelloWorld");
        TemplateMethod templateMethod2 = new TemplateMethodImpl2("你好世界");
        templateMethod1.doPrint();
        templateMethod2.doPrint();
    }
}
