class Solution
{
public:
    int pivotIndex(vector<int> &nums)
    {
        int right(0);
        for (auto i : nums)
        {
            right += i;
        }
        int left(0);
        for (int i = 0; i < nums.size(); i++)
        {
            right -= nums[i];
            if (left == right)
                return i;
            left += nums[i];
        }
        return -1;
    }
};