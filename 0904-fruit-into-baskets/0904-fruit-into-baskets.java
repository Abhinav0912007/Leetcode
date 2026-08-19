class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        Map<Integer,Integer> freq  = new HashMap<>();
        int maxlen  = 0;
        for(int high  = 0;high<fruits.length;high++){
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
          while(freq.size()>2){
            int lowfruit = fruits[low];
            freq.put(lowfruit,freq.get(lowfruit)-1);
            if(freq.get(lowfruit)==0){
                freq.remove(lowfruit);
            }
            low++;

          }
          maxlen = Math.max(maxlen,high-low+1);
        }

        return maxlen;
    }
}