package com.cursoandroid.loginbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_usuario, editText_contraseña;
    Button button_loguear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_usuario = findViewById(R.id.editText_usuario);
        editText_contraseña = findViewById(R.id.editText_contraseña);

        button_loguear = findViewById(R.id.button_login);

        button_loguear.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(!editText_usuario.getText().toString().equals("") && !editText_contraseña.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), editText_usuario.getText().toString()+"\n"+editText_contraseña.getText().toString(),Toast.LENGTH_SHORT).show();
                }
                else {
                    if (editText_usuario.getText().toString().equals("")){
                        editText_usuario.setError("Required");
                    }
                    if(editText_contraseña.getText().toString().equals("")){
                        editText_contraseña.setError("Required");
                    }
                }
                return false;
            }
        });
    }
}
