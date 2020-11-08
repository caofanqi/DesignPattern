# 装饰模式

**定义:**  动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更加灵活。

**类型:** 结构型模式。

**角色及其职责:**  
    1、 抽象组件角色（Component）: 一个抽象接口，是被装饰类和装饰类的父接口，可以给这些对象动态地添加职责；<br>
    2、 具体组件角色（ConcreteComponent）: 抽象组件的实现类，也可以给这个对象添加一些职责；<br>
    3、 抽象装饰角色（Decorator）: 继承了Component，并包含一个Component的引用，从外来扩展Component的功能，对于Component来说，无需知道Decorator的存在；<br>
    4、 具体装饰角色（ConcreteDecorator）: 抽象装饰角色的实现类，负责具体的装饰。

**适用场景:**  
    扩展一个类的功能或给一个类附加职责。

**优点:**  
    继承的有利补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能；<br>
    通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果；<br>
    符合开闭原则。

**缺点:**  
    会出现更多的代码，更多的类，增加程序复杂性。


**源码举例：**
​	JDK: 
    Component: java.io.InputStream;
    ConcreteComponent: java.io.ByteArrayInputStream;
    Decorator: java.io.FilterInputStream;
    ConcreteDecorator: java.io.BufferedInputStream;
