package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String[] itemLavagem = {"Lavagem Tradicional", "Lavagem Detalhada", "Lavagem a Seco", "Lavagem a Vapor"};
    String[] itemCarro = {"Sedan", "Picap", "Cupê", "SUV", "Crossover", "Mini Van", "Hatch","Station Wagon"};

    AutoCompleteTextView autoCompleteTextViewLavagem;
    AutoCompleteTextView autoCompleteTextViewCarro;

    ArrayAdapter<String> adapterItemsLavagem;
    ArrayAdapter<String> adapterItemsCarro;


    // Dialogo das funções DataPicker e TimePicker
    private Text text;
    private Button btnDataPicker;
    private Button btnTimePicker;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextViewLavagem = findViewById(R.id.auto_complete_txt_lavagem);
        autoCompleteTextViewCarro = findViewById(R.id.auto_complete_txt_carro);

        adapterItemsLavagem = new ArrayAdapter<String>(this, R.layout.list_item, itemLavagem);
        adapterItemsCarro = new ArrayAdapter<String>(this, R.layout.list_item, itemCarro);

        autoCompleteTextViewLavagem.setAdapter(adapterItemsLavagem);
        autoCompleteTextViewCarro.setAdapter(adapterItemsCarro);

        autoCompleteTextViewLavagem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Item Lavagem: " + item, Toast.LENGTH_SHORT).show();
            }
        });

        autoCompleteTextViewCarro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = adapterView.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "Item Carro: " + item, Toast.LENGTH_SHORT).show();
            }
        });

        btnDataPicker = findViewById(R.id.btnDataPicker);
        btnTimePicker = findViewById(R.id.btnTimePicker);

        btnDataPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDataDialog();
            }
        });

        btnTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeDialog();
            }
        });
    }
    private void openDataDialog() {

        Calendar cal = Calendar.getInstance();
        int yearInstance = cal.get(Calendar.YEAR);
        int monthInstance = cal.get(Calendar.MONTH);
        int dayInstance = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);


        DatePickerDialog dialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                btnDataPicker.setText(String.valueOf(dayOfMonth) + "/" + String.valueOf(month+1) + "/" + String.valueOf(year) );
            }
        }, yearInstance, monthInstance, dayInstance);

        dialog.show();
    }

    private void openTimeDialog() {
        Calendar cal = Calendar.getInstance();
        int currentHour = cal.get(Calendar.HOUR);
        int currentMinute = cal.get(Calendar.MINUTE);


        TimePickerDialog dialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                btnTimePicker.setText(String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
            }
        }, currentHour + 9, currentMinute, true);
        dialog.show();
    }
}