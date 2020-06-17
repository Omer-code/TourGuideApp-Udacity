package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int categoryColorId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        categoryColorId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        locationNameTextView.setText(currentLocation.getLocationName());

        TextView regionTextView = (TextView) listItemView.findViewById(R.id.region);
        regionTextView.setText(currentLocation.getRegion());

        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact);
        contactTextView.setText(currentLocation.getContact());

        TextView postalCodeTextView = (TextView) listItemView.findViewById(R.id.postal_code);
        postalCodeTextView.setText(currentLocation.getWebsite());

        ImageView locationImageView = (ImageView) listItemView.findViewById(R.id.location_image);

        if (currentLocation.getImageId() == -1) {
            locationImageView.setVisibility(View.GONE);
        } else {
            locationImageView.setImageResource(currentLocation.getImageId());
            locationImageView.setVisibility(View.VISIBLE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), categoryColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
