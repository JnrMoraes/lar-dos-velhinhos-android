package com.junior.login;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void visita (View v) {
        startActivity(new Intent(this, Visita.class));

    }

    public void sobre (View v) {
        startActivity(new Intent(this, sobre.class));

    }

    public void estatistica (View v) {
        startActivity(new Intent(this, estatistica.class));

    }
    public void doacao (View v) {
        startActivity(new Intent(this, doar.class));

    }
}
