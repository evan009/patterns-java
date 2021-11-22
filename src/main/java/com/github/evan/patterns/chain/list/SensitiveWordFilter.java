package com.github.evan.patterns.chain.list;

/**
 * @desc: 敏感词过滤器
 * @author: evan
 * @date: 2021/11/22
 */
public interface SensitiveWordFilter {

    /**
     * 过滤方法
     * @param content
     */
    boolean doFilter(String content);

}
