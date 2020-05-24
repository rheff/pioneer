package cn.ymcat.ihome.domain;

import java.io.Serializable;

public class Card implements Serializable {

    private String title;

    private String introduction;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
