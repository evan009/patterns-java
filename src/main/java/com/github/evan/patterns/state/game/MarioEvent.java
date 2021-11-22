package com.github.evan.patterns.state.game;

/**
 * @desc: 马里奥事件
 * @author: evan
 * @date: 2021/11/22
 */
public interface MarioEvent {

    /**
     * 获取当前状态
     * 
     * @return
     */
    MarioStateEnum getState();

    /**
     * 获得蘑菇
     */
    void obtainMushRoom(MarioStateMachine marioStateEnum);

    /**
     * 获得斗篷
     */
    void obtainCape(MarioStateMachine marioStateEnum);

    /**
     * 获得火焰
     */
    void obtainFireFlower(MarioStateMachine marioStateEnum);

    /**
     * 遇到怪物
     */
    void meetMonster(MarioStateMachine marioStateEnum);

}
