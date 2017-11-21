package com.walkatheri.appinput;

import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView result;
    EditText key , text;
    Button encryption ,decryp;
    ClipboardManager caesarCipher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caesarCipher=(ClipboardManager) getSystemService(this.CLIPBOARD_SERVICE);
        result=(TextView) findViewById(R.id.result);
        key=(EditText)findViewById(R.id.key);
        text=(EditText)findViewById(R.id.text);
        encryption=(Button)findViewById(R.id.encryption);
        decryp=(Button)findViewById(R.id.decryption);

        decryp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,text.getText().toString(),Toast.LENGTH_SHORT);
            result.setText(CaesarCipher.decrypt(text.getText().toString(),Integer.parseInt(key.getText().toString())));



        }
    });

        encryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,text.getText().toString(),Toast.LENGTH_SHORT);
                result.setText(CaesarCipher.encrypt(text.getText().toString(),Integer.parseInt(key.getText().toString())));



            }
        });
    }
}

