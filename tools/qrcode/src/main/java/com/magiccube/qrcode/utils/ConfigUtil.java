package com.magiccube.qrcode.utils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
    public String path() {
        Properties properties = new Properties();
        String filePath = null;
        try {
//路径再配置文件中进行配置
            properties.load(this.getClass().getResourceAsStream("/conf/path.properties"));
            String path = properties.getProperty("path");
            String dir = properties.getProperty("firPath");
            filePath = path + File.separator + dir;
            return filePath;
        } catch (IOException e) {
            filePath = "修改目录";
            e.printStackTrace();
        }
        return filePath;
    }
}
