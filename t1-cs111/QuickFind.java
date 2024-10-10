public class QuickFind {
    private int[] id;

    public QuickFind(int n){
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i] = i;
        }
    }

    //runtime: O(1)
    public int find(int a){
        return id[a];
    }

    //runtime: O(n) - too expensive
    public void union(int a, int b){
        //set all values with id[x] = id[a] to id[b]
    }


    //implementation: https://www.youtube.com/watch?v=FYIl2NQsac0
}