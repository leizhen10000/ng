package com.leizhen;

import org.springframework.stereotype.Component;

@Component
public class FooServiceImpl implements FooService {

    private int count = 0;

    public void plusCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
