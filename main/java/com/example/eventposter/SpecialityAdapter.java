package com.example.eventposter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eventposter.Model.Speciality;

import java.util.List;

public class SpecialityAdapter extends ArrayAdapter<Speciality> {

    private LayoutInflater inflater;
    private int layout;
    private List<Speciality> speciality;

    public SpecialityAdapter(Context context, int resource, List<Speciality> speciality) {
        super(context, resource, speciality);
        this.speciality = speciality;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageSpec);
        TextView nameView = (TextView) view.findViewById(R.id.nameSpec);

        Speciality spec = speciality.get(position);

        imageView.setImageResource(spec.getImage());
        nameView.setText(spec.getName());

        return view;
    }
}
