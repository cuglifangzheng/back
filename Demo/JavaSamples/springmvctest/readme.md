# ReadMe

本文档用于解答我在编写SpringMVC的demo时产生的几个困惑：

1. maven工程的classpath路径问题

   >scr和resourece目录对应到target\classes下。

2. web.xml当中如何配置resources和WEB-INF下的文件

   > resources下的文件用classpath:/xxx.xml访问即可
   >
   > WEB-INF下的文件用/WEB-INF/xxx.xml访问

3. applicationContext.xml是什么作用？如何修改默认的配置路径和文件？

   > applicationContext.xml是web应用的默认加载配置文件。
   >
   > 通过
   >
   > ```xml
   > <context-param>    
   >   <param-name>contextConfigLocation</param-name>    
   >   <param-value>/WEB-INF/applicationContext1.xml</param-value>
   > </context-param>
   > ```
   >
   > 修改默认配置文件。

4. ModelAndView返回的值为何不能正确获取？

   > 这与Servlet的版本有关系。2.4以前的版本不支持EL语法。

5. 命令/表单对象可以自动绑定，无需进行任何设置

   > 如，表单有参数：
   >
   > username，password，age
   >
   > 有对象为User，就是一个POJO，其包含如下成员：
   >
   > username，password，age
   >
   > 在提交表单的时候，SpringMVC可以进行自动填充。

   ​