package mspring4.S_5_1.web;

import mspring4.S_5_1.user.User;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 参考文档
 * https://blog.csdn.net/qq_33500630/article/details/79242427
 * 此类用于@responsebody中的返回值在发出之前进行拦截,可以对响应体进行操作
 */
@ControllerAdvice
public class ResponsebodyIntercept implements ResponseBodyAdvice {
    @Override//此方法必须返回true
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//        body.setName("亦筝笙");
        System.out.println("重新改写响应-----------------------------");
        return body;
    }
}
