package org.naozi.sakamichi.domain.response;

import java.io.Serializable;

/**
 * Created by Naozi on 2017/7/2.
 */
public class TestResponseDto implements Serializable {

    private static final long serialVersionUID = -5565067526852273360L;

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
