package com.example.android.mylifechecklist;

import android.content.Context;

/**
 * Created by mostafayehya on 20/04/17.
 */

public class CustomCheckBox extends android.support.v7.widget.AppCompatCheckBox{


   public CustomCheckBox(Context mycontext , int text){
       super(mycontext);
       setText(text);
   }
}

