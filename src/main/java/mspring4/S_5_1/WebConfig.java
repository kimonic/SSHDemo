package mspring4.S_5_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SuppressWarnings("Duplicates")
@Configuration
@EnableWebMvc
@ComponentScan("mspring4.S_5_1.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * InternalResourceViewResolver默认的viewClass是JstlView,JstlView的checkResource方法默认返回true,所以如果
     * 有几个视图解析器时,如果默认的视图解析器的order顺序靠前,则执行到盖世兔解析器后,如果文件不存在会直接返回异常
     * 不会继续执行后面的解析器
     * @return resolver
     */
    @Bean
    public ViewResolver viewResolver() {//配置jsp视图解析器
        System.out.println("viewResolver----------被调用-------------------------");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(1);
        resolver.setViewClass(DefaultResourceView.class);
        resolver.setExposeContextBeansAsAttributes(true);
        System.out.println("viewResolver----------被调用" + resolver);
        return resolver;
    }

    @Bean//配置多个视图解析器,需要自定义继承自InternalResourceView的类并赋值给InternalResourceViewResolver
    public ViewResolver htmlResolver() {//配置jsp视图解析器
        System.out.println("htmlResolver----------被调用-------------------------");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/html/");
        resolver.setSuffix(".html");
        resolver.setOrder(2);
        resolver.setViewClass(HtmlResourceView.class);
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setContentType("text/html;charset=UTF-8");
        System.out.println("htmlResolver----------被调用" + resolver);
        return resolver;
    }

    @Bean//配置多个视图解析器,需要自定义继承自InternalResourceView的类并赋值给InternalResourceViewResolver
    public ViewResolver imageResolver() {//配置jsp视图解析器
        System.out.println("imageResolver----------被调用-------------------------");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/image/");
        resolver.setOrder(3);
        resolver.setViewClass(ImageResourceView.class);
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setContentType("text/html;charset=UTF-8");
        System.out.println("imageResolver----------被调用" + resolver);
        return resolver;
    }


    @Override//配置静态资源的处理
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
