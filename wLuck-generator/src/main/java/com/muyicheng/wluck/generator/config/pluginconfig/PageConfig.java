package com.muyicheng.wluck.generator.config.pluginconfig;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/12
 */
public class PageConfig {

    private ContextConfig contextConfig;

    private String pagePathTemplate;
    private String pageAddPathTemplate;
    private String pageEditPathTemplate;
    private String pageJsPathTemplate;
    private String pageInfoJsPathTemplate;

    public void init() {
        pagePathTemplate = "\\src\\main\\webapp\\WEB-INF\\view\\" + contextConfig.getModuleName() + "\\{}\\{}.html";
        pageAddPathTemplate = "\\src\\main\\webapp\\WEB-INF\\view\\" + contextConfig.getModuleName() + "\\{}\\{}_add.html";
        pageEditPathTemplate = "\\src\\main\\webapp\\WEB-INF\\view\\" + contextConfig.getModuleName() + "\\{}\\{}_edit.html";
        pageJsPathTemplate = "\\src\\main\\webapp\\static\\" + contextConfig.getModuleName() + "\\{}\\{}.js";
        pageInfoJsPathTemplate = "\\src\\main\\webapp\\static\\" + contextConfig.getModuleName() + "\\{}\\{}_info.js";
    }

    public String getPagePathTemplate() {
        return pagePathTemplate;
    }

    public void setPagePathTemplate(String pagePathTemplate) {
        this.pagePathTemplate = pagePathTemplate;
    }

    public String getPageJsPathTemplate() {
        return pageJsPathTemplate;
    }

    public void setPageJsPathTemplate(String pageJsPathTemplate) {
        this.pageJsPathTemplate = pageJsPathTemplate;
    }

    public String getPageAddPathTemplate() {
        return pageAddPathTemplate;
    }

    public void setPageAddPathTemplate(String pageAddPathTemplate) {
        this.pageAddPathTemplate = pageAddPathTemplate;
    }

    public String getPageEditPathTemplate() {
        return pageEditPathTemplate;
    }

    public void setPageEditPathTemplate(String pageEditPathTemplate) {
        this.pageEditPathTemplate = pageEditPathTemplate;
    }

    public String getPageInfoJsPathTemplate() {
        return pageInfoJsPathTemplate;
    }

    public void setPageInfoJsPathTemplate(String pageInfoJsPathTemplate) {
        this.pageInfoJsPathTemplate = pageInfoJsPathTemplate;
    }

    public ContextConfig getContextConfig() {
        return contextConfig;
    }

    public void setContextConfig(ContextConfig contextConfig) {
        this.contextConfig = contextConfig;
    }
}

