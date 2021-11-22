package com.github.evan.patterns.state.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 小玛丽奥
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class SmallMario implements MarioEvent {

    private static final SmallMario instance = new SmallMario();

    private SmallMario() {}

    public static SmallMario getInstance() {
        return instance;
    }

    @Override
    public MarioStateEnum getState() {
        return MarioStateEnum.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 100);
        stateMachine.setCurrentState(SuperMario.getInstance());
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 200);
        stateMachine.setCurrentState(CapeMario.getInstance());
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 300);
        stateMachine.setCurrentState(FireMario.getInstance());
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        log.info("SmallMario meetMonster");
    }
}
