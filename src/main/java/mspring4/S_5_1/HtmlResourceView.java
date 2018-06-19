package mspring4.S_5_1;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

public class HtmlResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(this.getServletContext().getRealPath("/") + getUrl());
       System.out.println("判断html是否存在"+ file.exists());
       System.out.println("判断html是否存在"+(this.getServletContext().getRealPath("/") + getUrl()));
        return file.exists();// 判断该页面是否存在
    }
}
