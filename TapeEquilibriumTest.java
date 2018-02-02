import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {
    @Test
    void solution() {
        int[] A = {3,1,2,3,2};
        assertEquals(1,TapeEquilibrium.solution(A));

        int[] B = {2};
        assertEquals(2,TapeEquilibrium.solution(B));

        int[] C = {9,8,7,6,5,4,3,2,1};
        assertEquals(3,TapeEquilibrium.solution(C));

        int[] D = {-1,1};
        assertEquals(2,TapeEquilibrium.solution(D));

        int[] E = {4,-5,8,3,-2,14,6};
        assertEquals(8,TapeEquilibrium.solution(E));

        int[] F = new int[100000];
        for(int i = 0; i<F.length;i++){
            if(i%2 == 0){
                F[i] = i;
            }
            else{
                F[i] = -i;
            }
        }
        assertEquals(0,TapeEquilibrium.solution(F));
    }
}