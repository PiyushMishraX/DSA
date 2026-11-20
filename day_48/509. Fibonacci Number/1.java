class Solution {
    public int fib(int n) {

        if( n <= 1){
            return n;
        }

        int p0 = 0;
        int p1 = 1;

        for (int i = 2; i <= n; i++) {
            int current = p1 + p0;
            p0 = p1;
            p1 = current;
        }

        return p1;
    }
}
