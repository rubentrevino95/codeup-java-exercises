public class Warmups {
    public static int[] numberList = new int[]{10, 15, 3 ,7};
    public static int k = 17;

    public boolean addCheck(int[] numberList, int k){
        for (int index : numberList){
            int sum = index;
            for (int i = 0; i < numberList.length; i++){
                sum += numberList[i];
                if (sum == k){
                    return true;
                } else {
                    sum = index;
                }
            }
        }
        return false;
    }
}
