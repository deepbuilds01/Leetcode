class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<stones.length; i++){
            pq.add(stones[i]);
        }

        // System.out.print(pq);

        while(!pq.isEmpty() && pq.size()!=1){
            int x = pq.poll();
            int y = pq.poll();

            // System.out.print(pq);

            if(x==y){
                continue;
            }else{
                pq.add(x-y);
            }
        }
        
        
        return pq.isEmpty() ? 0 : pq.peek();  
    }
}