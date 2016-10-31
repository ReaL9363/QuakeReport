package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ReaL PC on 10/31/2016.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView tvMagnitude = (TextView) listItemView.findViewById(R.id.tvMagnitude);
        tvMagnitude.setText(currentEarthquake.getmMagnitude());

        TextView tvLocation = (TextView) listItemView.findViewById(R.id.tvLocation);
        tvLocation.setText(currentEarthquake.getmLocation());

        TextView tvDate = (TextView) listItemView.findViewById(R.id.tvDate);
        tvDate.setText(currentEarthquake.getmDate());

        return listItemView;
    }
}
