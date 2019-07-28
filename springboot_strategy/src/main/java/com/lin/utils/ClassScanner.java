package com.lin.utils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Mr.Lin
 * @create: 2019-07-28 17:07:54
 **/
public class ClassScanner {
    public static List<Class> scan(String path, Class annoType)throws Exception{
        List<Class> result=new ArrayList<>();
        String pkgName=path.replace("/",".");
        String classPath = Thread.currentThread().getContextClassLoader().getResource(path).getPath();
        File dir=new File(classPath);
        File[] dirfiles = dir.listFiles(
                        pathname -> pathname.isDirectory()
                        ||
                        pathname.getName().endsWith("class"));
        String className;
        Class clz;
        for (File f : dirfiles) {
            className = f.getName();
            className = className.substring(0, className.length() - 6);
            clz = Class.forName(pkgName + "." + className);
            Annotation annotation = clz.getAnnotation(annoType);
            if (annotation!=null){
                result.add(clz);
            }
        }
        return  result;
    }
}
