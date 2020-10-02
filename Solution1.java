// Number of Recent Calls

class RecentCounter {

    LinkedList<Integer> window;
    
    public RecentCounter() {
        this.window = new LinkedList<>();    
    }
    
    public int ping(int t) {
        this.window.addLast(t);
        
        while(this.window.size() > 0){
            if( this.window.getFirst() < t - 3000)
                this.window.removeFirst();
            else
                break;
        }
        
        return this.window.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
