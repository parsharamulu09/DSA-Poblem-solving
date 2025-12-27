public class Avgofele {
    public double average(int nums[]){
        int sum=0;
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        double avg=sum/n;
        return avg;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,3,4,5};
        Avgofele avgs=new Avgofele();
        double result=avgs.average(nums);
        System.out.println(result);
    }
}
