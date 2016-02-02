package erm.customcalculator.enums;

import android.content.Context;

import erm.customcalculator.R;
import erm.customcalculator.classes.Utils;
import erm.customcalculator.fragments.ArithmeticFragment;
import erm.customcalculator.fragments.BinProbFragment;
import erm.customcalculator.fragments.CalcBase;
import erm.customcalculator.fragments.CombinationFragment;
import erm.customcalculator.fragments.ConfidenceIntervalFragment;
import erm.customcalculator.fragments.GeoProbFragment;
import erm.customcalculator.fragments.PermutationFragment;
import erm.customcalculator.fragments.SineCosineTangentFragment;
import erm.customcalculator.fragments.StdDeviationOfSamplingDistributionFragment;
import erm.customcalculator.fragments.ZScoreFragment;

/**
 * Created by ellio on 1/31/2016.
 */
public enum Calculations {
    ARITHMETIC,COMBINATION,PERMUTATION,BINOMIAL_PROBABILITY,GEOMETRIC_PROBABILITY, STD_DEV_SPL_DISTRO,Z_SCORE,CONFIDENCE_INT,
    SINE_COSINE_TANGENT,SINE,COSINE,TANGENT,A_SINE,A_COSINE,A_TANGENT,ANGLE_RADIANS,ANGLE_DEGRESS,NET_FORCE,GRAV_FORCE,MASS,DIST_BET_OBJ,QUAD_FORMULA;



    public static Calculations getCalculationByTitle(Context context, String title){
           Calculations eCalc = ARITHMETIC; //default if none found

           //must be a valid string
           if(!Utils.isValidString(title))
               return null;

           if(title.contains(context.getString(R.string.arithmetic))) {
               eCalc = ARITHMETIC;
           } else if(title.contains(context.getString(R.string.combination))){
               eCalc = COMBINATION;
           } else if(title.contains(context.getString(R.string.permutation))){
               eCalc = PERMUTATION;
           } else if(title.contains(context.getString(R.string.binomial_probability))){
               eCalc = BINOMIAL_PROBABILITY;
           } else if(title.contains(context.getString(R.string.geometric_probability))){
               eCalc = GEOMETRIC_PROBABILITY;
           }else if(title.contains(context.getString(R.string.std_deviation))){
               eCalc = STD_DEV_SPL_DISTRO;
           }else if(title.contains(context.getString(R.string.z_score))){
               eCalc = Z_SCORE;
           }else if(title.contains(context.getString(R.string.confidence_interval))) {
               eCalc = CONFIDENCE_INT;
           } else if(title.contains(context.getString(R.string.sine_cosine_tangent))){
                eCalc = SINE_COSINE_TANGENT;
           }else if(title.contains(context.getString(R.string.sin))){
               eCalc = SINE;
           }else if(title.contains(context.getString(R.string.cosine))){
               eCalc = COSINE;
           }else if(title.contains(context.getString(R.string.tangent))){
               eCalc = TANGENT;
           }else if(title.contains(context.getString(R.string.arc_sine))){
               eCalc = A_SINE;
           }else if(title.contains(context.getString(R.string.arc_cosine))){
               eCalc = A_COSINE;
           }else if(title.contains(context.getString(R.string.arc_tangent))){
               eCalc = A_TANGENT;
           }else if(title.contains(context.getString(R.string.angle_degrees))){
               eCalc = ANGLE_DEGRESS;
           }else if(title.contains(context.getString(R.string.angle_radian))){
               eCalc = ANGLE_RADIANS;
           }else if(title.contains(context.getString(R.string.net_force))){
               eCalc = NET_FORCE;
           }else if(title.contains(context.getString(R.string.gravitation_force))){
               eCalc = GRAV_FORCE;
           }else if(title.contains(context.getString(R.string.mass_of_object))){
               eCalc = MASS;
           }else if(title.contains(context.getString(R.string.distance_between_objects))){
               eCalc = DIST_BET_OBJ;
           }else if(title.contains(context.getString(R.string.quadratic_formula))){
               eCalc = QUAD_FORMULA;
           }

        return eCalc;
    }

    public static CalcBase getFragmentByCalculation(Calculations eCalc){
        CalcBase frag= new ArithmeticFragment(); //default if none found

        if(eCalc==ARITHMETIC) {
            frag = new ArithmeticFragment();
        } else if(eCalc == COMBINATION){
            frag = new CombinationFragment();
        } else if(eCalc == PERMUTATION){
            frag = new PermutationFragment();
        }else if(eCalc == BINOMIAL_PROBABILITY){
            frag = new BinProbFragment();
        }else if(eCalc == GEOMETRIC_PROBABILITY){
            frag = new GeoProbFragment();
        }else if(eCalc == STD_DEV_SPL_DISTRO){
            frag = new StdDeviationOfSamplingDistributionFragment();
        }else if(eCalc == Z_SCORE){
            frag = new ZScoreFragment();
        }else if(eCalc == CONFIDENCE_INT){
            frag = new ConfidenceIntervalFragment();
        }else if(eCalc == SINE){
            frag = new SineCosineTangentFragment();
        }else if(eCalc == COSINE){
            frag = new SineCosineTangentFragment();
        }else if(eCalc == TANGENT){
            frag = new SineCosineTangentFragment();
        }else if(eCalc == A_SINE){
            frag = new ArithmeticFragment();
        }else if(eCalc == A_COSINE){
            frag = new ArithmeticFragment();
        }else if(eCalc == A_TANGENT){
            frag = new ArithmeticFragment();
        } else if(eCalc == ANGLE_DEGRESS){
            frag = new ArithmeticFragment();
        }else if(eCalc == ANGLE_RADIANS){
            frag = new ArithmeticFragment();
        }else if(eCalc == NET_FORCE){
            frag = new ArithmeticFragment();
        }else if(eCalc == GRAV_FORCE){
            frag = new ArithmeticFragment();
        }else if(eCalc == MASS){
            frag = new ArithmeticFragment();
        }else if(eCalc == DIST_BET_OBJ){
            frag = new ArithmeticFragment();
        }else if(eCalc == QUAD_FORMULA){
            frag = new ArithmeticFragment();
        }
        return frag;
    }

}
