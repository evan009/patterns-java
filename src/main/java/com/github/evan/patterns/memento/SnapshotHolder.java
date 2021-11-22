package com.github.evan.patterns.memento;

import java.util.LinkedList;

/**
 * @desc: 扩招对象实例
 * @author: evan
 * @date: 2021/11/22
 */
public class SnapshotHolder {

    private LinkedList<Snapshot> snapshotLinkedList = new LinkedList<>();

    /**
     * 存入快照对象
     * 
     * @param snapshot
     */
    public void add(Snapshot snapshot) {
        snapshotLinkedList.offer(snapshot);
    }

    /**
     * 获取快照对象
     * 
     * @return
     */
    public Snapshot get() {
        return snapshotLinkedList.peekLast();
    }
}
