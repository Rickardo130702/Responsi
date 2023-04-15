package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    TextView tvNama;
    EditText etJumlah;
    Button btnSumbit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi variable
        tvNama = findViewById(R.id.tvNama);
        etJumlah = findViewById(R.id.etJumlah);
        btnSumbit = findViewById(R.id.btnSumbit)


        btnSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertdialogBuilder = new AlertDialog.Builder( MainActivity.this);

                //membuat judul alert dialog
                alertdialogBuilder.setTitle("Konfirmasi");

                //membuat pesan alert dialog
                alertdialogBuilder.setMessage("Apakah anda yakin akan menyimpan data")
                        .setIcon(R.drawable.ic_avatar)
                        .setCancelable(false)

                        .setPositiveButton( "ya", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String nama = tvNama.getText().toString();
                                String jumlah = etJumlah.getText().toString();

                                //Pengecekan jumlah harus diisi
                                if (jumlah.isEmpty()){
                                    Toast.makeText(MainActivity.this)
                                }else {
                                    //Opsi 1: Passing data via extras
                                    Bundle bundle = new Bundle();
                                    bundle.putString("KeynNama", nama);
                                    bundle.putString("KeyJumlah",jumlah);
                                    Intent intent = new Intent( MainActivity.this, DataActivity.class);
                                    Intent.putExtra(bundle);
                                    star
                                }
                            }
                        })

                )
            }
        });
    }
}