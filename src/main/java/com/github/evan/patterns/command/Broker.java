package com.github.evan.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 代理容器
 * @author: evan
 * @date: 2021-11-23
 */
public class Broker {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void peakCommand() {
        for (Command command : commandList) {
            command.exectue();
        }
    }

}
