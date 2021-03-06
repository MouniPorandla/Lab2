

package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Mounika on 3/7/2017.
 **/
// TODO (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
public class ForecastAdapter  extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {



    // TODO (23) Create a private string array called mWeatherData
    private String[] mWeatherData;

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)
    public ForecastAdapter() {
    }
    // TODO (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // TODO (17) Extend RecyclerView.ViewHolder

    // Within ForecastAdapterViewHolder /////////////mWeatherTextView//////////////////////////////////////////////

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder

    {
        // TODO (18) Create a public final TextView variable called
        public final TextView mWeatherTextView;

        // TODO (19) Create a constructor for this class that accepts a View as a parameter
        public ForecastAdapterViewHolder(View view)
        {
            // TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
            super(view);

            // TODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);

        }

    }


    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////


    // TODO (24) Override onCreateViewHolder
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup View_of_Group, int Type_View)
    {
        Context contxt = View_of_Group.getContext();
        // TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
        int layout_id_List = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(contxt);
        // TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
        boolean Toattachparentqickly = false;
        View view= inflater.inflate(layout_id_List, View_of_Group, Toattachparentqickly);
        return new ForecastAdapterViewHolder(view);

    }


    // TODO (27) Override onBindViewHolder
    // TODO (28) Set the text of the TextView to the weather for this list item's position
    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder AdapterViewHolder_of_forecast, int position)
    {
        String Weathertoday = mWeatherData[position];
        AdapterViewHolder_of_forecast.mWeatherTextView.setText(Weathertoday);
    }

    // TODO (29) Override getItemCount
    @Override
    public int getItemCount()
    {
        // TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
        if (null != mWeatherData)
        {
            return mWeatherData.length;
        }
        else
        {
            return 0;
        }
    }


    // TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    public void setWeatherData(String[] Data_of_the_Weather) {
        mWeatherData = Data_of_the_Weather;
        // TODO (32) After you save mWeatherData, call notifyDataSetChanged
        // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
        notifyDataSetChanged();
    }
}