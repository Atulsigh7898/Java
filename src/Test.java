
public class Test {

    public static void main(String[] args) {
        int num;
        double sqroot = 0;
        int sumPsq = 0; //sum variable
        int psq = 0; //counter for perfect squares
        double avg = 0;

        for(num = 101; num <= 149; num += 2){
           sqroot = Math.sqrt(num);

            if(sqroot*sqroot == num){ //Condition to find perfect squares
                psq += 1; //counting perfect squares
                sumPsq = sumPsq + num; //Find the sum of all the perfect squares

                System.out.println(num); //Print out the perfect squares
            }
        }
        avg = 1.0 * sumPsq/psq;
        System.out.println(avg);
    }

}