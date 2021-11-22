package com.github.evan.patterns.state.game;

/**
 * @desc: 马里奥状态枚举类
 * @author: evan
 * @date: 2021/11/22
 */
public enum MarioStateEnum {

    SMALL(0), SUPER(1), FIRE(2), CAPE(3);

    private int value;

    private MarioStateEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
