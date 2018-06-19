package mspring4.S_5_1;

import org.springframework.web.servlet.view.JstlView;

import java.io.File;
import java.util.Locale;

public class DefaultResourceView  extends JstlView {
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(this.getServletContext().getRealPath("/") + getUrl());
        return file.exists();
    }
}
