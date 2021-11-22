package com.github.evan.patterns.chain.headtail;

/**
 * @desc: 敏感词过滤器
 * @author: evan
 * @date: 2021/11/22
 */
public abstract class SensitiveWordFilterV2 {

    protected SensitiveWordFilterV2 sensitiveWordFilterV2;

    /**
     * 过滤方法
     * 
     * @param content
     */
    abstract boolean doFilter(String content);

    /**
     * @desc: 遍历执行
     * @author: evan
     * @date: 2021/11/22
     */
    public final boolean doHandle(String context) {
        boolean flag = doFilter(context);
        if (sensitiveWordFilterV2 != null && flag) {
            flag = sensitiveWordFilterV2.doHandle(context);
        }
        return flag;
    }

    /**
     * 过滤方法
     * 
     * @param filter
     */
    void addFilter(SensitiveWordFilterV2 filter) {
        this.sensitiveWordFilterV2 = filter;
    }

}
