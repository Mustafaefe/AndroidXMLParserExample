package com.example.mustafa.kurtakip;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Mustafa on 23.11.2015.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private Container model;

    public CustomAdapter(Context context, Container model) {
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.getVector().size();
    }

    @Override
    public Object getItem(int position) {
        return model.getVector().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Kur kur = (Kur) getItem(position);

        LayoutInflater li = ((Activity) context).getLayoutInflater();
        LinearLayout pnlItem = (LinearLayout) li.inflate(R.layout.eleman_tasarimi, null);

        TextView paraBirimi = (TextView) pnlItem.findViewById(R.id.paraBirimi);
        paraBirimi.setText(kur.getParaBirimi());
        
        TextView alim = (TextView) pnlItem.findViewById(R.id.alim);
        alim.setText((kur.getAlim()+""));
        
        TextView satim = (TextView) pnlItem.findViewById(R.id.satim);
        satim.setText(kur.getSatim()+"");

        return pnlItem;
    }
}
