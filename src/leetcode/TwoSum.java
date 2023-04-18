package leetcode;

/*Initialize a variable carry to 0
Initialize a dummy node and set it as the head of the result list.
Traverse the input lists until one or both of them is not empty
a. Calculate the sum of the current nodes of both lists and add carry to it
b. If the sum is greater than 9, set carry as 1, and subtract 10 from the sum
c. Create a new node with the sum and append it to the result list
d. Move the current node of each list to the next one
If carry is not zero, append a new node with carry to the result list
Return the next node of the dummy head as the head of the result list.*/

public class TwoSum {
    int val;
//    ListNode next;
    void ListNode(int x) { val = x; }
    public static void main(String[] args) {

    }
}
