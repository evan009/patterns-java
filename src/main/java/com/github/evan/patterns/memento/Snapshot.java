package com.github.evan.patterns.memento;

/**
 * @desc: 快照对象
 * @author: evan
 * @date: 2021/11/22
 */
public class Snapshot {

    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
