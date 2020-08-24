package com.sunpj.algorithms.leetcode.reverselinkedlist.third;

import com.sunpj.algorithms.leetcode.reverselinkedlist.ListNode;

/*
* 迭代方法
* iterative approach
* 对于当前节点curr，将其next指针指向前一个节点prev，使用nextTemp保存当前节点的下一个节点，避免丢失。
*
* */
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
