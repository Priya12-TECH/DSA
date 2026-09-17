class StockSpanner {
    class Pair{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    Stack<Pair> stack = new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {

        int span = 1;

        while(!stack.empty() && stack.peek().first <= price){
            Pair top = stack.pop();
            span = span + top.second;
        }
        stack.push(new Pair(price,span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */