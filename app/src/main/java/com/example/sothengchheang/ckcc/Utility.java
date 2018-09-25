package com.example.sothengchheang.ckcc;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class Utility {
    public static void displayFragment(Fragment fragment,FragmentManager fragmentManager,@IdRes int fragmentContainer){
//        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(fragmentContainer,fragment);
        fragmentTransaction.commit();
    }
}
