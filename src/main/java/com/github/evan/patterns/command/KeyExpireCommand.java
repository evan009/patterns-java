package com.github.evan.patterns.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @Desc: key 过期命令
 * @author: evan
 * @date: 2021-11-23
 */
@Slf4j
public class KeyExpireCommand implements Command {

    private CommandReq commandReq;

    public KeyExpireCommand(CommandReq commandReq) {
        this.commandReq = commandReq;
    }

    @Override
    public void exectue() {
        log.info("执行命令 expire");
    }
}
