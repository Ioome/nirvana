# 访问权限控制💻
1. 重构
2. 如何把变动的事物与保持不变的事物分开
3. 如何实现类库的访问,约定控制.
4. 访问修饰符
5. public private protected default
6. package

~~~
java 官方为开发者提供了很多功能强大的类，这些类被分别放在各个包中，随JDK一起发布，称为Java类库或Java API
~~~
包是存在一组类的.它被单子的名字空间组在一起
import 根据包名去导入相应的文件.
package 是组织代码的工具


##### 如何组织包
反域名格式.<br />
PUBLIC PROTECTED  DEFAULT PRIVATE

