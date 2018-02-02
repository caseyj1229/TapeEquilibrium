//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/

public class TapeEquilibrium {
    //Array assumed to be non-empty
    public static int solution(int[] A){
        if(A.length == 1){
            return A[0];
        }

        double rightSum = 0;
        double leftSum = 0;

        leftSum = A[0];
        for(int i = 1; i<A.length;i++){
            rightSum += A[i];
        }

        double min = Math.abs((rightSum - leftSum));

        for(int i = 1; i<A.length; i++){
            if(Math.abs((rightSum - leftSum)) < min){
                min = Math.abs((rightSum - leftSum));
            }
            leftSum += A[i];
            rightSum -= A[i];
        }
        return (int) min;
    }
}
