package com.sunpj.algorithms.leetcode.reverselinkedlist.third;

import com.sunpj.algorithms.leetcode.reverselinkedlist.ListNode;
/*
* 递归方法 recursion approach
* （1）n1->n2->...nk->nk+1<-nk+2<-...nm，nK+1指向null，从nk开始之后的节点，已经逆序
* （2）再操作nk节点，使得它也加入到逆序链表中。operate on
* */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
