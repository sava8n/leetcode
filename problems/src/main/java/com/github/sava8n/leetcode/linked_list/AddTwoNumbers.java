package com.github.sava8n.leetcode.linked_list;

/**
 * Problem: <a href="https://leetcode.com/problems/add-two-numbers">Add Two Numbers</a>
 * Difficulty: Medium
 */
public class AddTwoNumbers {
    public ListNode solve(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2, res = new ListNode(), curr = res;

        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return res.next;
    }
}
