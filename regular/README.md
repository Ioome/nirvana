# 正则表达式

##### 被查找数据
~~~
需要查找的字符串: String line = "This order was placed for QT3000! OK?";
~~~

##### 规则对象
```java
String pattern = "(\\D*)(\\d+)(.*)";
// 创建 Pattern 对象
// Pattern r = Pattern.compile(pattern);
```
##### 通过 Matcher 合并规则 和 被查找数据
```java
Matcher m = r.matcher(line);
m.find( )
```

---
正则表达式是匹配某种字符串的一种模式,通过某种规则去对应字符串.
<br />
Hello world 也是一个正则喔


###  常用表达式

----
数字：^[0-9]*$ <br />
n位的数字：^\d{n}$ <br />
至少n位的数字：^\d{n,}$ <br />
m-n位的数字：^\d{m,n}$ <br />
零和非零开头的数字：^(0|[1-9][0-9]*)$ <br />
非零开头的最多带两位小数的数字：^([1-9][0-9]*)+(\.[0-9]{1,2})?$ <br />
带1-2位小数的正数或负数：^(\-)?\d+(\.\d{1,2})$ <br />
正数、负数、和小数：^(\-|\+)?\d+(\.\d+)?$ <br />
有两位小数的正实数：^[0-9]+(\.[0-9]{2})?$ <br />
有1~3位小数的正实数：^[0-9]+(\.[0-9]{1,3})?$ <br />
非零的正整数：^[1-9]\d*$ 或 ^([1-9][0-9]*){1,3}$ 或 ^\+?[1-9][0-9]*$ <br />
非零的负整数：^\-[1-9][]0-9"*$ 或 ^-[1-9]\d*$ <br />
非负整数：^\d+$ 或 ^[1-9]\d*|0$ <br />
非正整数：^-[1-9]\d*|0$ 或 ^((-\d+)|(0+))$ <br />
非负浮点数：^\d+(\.\d+)?$ 或 ^[1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0$ <br />
非正浮点数：^((-\d+(\.\d+)?)|(0+(\.0+)?))$ 或 ^(-([1-9]\d*\.\d*|0\.\d*[1-9]\d*))|0?\.0+|0$ <br />
正浮点数：^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$ 或 ^(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*))$ <br />
负浮点数：^-([1-9]\d*\.\d*|0\.\d*[1-9]\d*)$ 或 ^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$ <br />
浮点数：^(-?\d+)(\.\d+)?$ 或 ^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$ <br />

校验字符的表达式

---

汉字：^[\u4e00-\u9fa5]{0,}$ <br />
英文和数字：^[A-Za-z0-9]+$ 或 ^[A-Za-z0-9]{4,40}$ <br />
长度为3-20的所有字符：^.{3,20}$ <br />
由26个英文字母组成的字符串：^[A-Za-z]+$ <br />
由26个大写英文字母组成的字符串：^[A-Z]+$ <br />
由26个小写英文字母组成的字符串：^[a-z]+$ <br />
由数字和26个英文字母组成的字符串：^[A-Za-z0-9]+$ <br />
由数字、26个英文字母或者下划线组成的字符串：^\w+$ 或 ^\w{3,20}$ <br />
中文、英文、数字包括下划线：^[\u4E00-\u9FA5A-Za-z0-9_]+$ <br />
中文、英文、数字但不包括下划线等符号：^[\u4E00-\u9FA5A-Za-z0-9]+$ 或 ^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$ <br />
可以输入含有^%&',;=?$\"等字符：[^%&',;=?$\x22]+ <br />
禁止输入含有~的字符：[^~]+  <br />


特殊需求表达式

----

Email地址：^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$ <br />
域名：[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\.?  <br />
InternetURL：[a-zA-z]+://[^\s]* 或 ^http://([\w-]+\.)+[\w-]+(/[\w-./?%&=]*)?$  <br />
手机号码：^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\d{8}$  <br />
电话号码("XXX-XXXXXXX"、"XXXX-XXXXXXXX"、"XXX-XXXXXXX"、"XXX-XXXXXXXX"、"XXXXXXX"和"XXXXXXXX)：^(\(\d{3,4}-)|\d{3.4}-)?\d{7,8}$  <br />
国内电话号码(0511-4405222、021-87888822)：\d{3}-\d{8}|\d{4}-\d{7}  <br />
电话号码正则表达式（支持手机号码，3-4位区号，7-8位直播号码，1－4位分机号）: ((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)
身份证号(15位、18位数字)，最后一位是校验位，可能为数字或字符X：(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)  <br />
帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)：^[a-zA-Z][a-zA-Z0-9_]{4,15}$  <br />
密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)：^[a-zA-Z]\w{5,17}$  <br />
强密码(必须包含大小写字母和数字的组合，不能使用特殊字符，长度在 8-10 之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{8,10}$  <br />
强密码(必须包含大小写字母和数字的组合，可以使用特殊字符，长度在8-10之间)：^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$  <br />
日期格式：^\d{4}-\d{1,2}-\d{1,2}  <br />
一年的12个月(01～09和1～12)：^(0?[1-9]|1[0-2])$  <br />
一个月的31天(01～09和1～31)：^((0?[1-9])|((1|2)[0-9])|30|31)$  <br />
xml文件：^([a-zA-Z]+-?)+[a-zA-Z0-9]+\\.[x|X][m|M][l|L]$ <br />
中文字符的正则表达式：[\u4e00-\u9fa5] <br />
双字节字符：[^\x00-\xff] (包括汉字在内，可以用来计算字符串的长度(一个双字节字符长度计2，ASCII字符计1)) <br />
空白行的正则表达式：\n\s*\r (可以用来删除空白行) <br />
HTML标记的正则表达式：<(\S*?)[^>]*>.*?|<.*? /> ( 首尾空白字符的正则表达式：^\s*|\s*$或(^\s*)|(\s*$) (可以用来删除行首行尾的空白字符(包括空格、制表符、换页符等等)，非常有用的表达式) <br />
腾讯QQ号：[1-9][0-9]{4,} (腾讯QQ号从10000开始) <br />
中国邮政编码：[1-9]\d{5}(?!\d) (中国邮政编码为6位数字) <br />
IPv4地址：((2(5[0-5]|[0-4]\d))|[0-1]?\d{1,2})(\.((2(5[0-5]|[0-4]\d))|[0-1]?\d{1,2})){3}<br />