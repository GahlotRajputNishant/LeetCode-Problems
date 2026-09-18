class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int r1=m-1;
        int r2=arr2.length-1;
        int w=m+n-1;
        while(w >= 0){
            if(r1>=0 && r2>=0){
                arr1[w]=arr1[r1]>arr2[r2]? arr1[r1--]:arr2[r2--];
        
            }
            else if(r1>=0){
                arr1[w]=arr1[r1--];
            }
            else{
                arr1[w]=arr2[r2--];
            }
            w--;
        }
    }
}