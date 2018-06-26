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

抽象工厂模式（Abstract Factory）
---
> 将关联的零件组装成产品

|名称|说明|
|---|---|
|Abstract Product|抽象零件，封装了零件的抽象特征|
|Abstract Factory|抽象工厂，|
|Concrete Product|实际需要的生产零件，拓展自`Abstract Product`|
|Concrete Factory|实际工厂，拓展自`Abstract Factory`|

连接桥模式（Bridge）
---
> 将类的实现层次和功能层次连接起来

|名称|说明|
|---|---|
|Display|类的功能层次结构|
|CountDisplay|功能层次结构扩展|
|DisplayImpl|类的实现层次结构|
|StringDisplayImpl|类的实现层次结构扩展|

策略模式（Strategy）
---
> 整体替换算法实现

|名称|说明|
|---|---|
|Strategy|算法实现接口，需要具体的算法实现类实现它|
|ConcreteStrategy|具体的算法，对于同一件事提供多个实现类|

复合物模式（Composite）
---
> 将容器与内容保持一致性

|名称|说明|
|---|---|
|Entry|组合物，保持容器和内容一致性的接口|
|Directory|组合物，可以装下自己和叶子|
|File|叶子身份|

装饰者模式（Decorator）
---
> 通过增加装饰物来增加对象功能

|名称|说明|
|---|---|
|Component|保持一致性的接口，具备核心接口（API）|
|ConcreteComponent|实现了具体核心接口的类，等待被装饰|
|Decorator|装饰者抽象接口|
|ConcreteDecorator|具体的装饰者，增加了某种功能|

访问者模式（Visitor）
---
> 访问数据结构并处理数据

|名称|说明|
|---|---|
|Visitor|访问者接口，提供了访问数据结构的接口|
|ConcreteVisitor|具体的访问者，实现了数据结构访问接口|
|Element|声明接受访问者的接口|
|ConcreteElement|具备了数据结构的实现并且实现了接受访问者的接口|

责任链模式（Chain of Responsibility）
---
> 推卸责任

|名称|说明|
|---|---|
|Handler|处理者|
|ConcreteHandler|具体的处理者|
|Trouble|传递的处理数据结构|

外观模式（Facade）
---
> 简单窗口

|名称|说明|
|---|---|
|PageMaker|页面的生产者，使用了 `Template Method` 模式， 了解如何生产整个页面，但不清楚细节|
|HTMLWriter|具体的文件生产者， 了解生产细节， 但是不知道整个流程， 由 `PageMaker` 决定生产流程|
|Database|数据存放文件|

中介者模式（Mediator）
---
> 所有的信息都向中介者汇报处理

|名称|说明|
|---|---|
|Colleague|同事，声明了设置中介者和中介者回调触发改变的接口|
|Mediator|中介者，声明了创建下属同事的接口和同事发生改变时调用的中介者接口|
|ConcreteColleague|具体的同事的实现|
|ConcreteMediator|具体的中介者实现|

* 说明
    1. 该方式在GUI程序设计中占有很重要的模式比例。
    2. `JTextField` 监听内容发生改变需要实现 `DocumentListener` 接口，获取到 `Document` 对象后注册。

观察者模式（Observer）
---
> 发送状态变化通知

|名称|说明|
|---|---|
|Observer|观察者接口，定义了主题通知观察者状态变化所用的接口|
|Subject|主题接口，定义了通知观察者状态发生改变的接口|
|ConcreteObserver|具体的观察者，实现了观察者接口中未实现的接口|
|ConcreteSubject|具体的主题，当主题内部数据内容发生变化后通知观察者|

* 说明
    1. JDK中自带 `Observer` 和 `Observable` 接口使用，但不好用。
    2. 该模式也称为**发布-订阅**模式

纪念品模式（Memento）
---
> 随时保存对象状态

|名称|说明|
|---|---|
|Originator|生成者，一般只能由此类来生成对应的纪念品|
|Memento|纪念品，保存了生成器对象的状态，并且支持返回状态|
|Caretaker|负责人，负责何时生成（但不关注怎么生成），何时复原|
    
状态模式（State）
---
> 用类来表示状态

|名称|说明|
|---|---|
|Context|要使用状态的接口|
|State|状态类接口，声明了所有要使用的状态方法|
|ConcreteState|具体的状态类实现，一般使用单例模式获取实例|

轻量级模式（Flyweight）
---
> 共享对象，避免浪费

|名称|说明|
|---|---|
|Flyweight|轻量级，被共享的类|
|FlyweightFactory|轻量级工厂，用来产生轻量级对象|
|Client|请求者，从轻量级工厂获取共享对象|

代理模式（Proxy）
---
> 只在必要时生成实例

|名称|说明|
|---|---|
|Proxy|代理人，可以完成一部分工作，但是重要的工作完不成时交给 `RealSubject` 来完成|
|Subject|主体接口，被代理的对象，内部可能有消耗资源的实例生成过程|
|RealSubject|真正的主体实现类|