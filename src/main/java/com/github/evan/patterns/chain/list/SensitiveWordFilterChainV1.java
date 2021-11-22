package com.github.evan.patterns.chain.list;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 过滤器执行链
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class SensitiveWordFilterChainV1 {

    private List<SensitiveWordFilter> sensitiveWordFilters = new ArrayList<>();

    /**
     * @desc: 添加过滤器
     * @author: evan
     * @date: 2021/11/22
     */
    public void addFilter(SensitiveWordFilter filter) {
        sensitiveWordFilters.add(filter);
    }

    public boolean filter(String context) {
        boolean flag = true;
        for (SensitiveWordFilter sensitiveWordFilter : sensitiveWordFilters) {
            flag = sensitiveWordFilter.doFilter(context);
            if (!flag) {
                log.info("敏感词过滤  不能后续执行");
            }
        }
        return flag;
    }

}
