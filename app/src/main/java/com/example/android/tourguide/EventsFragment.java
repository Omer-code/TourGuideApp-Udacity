package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.locatin_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        //r means region, c means contact
        locations.add(new Location(getString(R.string.bara), getString(R.string.bara_river), getString(R.string.contact_bara), getString(R.string.web_bara), R.drawable.festival));
        locations.add(new Location(getString(R.string.bara), getString(R.string.bara_river), getString(R.string.contact_bara), getString(R.string.web_bara), R.drawable.festival));
        locations.add(new Location(getString(R.string.bara), getString(R.string.bara_river), getString(R.string.contact_bara), getString(R.string.web_bara), R.drawable.festival));
        locations.add(new Location(getString(R.string.bara), getString(R.string.bara_river), getString(R.string.contact_bara), getString(R.string.web_bara), R.drawable.festival));
        locations.add(new Location(getString(R.string.bara), getString(R.string.bara_river), getString(R.string.contact_bara), getString(R.string.web_bara), R.drawable.festival));

        LocationAdapter locationLocationAdapter = new LocationAdapter(getActivity(), locations, R.color.backgroundListColor);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(locationLocationAdapter);

        return rootView;
    }
}
