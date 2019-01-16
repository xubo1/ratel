package com.jeesite.modules.mission.entity;


public class Mission {


    private String name;
    private String type;
    private String url;
    private String black_links;
    private String malscan;
    private String keyword;
    private String sql;
    private String xss;
    private String webvul;
    private String info_leak;
    private String cgi;
    private String csrf;
    private String form_crack;

    /*public Mission() {
    }

    public Mission(String type, String url, boolean black_links, boolean malscan, boolean keyword, boolean sql, boolean xss, boolean webvul, boolean info_leak, boolean cgi, boolean csrf, boolean form_crack, String name) {
        if(type.equals("周期任务")){
            this.type="cycle";
        }else if(type.equals("临时任务")){
            this.type="temp";
        }
        //this.type = type;
        this.url = url;
        this.black_links = black_links;
        this.malscan = malscan;
        this.keyword = keyword;
        this.sql = sql;
        this.xss = xss;
        this.webvul = webvul;
        this.info_leak = info_leak;
        this.cgi = cgi;
        this.csrf = csrf;
        this.form_crack = form_crack;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isBlack_links() {
        return black_links;
    }

    public void setBlack_links(boolean black_links) {
        this.black_links = black_links;
    }

    public boolean isMalscan() {
        return malscan;
    }

    public void setMalscan(boolean malscan) {
        this.malscan = malscan;
    }

    public boolean isKeyword() {
        return keyword;
    }

    public void setKeyword(boolean keyword) {
        this.keyword = keyword;
    }

    public boolean isSql() {
        return sql;
    }

    public void setSql(boolean sql) {
        this.sql = sql;
    }

    public boolean isXss() {
        return xss;
    }

    public void setXss(boolean xss) {
        this.xss = xss;
    }

    public boolean isWebvul() {
        return webvul;
    }

    public void setWebvul(boolean webvul) {
        this.webvul = webvul;
    }

    public boolean isInfo_leak() {
        return info_leak;
    }

    public void setInfo_leak(boolean info_leak) {
        this.info_leak = info_leak;
    }

    public boolean isCgi() {
        return cgi;
    }

    public void setCgi(boolean cgi) {
        this.cgi = cgi;
    }

    public boolean isCsrf() {
        return csrf;
    }

    public void setCsrf(boolean csrf) {
        this.csrf = csrf;
    }

    public boolean isForm_crack() {
        return form_crack;
    }

    public void setForm_crack(boolean form_crack) {
        this.form_crack = form_crack;
    }*/

    public Mission() {
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", black_links='" + black_links + '\'' +
                ", malscan='" + malscan + '\'' +
                ", keyword='" + keyword + '\'' +
                ", sql='" + sql + '\'' +
                ", xss='" + xss + '\'' +
                ", webvul='" + webvul + '\'' +
                ", info_leak='" + info_leak + '\'' +
                ", cgi='" + cgi + '\'' +
                ", csrf='" + csrf + '\'' +
                ", form_crack='" + form_crack + '\'' +
                '}';
    }

    public Mission(String name, String type, String url, String black_links, String malscan, String keyword, String sql, String xss, String webvul, String info_leak, String cgi, String csrf, String form_crack) {
        if(type.equals("周期任务")){
            this.type="cycle";
        }else if(type.equals("临时任务")){
            this.type="temp";
        }
        this.name = name;
        //this.type = type;
        this.url = url;
        this.black_links = black_links;
        this.malscan = malscan;
        this.keyword = keyword;
        this.sql = sql;
        this.xss = xss;
        this.webvul = webvul;
        this.info_leak = info_leak;
        this.cgi = cgi;
        this.csrf = csrf;
        this.form_crack = form_crack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBlack_links() {
        return black_links;
    }

    public void setBlack_links(String black_links) {
        this.black_links = black_links;
    }

    public String getMalscan() {
        return malscan;
    }

    public void setMalscan(String malscan) {
        this.malscan = malscan;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getXss() {
        return xss;
    }

    public void setXss(String xss) {
        this.xss = xss;
    }

    public String getWebvul() {
        return webvul;
    }

    public void setWebvul(String webvul) {
        this.webvul = webvul;
    }

    public String getInfo_leak() {
        return info_leak;
    }

    public void setInfo_leak(String info_leak) {
        this.info_leak = info_leak;
    }

    public String getCgi() {
        return cgi;
    }

    public void setCgi(String cgi) {
        this.cgi = cgi;
    }

    public String getCsrf() {
        return csrf;
    }

    public void setCsrf(String csrf) {
        this.csrf = csrf;
    }

    public String getForm_crack() {
        return form_crack;
    }

    public void setForm_crack(String form_crack) {
        this.form_crack = form_crack;
    }
}
