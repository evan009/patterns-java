package com.github.evan.patterns.command;

/**
 * @Desc: 命令模式示例
 * @author: evan
 * @date: 2021-11-23
 */
public class CommandExample {

    private static Broker broker = new Broker();

    public static void main(String[] args) {

        // 1：假如这里是长连接
        // 2: 解析参数成 CommandReq
        // 3：处理请求
        broker.addCommand(new KeyDelCommand(CommandReq.builder().event(CommandEventEnum.KEY_DEL).build()));
        broker.addCommand(new KeyExistsCommand(CommandReq.builder().event(CommandEventEnum.KEY_EXISTS).build()));
        broker.addCommand(new KeyExpireCommand(CommandReq.builder().event(CommandEventEnum.KEY_EXPIRE).build()));

        // 后台线程消费命令请求
        broker.peakCommand();

    }

}
