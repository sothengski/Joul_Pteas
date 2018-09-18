package com.example.sothengchheang.ckcc;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.view.MenuItem;

public class TabActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{ //use current class instead of annonymous

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //add HomeFragment in the activity
//        HomeFragment homeFragment = new HomeFragment();
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.lyt_fragment_container,homeFragment);
//        fragmentTransaction.commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                return false;
//            } // Annonymous Instantiation
        //}); //another method

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if(menuItem.getItemId() == R.id.menu_home) {
            HomeFragment homeFragment = new HomeFragment();
            displayFragment(homeFragment);
        }
        else if (menuItem.getItemId() == R.id.menu_profile){
            ProfileFragment profileFragment = new ProfileFragment();
            displayFragment(profileFragment);
        }
        else{
            SettingFragment settingFragment = new SettingFragment();
            displayFragment(settingFragment);
        }
//        return false;
        return true;
    }
    private void displayFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyt_fragment_container,fragment);
        fragmentTransaction.commit();
    }
}
