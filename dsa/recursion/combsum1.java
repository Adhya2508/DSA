class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        findcom(candidates,0,target,ans,ds);
        return ans ;
        
    }
    public void findcom(int arr[],int ind, int targ, List<List<Integer>> ans, List<Integer> ds ){
        if(ind==arr.length){
            if(targ==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[ind]<=targ){
            ds.add(arr[ind]);
            findcom(arr,ind,targ-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcom(arr,ind+1,targ,ans,ds);
    }

   
}