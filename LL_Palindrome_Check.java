class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr1 = head;
        ListNode curr2 = head;
        int len = 1;
        Stack<Integer> pali = new Stack<>(); 

        if(head == null){
            return true;
        }

        while(curr1.next != null){
            curr1 = curr1.next;
            len++;
        }

        for(int i = 0; i < len/2; i++){
            pali.push(curr2.val);
            curr2 = curr2.next;
        }

        if(len % 2 != 0){
            curr2 = curr2.next;
        }

        for(int j = 0; j < len/2; j++){
            if(curr2.val == pali.peek()){
                pali.pop();
            }
            else{
                return false;
            }
            curr2 = curr2.next;
        }
        return pali.isEmpty();
    }
}