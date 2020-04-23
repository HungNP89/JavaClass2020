package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class lab2_3 extends AppCompatActivity {
    final String[] COUNTRIES = new String[]{
            "Afghanistan","Albania", "Angeria", "American Samoa", "Andorra",
            "Angola","Anguilla","Antarctica", "Antigua and Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
    };
    ArrayList<String> listCountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listCountries = new ArrayList<>();
        for(int i=0; i<COUNTRIES.length; i++)
        {
            listCountries.add(COUNTRIES[i]);
        }

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout btnLayout = new LinearLayout(this);

        final ListView listView = new ListView(this);
        setContentView(layout);

        final EditText editText= new EditText(this);
        layout.addView(btnLayout);
        layout.addView(editText);
        layout.addView(listView);

        Button addBtn = new Button(this);
        Button editBtn = new Button(this);
        Button removeBtn = new Button(this);
        Button nextBtn = new Button(this);

        addBtn.setText("Add");
        editBtn.setText("Edit");
        removeBtn.setText("Remove");
        nextBtn.setText("Next lab ");

        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);
        btnLayout.addView(nextBtn);


        final ArrayAdapter<String> aa ;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,listCountries);
        listView.setAdapter(aa);
        final Intent intent = new Intent(this , lab2_4.class);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                listCountries.add(text);
                listView.setAdapter(aa);
            }
        });
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                for (int i=0;i<listCountries.size();i++)
                {
                    if(text.equals(listCountries.get(i)))
                    {
                        listCountries.remove(listCountries.get(i));
                        listView.setAdapter(aa);
                    }
                }
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}