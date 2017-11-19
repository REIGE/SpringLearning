# Spring AOP
>## 原理
1. **编译期** AspectJ

2. **类加载期** AspectJ 5+

3. **运行时** Spring AOP

  1. 静态代理

     要代理的方法越多，越复杂

  2. 动态代理

     * 基于接口代理 jdk代理

       通过Proxy动态生成代理类 只能基于接口进行动态代理

     * 基于继承代理（Cglib）
>## Wildcard 通配符

`*`匹配任意数量得字符
`+`匹配指定类及子类
`..`一般用于匹配任意数得子包或参数
>## Operators 运算符

`&&`与操作符
`||`或操作符
`!`非操作符
>## Designators 指示器

通过什么方式匹配方法
* 匹配方法
  `execution()`
* 匹配注解
  `@target()`
  `@args()`
  `@within()`
  `@annotation()`
* 匹配包/类型
  `within()`
* 匹配对象
  `this()`
  `bean()`
  `targer()`
* 匹配参数
   `args()`

>## 五种Advice注解

`@Before`前置通知
`@After()`后置通知 finally
`@AfterReturning`返回通知
`@AfterThrowing`异常通知
`@Around`环绕通知

>## 多个AOP如何叠加

**责任链模式**