package com.github.sava8n.leetcode.linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    static ListNode from(int[] array) {
        var node = new ListNode();

        var p = node;
        for (int i : array) {
            p.next = new ListNode(i);
            p = p.next;
        }

        return node.next;
    }

    static int[] toArray(ListNode node) {
        var list = new ArrayList<Integer>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public String toString() {
        var values = Arrays.stream(toArray(this))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" -> "));

        return "[" + values + "]";
    }
}
