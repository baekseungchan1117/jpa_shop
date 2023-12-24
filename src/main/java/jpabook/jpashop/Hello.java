package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hello {

    public String getData() {
        return data;
    }

    private String data;

    public void setData(String data) {
        this.data = data;
    }
}
