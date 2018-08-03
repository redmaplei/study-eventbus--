# study-1

#### 项目介绍


**是什么，为什么，怎么用。**

 往往当我们面对一项新的知识时，我们往往需要知道三个方面，它是什么，它能做什么，它比原有知识强在哪里，我们该怎么使用它。当你能够解决这些问题时，便意味着你已经对这项知识入门了。
 https://www.cnblogs.com/yrstudy/p/6500982.html

 **1.EventBus**

 Observer

```java
by wys create on 2018/8/3
 * Event的继承：
 * 如果Listener A监听Event A, 而Event A有一个子类Event B,
 * 此时Listener A将同时接收Event A和B消息，实例如下：
 * A B   B是子类
 * post父类A 处理A、B
 * post子类B 处理B
```