package com.github.evan.patterns.command;

import java.util.LinkedHashMap;

import lombok.Builder;
import lombok.Data;

/**
 * @Desc: 命令请求对象 命令参数
 * @author: evan
 * @date: 2021-11-23
 */
@Builder
@Data
public class CommandReq {

    /**
     * 请求事件
     */
    private CommandEventEnum event;

    /**
     * 必选参数
     */
    private LinkedHashMap<String, String> requriedParam;

    /**
     * 可选参数
     */
    private LinkedHashMap<String, String> optionalParam;

}
