package com.example.eventposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.eventposter.Model.Speciality;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Speciality> list = new ArrayList<Speciality>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadDate();
        ListView listView = (ListView) findViewById(R.id.listSpec);
        SpecialityAdapter adapter = new SpecialityAdapter(this, R.layout.row_speciality, list);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Speciality selected = (Speciality) parent.getItemAtPosition(position);
                Intent i = new Intent(view.getContext(), DoctorActivity.class);
                i.putExtra("Id",selected.getId());
                startActivity(i);
            }
        };
        listView.setOnItemClickListener(itemListener);

    }

    private void LoadDate() {
        list.add(new Speciality(1,"Врач", R.drawable.test));
        list.add(new Speciality(2,"Врач12", R.drawable.ic_launcher_background));
        list.add(new Speciality(3,"Врач13", R.drawable.ic_launcher_foreground));
        list.add(new Speciality(4,"Врач14", R.drawable.test));
        list.add(new Speciality(5,"Врач15", R.drawable.test));
    }
}