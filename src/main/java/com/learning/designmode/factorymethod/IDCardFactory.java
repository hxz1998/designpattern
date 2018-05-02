package com.learning.designmode.factorymethod;

import com.learning.designmode.factorymethod.framework.Creator;
import com.learning.designmode.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Creator {

    private List<Product> users = new ArrayList<>();

    @Override
    protected Product createProduct(String name) {
        System.out.println("制造了 ： " + name + " 的卡片");
        return new IDCard(name);
    }

    @Override
    protected void registerProduct(Product product) {
        users.add(product);
        System.out.println("注册了 ： " + ((IDCard)product).getName());
    }
}
