package com.github.evan.patterns.interpreter;

import java.util.Map;

/**
 * @Desc: 表达式接口
 * @author: evan
 * @date: 2021-11-23
 */
public interface Expression {

    /**
     * 规则解析
     * 
     * @param context
     * @return
     */
    boolean interpret(Map<String, Integer> context);

}
