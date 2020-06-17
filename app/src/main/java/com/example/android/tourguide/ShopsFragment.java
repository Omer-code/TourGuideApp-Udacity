package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.locatin_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        //r means region, c means contact
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));
        locations.add(new Location(getString(R.string.six_boys)));
        locations.add(new Location(getString(R.string.salwa), getString(R.string.salwa_r), getString(R.string.panda_c), getString(R.string.salwa_web)));
        locations.add(new Location(getString(R.string.city_max)));
        locations.add(new Location(getString(R.string.mom_care)));
        locations.add(new Location(getString(R.string.feeling), getString(R.string.feeling_r), getString(R.string.panda_c), getString(R.string.feeling_web)));
        locations.add(new Location(getString(R.string.wallmart)));
        locations.add(new Location(getString(R.string.feeling), getString(R.string.feeling_r), getString(R.string.panda_c), getString(R.string.feeling_web)));
        locations.add(new Location(getString(R.string.salwa), getString(R.string.salwa_r), getString(R.string.panda_c), getString(R.string.salwa_web)));
        locations.add(new Location(getString(R.string.panda2), getString(R.string.panda2_r), getString(R.string.panda_c), getString(R.string.panda2_c)));
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));
        locations.add(new Location(getString(R.string.panda), getString(R.string.panda_r), getString(R.string.panda_c), getString(R.string.najran_web)));

        LocationAdapter locationLocationAdapter = new LocationAdapter(getActivity(), locations, R.color.backgroundListColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationLocationAdapter);

        return rootView;
    }
}
