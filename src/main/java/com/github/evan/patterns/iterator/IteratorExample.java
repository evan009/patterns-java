package com.github.evan.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorExample {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        Iterator<String> iterator1 = strList.iterator();
        Iterator<String> iterator2 = strList.iterator();
        iterator1.next();
//        iterator1.remove();
//        strList.add("e");
        while (iterator2.hasNext()){
            log.info(iterator2.next());
        }
    }

}
