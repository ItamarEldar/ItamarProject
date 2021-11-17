package com.example.itamarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    private ArrayList<String> clasess=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clasess.add("Math");
        clasess.add("English");
        clasess.add("CS");
        clasess.add("Physics");
        clasess.add("bible study");
        SimpleAdapter adapter=new SimpleAdapter(this, clasess);
        list=findViewById(R.id.lv);//מקשר בין הרשימה באקטיביטי לרשימה בxml
        list.setAdapter(adapter);//מכניס את התוכן לתוך הרשימה
        list.setOnItemClickListener(this);//הופך את הרשימה לליחצה כפתורית
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent=new Intent(this, ClassActivity.class);
        switch (i){
            case 0:
                intent.putExtra("TYPE","Math");
                break;
            case 1:
                intent.putExtra("TYPE","English");
                break;
            case 2:
                intent.putExtra("TYPE","CS");
                break;
            case 3:
                intent.putExtra("TYPE","Physics");
                break;
            case 4:
                intent.putExtra("TYPE","bible study");
                break;
        }
        startActivity(intent);//שולח פקודה לקלאס אקטיביטי לעבוד
    }
}
