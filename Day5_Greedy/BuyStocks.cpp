class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int minPrice(INT_MAX), maxProfit(0);
        for (int j = 0; j < prices.size(); j++)
        {
            minPrice = min(minPrice, prices[j]);
            maxProfit = max(maxProfit, prices[j] - minPrice);
        }
        return maxProfit;
    }
};