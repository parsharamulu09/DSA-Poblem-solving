public class SumAll {
    static int sumall(int nums[]){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
        sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={5,10,15};
        int result=sumall(nums);
        System.out.println(result);
    }
}
