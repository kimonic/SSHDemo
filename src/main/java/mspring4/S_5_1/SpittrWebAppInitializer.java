package mspring4.S_5_1;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer需要添加spring-webmvc-4.3.16.RELEASE.jar这个包
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //此方发导致tomcat服务器无法启动
    //当返回null,或者new Class[0]时,tomcat服务器正常启动
    //返回 new Class[]{RootConfig.class};是则无法启动
    //web.xml中注释掉spring上下文后,服务器也可以正常启动
    //解决方案:注释掉web.xml中所有关于spring配置的代码,在本类中重写
    //public void onStartup(ServletContext servletContext) throws ServletException方法
    //注意不要调用父类的默认方法,web.xml配置和Java配置导致的冲突会致使服务器无法启动并且错误原因不明
    @Override
    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{null};
        System.out.println("配置文件已加载--------------------");
        return new Class[]{RootConfig.class};
    }

//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {  //配置spring
//        servletContext.setInitParameter("contextConfigLocation","classpath:spring-config.xml");
//        servletContext.addListener(new ContextLoaderListener());
        //配置springmvc
//        ServletRegistration.Dynamic springMVC= servletContext.addServlet("spring",new DispatcherServlet());//加载springMVC核心类
//        springMVC.addMapping("/");
//        springMVC.setInitParameter("contextConfigLocation","classpath:servlet.xml");//设置springmvc的配置文件位置
//        super.onStartup(servletContext);

//    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
