import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(5);

        ListNode actual = new Solution().deleteDuplicates(head);

        Assert.assertEquals(travers(expected), travers(actual));

    }
    @Test
    public void test2(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode expected = new ListNode(5);

        ListNode actual = new Solution().deleteDuplicates(head);

        Assert.assertEquals(travers(expected), travers(actual));

    }
    @Test
    public void test3(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);

        ListNode expected = new ListNode(1);

        ListNode actual = new Solution().deleteDuplicates(head);

        Assert.assertEquals(travers(expected), travers(actual));

    }
    public List<Integer> travers(ListNode head){
        List<Integer> result = new ArrayList<>();
        while (head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;
    }
}
