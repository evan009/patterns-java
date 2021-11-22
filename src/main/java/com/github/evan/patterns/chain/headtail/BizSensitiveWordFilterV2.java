package com.github.evan.patterns.chain.headtail;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 黄色敏感词过滤
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class BizSensitiveWordFilterV2 extends SensitiveWordFilterV2 {

    @Override
    public boolean doFilter(String content) {
        boolean flag = true;
        log.info("业务过滤器");
        return flag;
    }
}
