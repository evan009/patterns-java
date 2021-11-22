package com.github.evan.patterns.state.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 小玛丽奥
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class SuperMario implements MarioEvent {

    private static final SuperMario instance = new SuperMario();

    private SuperMario() {}

    public static SuperMario getInstance() {
        return instance;
    }

    @Override
    public MarioStateEnum getState() {
        return MarioStateEnum.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        log.info("SuperMario obtainMushRoom");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 200);
        stateMachine.setCurrentState(CapeMario.getInstance());
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() + 200);
        stateMachine.setCurrentState(CapeMario.getInstance());
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setScore(stateMachine.getScore() - 200);
        stateMachine.setCurrentState(SmallMario.getInstance());
    }
}
