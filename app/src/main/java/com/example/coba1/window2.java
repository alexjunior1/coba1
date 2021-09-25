package com.example.coba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class window2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window2);
        final EditText nama =
                (EditText)findViewById(R.id.inp_nama);
        final EditText nim =
                (EditText)findViewById(R.id.inp_nim);
        final EditText jurusan =
                (EditText)findViewById(R.id.inp_jurusan);
        final EditText angkatan =
                (EditText)findViewById(R.id.inp_angkatan);
        final TextView nama_t =
                (TextView)findViewById(R.id.out_nama);
        final TextView nim_t =
                (TextView)findViewById(R.id.out_nim);
        final TextView jurusan_t =
                (TextView)findViewById(R.id.out_jurusan);
        final TextView angkatan_t =
                (TextView)findViewById(R.id.out_angkatan);
        final Button tampil =
                (Button)findViewById(R.id.button2);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String angkatan1 =
                        angkatan.getText().toString();
                nama_t.setText(nama1);
                nim_t.setText(nim1);
                jurusan_t.setText(jurusan1);
                angkatan_t.setText(angkatan1);
            }
        });
    }

}