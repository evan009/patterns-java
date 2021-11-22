package com.github.evan.patterns.memento;

/**
 * @desc: 原始对象
 * @author: evan
 * @date: 2021/11/22
 */
public class Originator {

    private StringBuilder text = new StringBuilder();

    public void append(String input) {
        text.append(input);
    }

    public String getText() {
        return text.toString();
    }

    /**
     * 创建快照
     * 
     * @return
     */
    public Snapshot creatSnapshot(String input) {
        return new Snapshot(input);
    }

    /**
     * 恢复快照
     * 
     * @return
     */
    public void restoreSnapshot(Snapshot snapshot) {
        text.replace(this.text.length() - snapshot.getText().length(), this.text.length(), "");
    }

}
