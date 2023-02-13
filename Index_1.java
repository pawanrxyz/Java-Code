public class Index_1 {
    public static void main(String[] args) {
        int [] num = {23,45,3,4,3,19,54,-3,65,45};
        int target = 19;
        int ans = linearSearch(num,target);

        System.out.println(ans);

    }
    static int linearSearch(int [] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int index=0;index<arr.length;index++) {
            int element = arr[index];
            if(element==target) {
                return index;
            }
        }
        return -1;
    }       
}
