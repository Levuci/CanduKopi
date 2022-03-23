package com.example.candukopi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rb_luwak, rb_cream, rb_miegor;
    Button btn_bayar;
    TextView jumlahBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo);
        rb_luwak = (RadioButton) findViewById(R.id.rb_luwak);
        rb_cream = (RadioButton) findViewById(R.id.rb_cream);
        rb_miegor= (RadioButton) findViewById(R.id.rb_miegor);
        btn_bayar = (Button) findViewById(R.id.btn_bayar);
        jumlahBayar = (TextView) findViewById(R.id.jumlahBayar);
    }

    public void clickBayar(View view) {
        int harga = 0;
        if (rb_luwak.isChecked()) {
            harga += 30000;
        }
        if (rb_cream.isChecked()) {
            harga += 1000;
        }
        if (rb_miegor.isChecked()) {
            harga += 10000;
        }
        int total = harga;
        String textHarga = "Rp. " + total;
        jumlahBayar.setText(textHarga);
    }

}