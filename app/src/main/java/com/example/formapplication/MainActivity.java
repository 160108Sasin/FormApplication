package com.example.formapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    RadioButton rbM, rbF, rbO;
    RadioGroup rgG;
    CheckBox cbM,cbT,cbD;
    Button button;
    Spinner  spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        rbO = findViewById(R.id.btnOthers);
        rbM= findViewById(R.id.btnMale);
        rbF= findViewById(R.id.btnFemale);
        spinner = findViewById(R.id.spinner1);
        cbT = findViewById(R.id.chkBox3);
        cbD = findViewById(R.id.chkBox2);
        cbM = findViewById(R.id.chkBox);
        rgG = findViewById(R.id.radioGroup);
        button = findViewById(R.id.btnSubmit);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "select one ", Toast.LENGTH_SHORT).show();

            }
        });

        cbM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b)
                {
                    Toast.makeText(MainActivity.this, "Music Checked",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Music Unchecked",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, gender, pradesh;
                name = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });

    }
}
