package com.github.evan.patterns.state.game;

import lombok.extern.slf4j.Slf4j;

/**
 * @desc: 火焰马里奥
 * @author: evan
 * @date: 2021/11/22
 */
@Slf4j
public class FireMario implements MarioEvent {

    private static final FireMario instance = new FireMario();

    private FireMario() {}

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public MarioStateEnum getState() {
        return MarioStateEnum.FIRE;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        log.info("FireMario obtainMushRoom");
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        log.info("FireMario obtainCape");
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        log.info("FireMario obtainFireFlower");
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
