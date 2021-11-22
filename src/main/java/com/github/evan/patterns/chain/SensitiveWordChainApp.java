package com.github.evan.patterns.chain;

import com.github.evan.patterns.chain.headtail.*;
import com.github.evan.patterns.chain.list.AdsSensitiveWordFilter;
import com.github.evan.patterns.chain.list.BizSensitiveWordFilter;
import com.github.evan.patterns.chain.list.PoliticalSensitiveWordFilter;
import com.github.evan.patterns.chain.list.SexySensitiveWordFilter;
import com.github.evan.patterns.chain.list.SensitiveWordFilterChainV1;
import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 明感词过滤
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class SensitiveWordChainApp {

    public static SensitiveWordFilterChainV1 sensitiveWordFilterChainV1;
    public static SensitiveWordFilterChainV2 sensitiveWordFilterChainV2;

    public static void main(String[] args) {
        // 初始化过滤器
        initContextV1();
        // 执行
        sensitiveWordFilterChainV1.filter("我是有y颜色的文字");

        // 初始化过滤器
        initContextV2();
        // 执行
        sensitiveWordFilterChainV2.filter("我是有y颜色的文字2");
    }

    private static void initContextV1() {
        log.info("容器初始化");
        sensitiveWordFilterChainV1 = new SensitiveWordFilterChainV1();
        sensitiveWordFilterChainV1.addFilter(new PoliticalSensitiveWordFilter());
        sensitiveWordFilterChainV1.addFilter(new SexySensitiveWordFilter());
        sensitiveWordFilterChainV1.addFilter(new AdsSensitiveWordFilter());
        sensitiveWordFilterChainV1.addFilter(new BizSensitiveWordFilter());
    }

    private static void initContextV2() {
        log.info("容器初始化");
        sensitiveWordFilterChainV2 = new SensitiveWordFilterChainV2();
        sensitiveWordFilterChainV2.addFilter(new AdsSensitiveWordFilterV2());
        sensitiveWordFilterChainV2.addFilter(new BizSensitiveWordFilterV2());
        sensitiveWordFilterChainV2.addFilter(new PoliticalSensitiveWordFilterV2());
        sensitiveWordFilterChainV2.addFilter(new SexySensitiveWordFilterV2());
    }

}
