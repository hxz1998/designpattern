Design Pattern
---

迭代器模式（Iterator）
---
> 一个一个遍历

|名称|说明 |
|---|---|
|Aggregate|表示集合的接口|
|Iterator|遍历集合的接口|
|AggregateItem|集合中元素的接口（声明类接口）|

适配器模式（Adapter）
---
> 加个适配器以便复用

|名称|说明|
|---|---|
|Target|调用者要使用的接口|
|Adapter|适配者|
|Adaptee|被适配（也就是此处的Banner）|

* 说明：
    1. 方便新老系统接口适配
    2. 对同种框架的适配
    3. Android中的适配
 
模板方法（Template Method）
---
> 将具体的实现交给子类处理

|名称|说明|
|---|---|
|AbstractClass|确定了固定的处理逻辑，但是没实现核心的处理|
|ConcreteClass|具体类，实现了抽象类的核心处理|

工厂方法（Factory Method）
---
> 将具体的生产过程交给子类实现

|名称|说明|
|---|---|
|Creator|生产者，内部封装了具体的生产流程，但具体生产过程交给子类实现|
|Product|产品接口|

单例模式（Singleton）
---
> 只能有一个实例

|名称|说明|
|---|---|
|Singleton|内部将构造方法封装为`private`，对外暴露静态方法获取实例|

原型模式（Prototype）
---
> 通过复制产生实例

|名称|说明|
|---|---|
|Manager|负责控制原型的产生，对外提供获取实例的接口|
|Prototype|原型的抽象类或者接口|
|ConcretePrototype|上下文确定需要的接口实体类|

建造者模式（Builder）
---
> 组装复杂的实例

|名称|说明|
|---|---|
|Director|监工，知道建造流程，知道Builder的接口但不知道具体是哪一个建造者在建造|
|Builder|建造者抽象接口|
|ConcreteBuilder|确定的建造者，准确知道建造细节|
