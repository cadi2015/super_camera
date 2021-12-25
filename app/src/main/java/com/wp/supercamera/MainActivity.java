package com.wp.supercamera;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    private static final String FRAGMENT_TAG_HOMEPAGE = "fragment_book";
    private static final String FRAGMENT_TAG_DISCOVER = "fragment_fish";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchFragment(R.id.tab_book,savedInstanceState);
    }



    public void switchFragment(int tabId, Bundle args) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        String fragmentTag = getFragmentTag(tabId);
        Fragment fragment = fm.findFragmentByTag(fragmentTag);
        if (fragment == null) {
            fragment = newFragment(tabId, args);
            ft.add(R.id.container, fragment, fragmentTag);
        }
        ft.commitAllowingStateLoss();
    }

    private String getFragmentTag(int tabId) {
        switch (tabId) {
            case R.id.tab_book:
                return FRAGMENT_TAG_HOMEPAGE;
            case R.id.tab_fish:
                return FRAGMENT_TAG_DISCOVER;
            default:
                return null;
        }
    }


    private Fragment newFragment(int tabId, Bundle args) {
        Fragment fragment = null;
        switch (tabId) {
            case R.id.tab_book:
                fragment = new BookFragment();
                break;
            case R.id.tab_fish:
                fragment = new CameraFragment();
                break;
            default:
                break;
        }
        if (fragment != null) {
            fragment.setArguments(args);
        }
        return fragment;
    }


}
