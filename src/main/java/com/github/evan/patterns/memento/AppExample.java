package com.github.evan.patterns.memento;

import java.util.Scanner;

/**
 * @desc: 备忘录应用实例
 * @author: evan
 * @date: 2021/11/22
 */
public class AppExample {

    public static void main(String[] args) {
        Originator inputText = new Originator();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("list")) {
                System.out.println(inputText.getText().toString());
            } else if (input.equals("undo")) {
                Snapshot snapshot = snapshotHolder.get();
                inputText.restoreSnapshot(snapshot);
            } else {
                snapshotHolder.add(inputText.creatSnapshot(input));
                inputText.append(input);
            }
        }
    }

}
