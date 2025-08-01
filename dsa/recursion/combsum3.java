class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       
     List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
       

        comb(arr,0,n,ds,ans,k);
        return ans;
    }
    public void comb(int arr[],int ind, int tar,List<Integer>ds,List<List<Integer>> ans,int n){
       
       

        
            if(tar==0 && ds.size()==n){
                ans.add(new ArrayList<>(ds));
                return;
            }
           for(int j=ind;j<arr.length;j++){
            if(arr[j]>tar)break;
            ds.add(arr[j]);
            comb(arr,j+1,tar-arr[j],ds,ans,n);
            ds.remove(ds.size()-1);
           }
               

        
    }
}