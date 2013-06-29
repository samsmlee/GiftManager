package com.samsmlee.giftmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import java.util.Locale;

public class GiftActivity extends FragmentActivity {

    public static final int INDEX_RECEIVED = 0;
    public static final int INDEX_GIVEN = 1;
    public static final int INDEX_PEOPLE = 2;
    public static final int INDEX_REMINDERS = 3;

    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gift, menu);
        return true;
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter
    {
        private static final int PAGE_COUNT = 4;
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return new GiftFragment();
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case INDEX_RECEIVED:
                    return getString(R.string.title_received).toUpperCase(l);
                case INDEX_GIVEN:
                    return getString(R.string.title_given).toUpperCase(l);
                case INDEX_PEOPLE:
                    return getString(R.string.title_people).toUpperCase(l);
                case INDEX_REMINDERS:
                    return getString(R.string.title_reminders).toUpperCase(l);
            }
            return null;
        }


    }
    
}
