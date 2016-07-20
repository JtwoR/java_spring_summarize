# java_spring_summarize

## 有关java中Spring的用法及其应用的总结


## 主要是介绍java中Spring的用法及其添加应用的用例。


## 一、以下为Spring中部分的详情介绍：

### 1. Spring Web MVC 处理Http请求的大致过程：
    
            一旦Http请求到来，DispatcherSevlet将负责将请求分发。DispatcherServlet可以认为是Spring提供
        的前端控制器，所有的请求都有经过它来统一分发。
    
            在DispatcherServlet将请求分发给SpringController之前，需要借助于Spring提供的HandlerMapping
        定位到具体的Controller。HandlerMapping是这样一种对象，它能够完成客户请求到Controller之间的映射。
        在Struts中，这种映射是通过struts-config.xml文件完成的。其中，Spring为Controller接口提供了若干实现，
        例如Spring默认使用的BeanNameUrlHandlerMapping。还有，SimpleUrlHandlerMapping，
        CommonsPathMapHandlerMapping。
    
            Spring Controller将处理来自DispatcherServlet的请求。Spring的Controller类似于struts的Action，
        能够接受HttpServletRequest和HttpServletResponse。Spring为Controller接口提供了若干实现类，
        位于org.springframework.web.servlet.mvc包中。由于Controller需要为并发用户处理上述请求，
        因此实现Controller接口时，必须保证线程安全并且可重用。Controller将处理客户请求，
        这和Struts Action 扮演的角色是一致的。
    
            一旦Controller处理完客户请求，则返回ModelAndView对象给DispatcherServlet前端控制器。
        ModelAndView中包含了模型（Model）和视图（View）。从宏观角度考虑，DispatcherServlet是整个
        Web应用的控制器；从微观角度考虑，Controller是单个Http请求处理过程中的控制器，而ModelAndView
        是Http请求过程中返回的模型和视图。前端控制器返回的视图可以是视图的逻辑名，或者实现了View接口
        的对象。View对象能够渲染客户响应结果。其中，ModelAndView中的模型能够供渲染View时使用。借助于
        Map对象能够存储模型。
    
        如果ModelAndView返回的视图只是逻辑名，则需要借助Spring提供的视图解析器（ViewResoler）在Web应用中
        查找View对象，从而将响应结果渲染给客户。
  
        DispatcherServlet将View对象渲染出的结果返回个客户。
  
  ------------------------------------------------------------------------------------------------------------------------------------
  
### 2. 以下为整合spring、jsf、hibernate三个框架的步骤：
  
      <1>. 首先介绍用NetBeans功能整合的步骤，创建项目的时候添加三个框架，项目创建初始化结束。
      
      <2>. 做几个删除的操作：
      
            <1> 删除web.xml文件下的
                ①<servlet>
                     <servlet-name>dispatcher</servlet-name>
                     <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
                     <load-on-startup>2</load-on-startup>
                 </servlet>
                ②<servlet-mapping>
                     <servlet-name>dispatcher</servlet-name>
                     <url-pattern>*.htm</url-pattern>
                 </servlet-mapping>
                ③<welcome-file>redirect.jsp</welcome-file>
            <2> 删除redirect.jsp
            <3> 删除dispatcher-servlet.xml
            <4> 删除jsp文件夹
            <5> 删除hibernate.cfg.xml
            
        <3>. 完成基本的项目初始化配置操作
        
------------------------------------------------------------------------------------------------------------------------------------
  
## 二、JAVA 分层概念部分的介绍
        service是业务层 
    
        action层即作为控制器
            
        DAO (Data Access Object) 数据访问
        
        1. JAVA中Action层, Service层 ，modle层 和 Dao层的功能区分？（下面所描述的service层就是biz） 
             首先这是现在最基本的分层方式，结合了SSH架构。modle层就是对应的数据库表的实体类。
    
             Dao层是使用了Hibernate连接数据库、操作数据库（增删改查）。
            
             Service（biz）层：引用对应的Dao数据库操作，在这里可以编写自己需要的代码（比如简单的判断）。
            
             Action层：引用对应的Service（biz）层，在这里结合Struts的配置文件，跳转到指定的页面，
             当然也能接受页面传递的请求数据，也可以做些计算处理。
            
             以上的Hibernate，Struts，都需要注入到Spring的配置文件中，Spring把这些联系起来，成为一个整体。
            
        2. 其他答案： 
        　　一般java都是三层架构 数据访问层（dao） 业务逻辑层（biz 或者services） 界面层（ui） 
        action 是业务层的一部分，是一个管理器（总开关）（作用是取掉转）（取出前台界面的数据，调用biz方法，
        转发到下一个action或者页面模型成（model）一般是实体对象(把现实的的事物变成java中的对象)作用是一
        暂时存储数据方便持久化（存入数据库或者写入文件）而是 作为一个包裹封装一些数据来在不同的层以及各种
        java对象中使用dao是数据访问层  就是用来访问数据库实现数据的持久化（把内存中的数据永久保存到硬盘中 
        其他答案：  
            Action是一个控制器 Dao主要做数据库的交互工作 Modle 是模型 存放你的实体类 Biz 做相应的业务逻辑处理
        
        3. java中dao层和biz层的区别是什么？ 
