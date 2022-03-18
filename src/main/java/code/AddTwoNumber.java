package code;

public class AddTwoNumber {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // 添加头尾哨兵
    ListNode l1Head = new ListNode();
    l1Head.next = l1;
    ListNode l2Head = new ListNode();
    l2Head.next = l2;
    ListNode l1Guard = addGuard(l1Head);
    ListNode l2Guard = addGuard(l2Head);
    ListNode l1Point = l1Head.next;
    ListNode l2Point = l2Head.next;

    int carry = 0;
    ListNode resultHead = new ListNode();
    ListNode resultPoint = resultHead;
    // 节点相加
    while (l1Guard != l1Point && l2Guard != l2Point) {
      int sum = l1Point.val + l2Point.val + carry;
      resultPoint.next = new ListNode(sum % 10);
      carry = sum / 10;
      l1Point = l1Point.next;
      l2Point = l2Point.next;
      resultPoint = resultPoint.next;
    }

    // l1 比 l2 长
    while (l1Guard != l1Point) {
      int sum = l1Point.val + carry;
      resultPoint.next = new ListNode(sum % 10);
      carry = sum / 10;
      l1Point = l1Point.next;
      resultPoint = resultPoint.next;
    }
    while (l2Guard != l2Point) {
      int sum = l2Point.val + carry;
      resultPoint.next = new ListNode(sum % 10);
      carry = sum / 10;
      l2Point = l2Point.next;
      resultPoint = resultPoint.next;
    }
    if (0 != carry) {
      resultPoint.next = new ListNode(carry);
    }
    return resultHead.next;
  }

  private ListNode addGuard(ListNode node) {
    ListNode guard = new ListNode();
    while (null != node.next) {
      node = node.next;
    }
    node.next = guard;
    return guard;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(3);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(8);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(5);
//    l2.next.next.next = new ListNode(4);

    ListNode listNode = new AddTwoNumber().addTwoNumbers(l1, l2);
    while (null != listNode) {
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }
}
