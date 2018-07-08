package com.example.pny.twoactivity_frakment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pny.twoactivity_frakment.R;

import java.util.List;

/**
 * Created by PNY on 7/8/2018.
 */

public class CustomerSpinnerAdapter extends BaseAdapter {

    Context context;
    int[] img;
    String strName[];
    LayoutInflater inflater;

    public CustomerSpinnerAdapter(Context context, String[] strName) {
        this.context = context;
        this.strName = strName;
       inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return strName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.spinner_cus,  null);
        TextView textView = convertView.findViewById(R.id.textView5);
        textView.setText(strName[position]);
        return convertView;
    }
}
