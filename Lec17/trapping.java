class Solution {
    public int trap(int[] h) {
        int[] pre = new int[h.length];
        int[] suff = new int[h.length];

        pre[0]=h[0];
        for(int i=1;i<h.length;i++){
            pre[i] = Math.max(pre[i-1],h[i]);
        }

        suff[h.length-1] = h[h.length-1];

        for(int i=h.length-2;i>=0;i--){
            suff[i] = Math.max(suff[i+1],h[i]);
        }


        int sum =0;

        for(int i=0;i<h.length;i++){
            sum+=Math.min(pre[i],suff[i]) - h[i];
        }

        return sum;
        
    }
}