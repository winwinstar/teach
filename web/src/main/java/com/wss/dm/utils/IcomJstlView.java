package com.wss.dm.utils;

import org.springframework.web.servlet.view.JstlView;

import java.io.File;
import java.util.Locale;

/**
 * Created by Administrator on 2016/10/26.
 */
public class IcomJstlView  extends JstlView {

    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(this.getServletContext().getRealPath("/")+getUrl());
        return file.exists();//判断该jsp页面是否存在
    }
}
