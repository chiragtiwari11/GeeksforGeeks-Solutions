class Solution {
    
    void clockwise( int []arr, int start, int end){
        while ( start < end ){
            int temp = arr[start];
            arr[start] = arr[ end ];
            arr[ end ] = temp;
            
            start ++;
            end --;
            }
        }
     public void rotateArr( int [] arr, int d ){
         int n = arr.length;
         d = d % n;
         
         clockwise(arr, 0, d -1 );
         clockwise( arr, d , n -1 );
         clockwise ( arr, 0, n-1);
         
    }
}