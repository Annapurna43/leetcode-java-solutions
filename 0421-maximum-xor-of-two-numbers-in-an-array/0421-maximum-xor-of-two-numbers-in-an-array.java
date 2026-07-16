class Solution {
    class Node{
        Node child[] = new Node[2];
    }
    Node root;
    public int findMaximumXOR(int[] nums) {
        root = new Node();
        for(int i = 0; i < nums.length; i++){
            insert(nums[i]);
        }
         
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = getMax(nums[i]);
            ans = Math.max(temp, ans);
        }
        return ans;

    }

    public int getMax(int num){
        Node curr = root;
        int ans = 0;

        for(int i = 31; i >= 0; i--){
            int bit = (num >> i) & 1;
            if(curr.child[1-bit] != null){
                ans = ans | (1 << i);
                curr = curr.child[1-bit];
            }else{
                curr = curr.child[bit];
            }
        }
        return ans;
    }

    public void insert(int num){
        Node curr = root;
        for(int i = 31; i>=0; i--){
            int bit = (num >> i) & 1;
            if(curr.child[bit] == null){
                curr.child[bit] = new Node();
            }
            curr = curr.child[bit];
        }
    }


}