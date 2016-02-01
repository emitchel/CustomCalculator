package erm.customcalculator.fragments;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;

import erm.customcalculator.R;
import erm.customcalculator.classes.Utils;

/**
 * Created by ellio on 1/31/2016.
 * Base class to extend from
 */
public abstract class CalcBase  extends Fragment{
    public abstract String getNameOfCalculation();


    public abstract void clearPage();

    /**
     * Only return the message if the form is missing something / incorrect;
     * @return
     */
    public abstract String returnMessageIfBadFormData();
    /**
     * Just calculate the formula
     * @return
     */
    public abstract String calculate();

    /**
     * This is what will be called when the user presses the FAB
     */
    public void calculateAndDisplay(){
        String msg = returnMessageIfBadFormData();

        if(!Utils.isValidString(msg)){
            displayResult(getNameOfCalculation(),calculate());
        } else {
            throwFormError(msg);
        }
    }

    public void displayResult(String nameOfResult, String result){
        //show popup with option to copy to clipboard
        new AlertDialog.Builder(getActivity())
                .setTitle("Result")
                .setMessage(result)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })

                .show();

        logResult(nameOfResult,result);
    }

    public void throwFormError(String error){
        //Toast.makeText(getActivity(),error,Toast.LENGTH_LONG).show();
        Snackbar.make(getView(), error, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void logResult(String nameOfResult, String result){
        //log the result for  a history section (would be really nice)

    }
}
