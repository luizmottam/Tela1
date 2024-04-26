package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] itemLavagem = {"Lavagem Tradicional", "Lavagem Detalhada", "Lavagem a Seco", "Lavagem a Vapor"};
    String[] itemCarro = {"Sedan", "Picap", "Cupê", "SUV", "Crossover", "Mini Van", "Hatch","Station Wagon"};

    String[] itemLocalizacao = {"Edifício Barraca Armada"};

    AutoCompleteTextView autoCompleteTextViewLavagem;
    AutoCompleteTextView autoCompleteTextViewCarro;
    AutoCompleteTextView autoCompleteTextViewLocalizacao;

    ArrayAdapter<String> adapterItemsLavagem;
    ArrayAdapter<String> adapterItemsCarro;
    ArrayAdapter<String> adapterItemsLocalizacao;

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
    }
}