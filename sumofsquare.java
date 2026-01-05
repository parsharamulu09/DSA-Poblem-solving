public class sumofsquare {
    public int sumOfSquares(int number) {
        int sum=0;
        for(int i=0;i<=number;i++){
            sum+=i*i;
        }
        return sum;
    }
}
