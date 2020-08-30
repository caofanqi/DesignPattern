# 原型模式

**定义:**  用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。

**类型:** 创建型模式。

**角色及其职责:**  
    1、 原型类（Prototype）：声明一个克隆自身的接口。 
    2、 具体原型类（Concrete Prototype）：实现一个克隆自身的操作。 

**适用场景:**  
    不需要知道任何创建的细节，不调用构造函数；  
    类初始化消耗较多的资源；  
    构造函数比较复杂。

**优点:**  
    减少创建对象的开销。

**缺点:**  
    必须配备克隆方法；   
    对克隆复杂对象或对克隆出的复杂对象进行改造时，容易引入风险（深浅拷贝要运用的当）。

**重点:**  
    浅拷贝：基本数据类型拷贝值，引用数据类型拷贝地址值；    
    深拷贝：基本数据类型拷贝值，引用数据类型引用的对象也进行拷贝一份。

**源码举例：**
​	JDK：
​	原型类：java.lang.Cloneable;
    具体原型类：实现java.lang.Cloneable接口的java.util.ArrayList等。