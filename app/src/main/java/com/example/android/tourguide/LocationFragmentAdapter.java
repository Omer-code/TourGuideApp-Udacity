package com.example.android.tourguide;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LocationFragmentAdapter extends FragmentPagerAdapter {

    private Context myContext;

    public LocationFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        myContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ShopsFragment();
            case 1:
                return new RestrauntsFragment();
            case 2:
                return new ParksFragment();
            case 3:
                return new EventsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return myContext.getString(R.string.shops_title);
            case 1:
                return myContext.getString(R.string.restaurants_title);
            case 2:
                return myContext.getString(R.string.parks_title);
            case 3:
                return myContext.getString(R.string.events_title);
            default:
                return null;
        }
    }
}
