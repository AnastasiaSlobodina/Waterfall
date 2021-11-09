package com.example.eventposter;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eventposter.Model.Doctor;

import java.util.List;

public class DoctorAdapter extends ArrayAdapter<Doctor> {

    private LayoutInflater inflater;
    private int layout;
    private List<Doctor> doctor;

    public DoctorAdapter(Context context, int resource, List<Doctor> doctor) {
        super(context, resource, doctor);
        this.doctor = doctor;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageDoc);
        TextView fioView = (TextView) view.findViewById(R.id.fioDoc);
        TextView areaView = (TextView) view.findViewById(R.id.areaDoc);

        Doctor doc = doctor.get(position);

        imageView.setImageResource(doc.getImage());
        fioView.setText(doc.getFIO());
        areaView.setText(String.valueOf(doc.getArea()));
        return view;
    }

}
