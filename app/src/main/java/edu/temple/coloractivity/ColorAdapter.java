package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors;
    LayoutInflater linflater;

    public ColorAdapter(Context appcontext, String[] colors) {
        this.context = appcontext;
        this.colors = colors;
        linflater = (LayoutInflater.from(appcontext));
    }
    @Override
    public int getCount() {
        return colors.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = linflater.inflate(R.layout.adapter_color, null);
        TextView colornames = (TextView) view.findViewById(R.id.textView);
        colornames.setText(colors[position]);
        
        return view;
    }


}

