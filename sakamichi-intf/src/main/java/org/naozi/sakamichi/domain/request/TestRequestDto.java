package org.naozi.sakamichi.domain.request;

import java.io.Serializable;

/**
 * Created by Naozi on 2017/7/2.
 */
public class TestRequestDto implements Serializable {

    private static final long serialVersionUID = 5598853281172073750L;

    private String testParam;

    public String getTestParam() {
        return testParam;
    }

    public void setTestParam(String testParam) {
        this.testParam = testParam;
    }
}
