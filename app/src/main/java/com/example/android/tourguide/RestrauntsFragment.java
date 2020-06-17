package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestrauntsFragment extends Fragment {

    public RestrauntsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.locatin_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        //r means region, c means contact
        locations.add(new Location(getString(R.string.pizaa_hut), getString(R.string.hut_r), getString(R.string.hut_c), getString(R.string.hut_web), R.drawable.pizza_hut_image));
        locations.add(new Location(getString(R.string.pizaa_hut), getString(R.string.hut_r), getString(R.string.hut_c), getString(R.string.hut_web), R.drawable.pizza_hut_image));
        locations.add(new Location(getString(R.string.pizaa_hut), getString(R.string.hut_r), getString(R.string.hut_c), getString(R.string.hut_web), R.drawable.pizza_hut_image));
        locations.add(new Location(getString(R.string.pizaa_hut), getString(R.string.hut_r), getString(R.string.hut_c), getString(R.string.hut_web), R.drawable.pizza_hut_image));
        locations.add(new Location(getString(R.string.pizaa_hut), getString(R.string.hut_r), getString(R.string.hut_c), getString(R.string.hut_web), R.drawable.pizza_hut_image));

        LocationAdapter locationLocationAdapter = new LocationAdapter(getActivity(), locations, R.color.backgroundListColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationLocationAdapter);

        return rootView;
    }
}
