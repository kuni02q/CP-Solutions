class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i = 0; i < arr.length-1; i++){
            int max = 0;
            int maxIndex = i+1;
            for(int j = i+1; j <arr.length; j++){
                
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }

            }

            arr[i] = arr[maxIndex];

        }

        arr[arr.length-1] = -1;

        return arr;

    }
}