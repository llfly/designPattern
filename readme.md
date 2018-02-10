# 设计模式

## 策略模式

### 基础
- 抽象
- 封装
- 继承
- 多态

### 设计原则
1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起
2. 针对接口编程，而不是针对实现编程
3. 多用组合，少用继承

### 策略模式（Strategy Pattern)
策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。



## 观察者模式(Observer Pattern)

出版者 + 订阅者 = 观察者模式
subject + Observer

观察者模式定义了一系列对象之间的一对多关系，当一个对象改变状态，其他依赖者都会收到通知。

push/pull


### 设计原则
1. 交互对象之间松耦合设计

java.util 包内包含最基本的 Observer 接口与 Observable 类，可自由使用 push / pull

问题
1. 不要依赖于观察者被通知的次序
2. Observable 是一个类，如果某个类想同时具有 Observable 类和另一个超类的行为，会存在多继承问题，限制了 Observable 的复用潜力
3. 没有 Observable 接口，所以无法建立自己的实现，和 Java 内置的 Observer API 搭配使用
4. Observable 将关键方法 protected ，意味着除非继承，否则无法创建 Observable 实例并组合到自己的对象中来

JavaBeans 和 Swing 也实现了观察者模式