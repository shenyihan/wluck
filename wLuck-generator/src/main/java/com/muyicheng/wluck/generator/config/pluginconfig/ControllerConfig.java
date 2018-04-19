package com.muyicheng.wluck.generator.config.pluginconfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/12
 */
public class ControllerConfig {

    private ContextConfig contextConfig;

    private String controllerPathTemplate;
    private String packageName;//包名称
    private List<String> imports;//所引入的包

    public void init() {
        ArrayList<String> imports = new ArrayList<>();
        imports.add(contextConfig.getCoreBasePackage() + ".controller.BaseController");
        imports.add("org.springframework.web.bind.annotation.RequestMapping");
        imports.add("org.springframework.web.bind.annotation.ResponseBody");
        imports.add("org.springframework.ui.Model");
        imports.add("org.springframework.stereotype.Controller");
        imports.add("org.springframework.web.bind.annotation.PathVariable");
        imports.add("org.springframework.beans.factory.annotation.Autowired");
        imports.add(contextConfig.getCoreBasePackage() + ".log.LogObjectHolder");
        imports.add("org.springframework.web.bind.annotation.RequestParam");
        imports.add(contextConfig.getModelPackageName() + "." + contextConfig.getEntityName());
        imports.add(contextConfig.getProPackage() + "." + contextConfig.getModuleName() + ".service" + ".I" + contextConfig.getEntityName() + "Service");
        this.imports = imports;
        this.packageName = contextConfig.getProPackage() + "." + contextConfig.getModuleName() + ".web";
        this.controllerPathTemplate = "\\src\\main\\java\\"+contextConfig.getProPackage().replaceAll("\\.","\\\\")+"\\" + contextConfig.getModuleName() + "\\web\\{}Controller.java";
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public String getControllerPathTemplate() {
        return controllerPathTemplate;
    }

    public void setControllerPathTemplate(String controllerPathTemplate) {
        this.controllerPathTemplate = controllerPathTemplate;
    }

    public ContextConfig getContextConfig() {
        return contextConfig;
    }

    public void setContextConfig(ContextConfig contextConfig) {
        this.contextConfig = contextConfig;
    }

}

