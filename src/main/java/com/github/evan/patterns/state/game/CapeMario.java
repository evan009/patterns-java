package com.github.evan.patterns.state.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 斗篷马里奥
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class CapeMario implements MarioEvent {

    private static final CapeMario instance = new CapeMario();

    private CapeMario() {}

    public static CapeMario getInstance() {
        return instance;
    }

    @Override
    public MarioStateEnum getState() {
        return MarioStateEnum.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
       log.info("CapeMario obtainMushRoom");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        log.info("CapeMario obtainMushRoom");
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        log.info("CapeMario obtainMushRoom");
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
