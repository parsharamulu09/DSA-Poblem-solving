public class Printallele{
    public void printAll(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String [] args){
        int[] nums={1,2,3,4,5};
        Printallele printAll=new Printallele();
        printAll.printAll(nums);
    }
}