public class NewBinary {
  public static int printArray(int numbers[], int key) {
    int start = 0,end = numbers.length-1;
    while(start<=end) {
      int mid = (start+end)/2;
      if(numbers[mid]==key) {
        return mid;
      }
      if(numbers[mid]<key) {
        start = mid+1;
      }
      else {
        end = mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10};
    int key = 9;
    int ans = printArray(numbers, key);
    System.out.println("key founs at index: "+ans);
  }
}
