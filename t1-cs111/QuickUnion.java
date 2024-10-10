public class QuickUnion {
    private static int[] parent;

    public static int find(int a){
        int temp = a; //eg temp = 0, starting index
        while(temp != parent[temp]){ //id[0] != 0
            temp = parent[temp]; //set temp to id[0] = 1
        }
        return temp;
    }

    public static void union(int a, int b){
        int roota = find(a);
        int rootb = find(b);
        parent[roota] = rootb; //set root of a to root of b

    }
}