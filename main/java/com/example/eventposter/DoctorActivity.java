package com.example.eventposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.eventposter.Model.Doctor;

import java.util.ArrayList;

public class DoctorActivity extends AppCompatActivity {

    private ArrayList<Doctor> listD = new ArrayList<Doctor>();
    private ArrayList<Doctor> listDEnd = new ArrayList<Doctor>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        LoadDate();
        Bundle arg = getIntent().getExtras();
        //int id;
        //id.setText(arg.get("Id").toString());
        int id = arg.getInt("Id");
        for (Doctor d: listD) {
            if (d.getSpeciality_FK() == id)
                listDEnd.add(d);
        }

        ListView listView = (ListView) findViewById(R.id.listDoc);
        DoctorAdapter adapter = new DoctorAdapter(this, R.layout.list_doctors, listDEnd);
        listView.setAdapter(adapter);

       /*AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Doctor selected = (Doctor) parent.getItemAtPosition(position);
                Intent i = new Intent(view.getContext(), DoctorActivity.class);
                i.putExtra("FIO", selected.getFIO());
                startActivity(i);
            }
        };
        listView.setOnItemClickListener(itemListener);*/
    /*private ArrayList<String> doctorlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        LoadDate();
        TextView ttt = (TextView) findViewById(R.id.ttttt);
        Bundle arg = getIntent().getExtras();
        ttt.setText(arg.get("Name").toString());
    }*/
    }
    private void LoadDate() {
        listD.add(new Doctor(1,"f",1,1,1,R.drawable.test));
        listD.add(new Doctor(2,"fgh",1,2,1,R.drawable.test));
        listD.add(new Doctor(3,"fgh",1,2,1,R.drawable.test));
        listD.add(new Doctor(4,"fgh",1,2,1,R.drawable.test));
        listD.add(new Doctor(5,"fgh",2,2,1,R.drawable.test));
        listD.add(new Doctor(6,"fgh",2,2,1,R.drawable.test));
        listD.add(new Doctor(7,"fgh",2,2,1,R.drawable.test));
        listD.add(new Doctor(8,"fgh",3,2,1,R.drawable.test));
        listD.add(new Doctor(9,"fgh",3,2,1,R.drawable.test));
        listD.add(new Doctor(10,"fgh",4,2,1,R.drawable.test));
        listD.add(new Doctor(11,"fgh",4,2,1,R.drawable.test));
        listD.add(new Doctor(12,"fgh",4,2,1,R.drawable.test));
        listD.add(new Doctor(13,"fgh",5,2,1,R.drawable.test));
        listD.add(new Doctor(14,"fgh",5,2,1,R.drawable.test));
        listD.add(new Doctor(15,"fgh",5,2,1,R.drawable.test));
    }

}