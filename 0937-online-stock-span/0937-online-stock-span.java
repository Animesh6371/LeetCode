class StockSpanner {

    Stack<Integer> Price;
    Stack<Integer> Span;

    public StockSpanner() 
    {
        Price = new Stack<>();
        Span = new Stack<>();
    }
    
    public int next(int price) 
    {
        int span = 1;
        while(!Price.isEmpty() && price >= Price.peek())
        {
            Price.pop();
            span += Span.pop();
        }
        Price.push(price);
        Span.push(span);
        return span;    
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */