import java.util.PriorityQueue;

/*
time complexity: O(nlogk) n for total nodes
space complexity: O(n)
 */


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class leetcode23_merge_k_sorted_lists {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length,(a, b)->a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for(ListNode node : lists){
            if(node != null){
                minHeap.add(node);
            }
        }
        while(!minHeap.isEmpty()){
            dummy.next = minHeap.poll();
            dummy = dummy.next;
            if(dummy.next != null){
                minHeap.add(dummy.next);
            }


        }
        return cur.next;

    }

}
