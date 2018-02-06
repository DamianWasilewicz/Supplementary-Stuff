public class PossibleSum{
  public static void main(String[] args){
    System.out.println(isPossibleSum(1,7));
    System.out.println(isPossibleSum(5,7));
    System.out.println(isPossibleSum(10,7));
    System.out.println(isPossibleSum(3,10));
    System.out.println(isPossibleSum(4,5));
    System.out.println(isPossibleSum(6,7));
  }
  public static boolean isPossibleSum(int marker, int sum){
    int count = 0;
    int[] data = new int[marker + 1];
    for(int counter = 0; counter <= marker; counter++){
      data[counter] = count;
      count++;
    }
    return Help(data, sum, 0, 0);
  }
  public static boolean Help(int[] arr, int sum, int c1, int c2){
    if(arr[c1] + arr[c2] == sum){
      return true;
    }
    if(c1 == arr.length - 1 && c2 == arr.length - 1){
      return false;
    }
    if(c2 == arr.length - 1){
      return Help(arr, sum, c1 + 1, 0);
    }
    return Help(arr, sum, c1, c2 + 1);
   }
  }
