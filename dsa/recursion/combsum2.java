class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
         for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        comb(target,0,arr,ans,ds);
        
      
        return ans;
    }
    public void comb(int target,int ind,int arr[],List<List<Integer>> ans, List<Integer> ds){
         
        
            if(target==0){
                ans.add(new ArrayList<>(ds));
            
            return;}
        
              
               for(int i=ind;i<arr.length;i++){
       if(i>ind && arr[i]==arr[i-1])continue;
       
        if(arr[i]<=target){
             ds.add(arr[i]);
             comb(target-arr[i],i+1,arr,ans,ds);
             ds.remove(ds.size()-1);
        }
        else {
            break;
        }
       }
        
    }