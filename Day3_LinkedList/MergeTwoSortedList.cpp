/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution
{
public:
    ListNode *mergeTwoLists(ListNode *list1, ListNode *list2)
    {
        if (list1 == NULL)
            return list2;
        if (list2 == NULL)
            return list1;

        ListNode *curr = list1;
        if (list1->val > list2->val)
        {
            curr = list2;
            ListNode *temp = mergeTwoLists(list1, list2->next);
            curr->next = temp;
        }
        else
        {
            ListNode *temp = mergeTwoLists(list1->next, list2);
            curr->next = temp;
        }
        return curr;
    }
};