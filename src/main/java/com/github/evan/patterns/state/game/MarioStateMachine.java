package com.github.evan.patterns.state.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 马里奥 状态机
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class MarioStateMachine {

    private int score;

    private MarioEvent currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    /**
     * 获得火焰
     */
    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    /**
     * 遇到怪物
     */
    public void meetMonster() {
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public MarioEvent getCurrentState() {
        return currentState;
    }

    public void setCurrentState(MarioEvent currentState) {
        this.currentState = currentState;
    }

    public static void main(String[] args) {
        MarioStateMachine stateMachine = new MarioStateMachine();
        stateMachine.obtainMushRoom();
        stateMachine.obtainMushRoom();
        stateMachine.obtainCape();
        stateMachine.meetMonster();
        log.info("stateMachine:{}", stateMachine.getScore());
    }
}
