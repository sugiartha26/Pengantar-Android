package com.sugiartha.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasikan Variabel
    EditText TextNama;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variabel Berdasarkan id
        //Test 123 DTS 123
        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil=(TextView)findViewById(R.id.Label2);
    }
    //Buat Method TampilNama Sesuai Dengan property Onclick pada button
    public void TampilNama(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}
