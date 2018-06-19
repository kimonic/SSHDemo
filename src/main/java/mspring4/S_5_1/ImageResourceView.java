package mspring4.S_5_1;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

public class ImageResourceView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        //在此方法内根据图片类型进行查找后,如果文件存在则重新设置url,在原url的基础上添加扩展名
        File file = new File(this.getServletContext().getRealPath("/") + getUrl()+".jpg");
        setUrl(getUrl()+".jpg");
        System.out.println("图片文件的路径是:"+file.getAbsolutePath());
        return file.exists();
    }
}
