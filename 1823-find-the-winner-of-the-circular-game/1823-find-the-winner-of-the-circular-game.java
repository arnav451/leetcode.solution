class Solution {
    public int findTheWinner(int n, int k) {
        int winnerPosition = 0; 
        
        for (int i = 2; i <= n; i++) {
            winnerPosition = (winnerPosition + k) % i;
        }
        
        return winnerPosition + 1;
    }
}