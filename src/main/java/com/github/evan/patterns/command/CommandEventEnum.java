package com.github.evan.patterns.command;

/**
 * @Desc: 命令枚举类
 * @author: evan
 * @date: 2021-11-23
 */
public enum CommandEventEnum {

    KEY_DEL("key删除"), KEY_EXISTS("key是否存在"), KEY_EXPIRE("key过期");

    private String desc;

    private CommandEventEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

}
