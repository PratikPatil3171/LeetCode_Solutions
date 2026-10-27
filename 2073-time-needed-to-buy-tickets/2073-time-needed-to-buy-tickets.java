class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        // int time=0;

        // while(tickets[k]>0){
        //     for(int i=0;i<tickets.length;i++){
        //         if(tickets[i]>0){
        //             tickets[i]--;
        //             time++;

        //             if(tickets[k]==0){
        //                 return time;
        //             }
        //         }
        //     }
        // }
        // return time;

        int time = 0;
        int targetTickets = tickets[k];

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], targetTickets);
            } else {
                time += Math.min(tickets[i], targetTickets - 1);
            }
        }

        return time;
    }
}