package com.github.evan.patterns.chain.headtail;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 过滤器执行链
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class SensitiveWordFilterChainV2 {

    private SensitiveWordFilterV2 head = null;
    private SensitiveWordFilterV2 tail = null;

    /**
     * @desc: 添加过滤器
     * @author: evan
     * @date: 2021/11/22
     */
    public void addFilter(SensitiveWordFilterV2 filter) {
        if (head == null || tail == null) {
            head = filter;
            tail = filter;
            return;
        }
        tail.addFilter(filter);
        tail = filter;
    }

    public boolean filter(String context) {
        boolean flag = true;
        if (head != null) {
            flag = head.doHandle(context);
        }
        return flag;
    }

}
