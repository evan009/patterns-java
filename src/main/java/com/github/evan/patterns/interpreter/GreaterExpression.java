package com.github.evan.patterns.interpreter;

import java.util.Map;

/**
 * @Desc: 客户端参数解析
 * @author: evan
 * @date: 2021-11-23
 */
public class GreaterExpression implements Expression {

    private String key;

    private long value;

    public GreaterExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].trim().equals(">")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    public GreaterExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, Integer> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        return stats.get(key) > value;
    }
}
