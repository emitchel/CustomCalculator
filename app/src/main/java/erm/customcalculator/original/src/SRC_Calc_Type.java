package erm.customcalculator.original.src;

/**
 * Created by ellio on 1/31/2016.
 */
public class SRC_Calc_Type{
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Double CI(Double PH, Double CV, Double N) { //First X in Confidence interval


        Double answer1 = CV;
        Double answer2 = (PH * (1 - PH)) / N ;
        Double answer3 = answer1 * Math.sqrt(answer2);
        Double answer4 = PH + answer3;
        System.out.printf("Confidence Interval 1: %s \n", answer4);
        //Result
        return answer4;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Double CII(Double PH, Double CV, Double N){ //Second X in Confidence interval

        Double answer1 = CV;
        Double answer2 = (PH * (1 - PH)) / N ;
        Double answer3 = answer1 * Math.sqrt(answer2);
        Double answer4 = PH - answer3;
        System.out.printf("Confidence Interval 2: %s \n", answer4);
        return answer4;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Double Combination(Double n, Double r ){
        Double factn = SRC_Calc_Type.factorial(n);
        Double factr = SRC_Calc_Type.factorial(r);
        Double c = SRC_Calc_Type.factorial(n - r);
        Double answer = factn / (factr * c);
        if ( n > r){
            System.out.printf("(%s :C: %s) == %s\n", n, r,answer);
        }
        if (n < r){
            System.out.println("n must be larger than r\n");
        }
        return answer;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Double factorial(Double n) {
        Double fact = 1.0; // this  will be the result
        for (Double i = 1.0; i <= n; i++) {
            fact *= i;
        }
        return fact;
    } //Factorial method

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}