package com.learning.designmode.abstractfactory_new.factory;

public abstract class Factory {
    public static Factory getFactory(String name) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(name).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
