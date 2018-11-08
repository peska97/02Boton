package net.dam17iescierva.a02boton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG="02Boton";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b=findViewById(R.id.button);
        TextView t=findViewById(R.id.textView);

        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Log.d(TAG, msq: "entrando en OnCreate");
        TextView t=findViewById(R.id.textView);
        t.setText("!Pulsado!");
        //TextView texto = new TextView( context: this);
        //texto.setText("Hello Android");
        //setContentView(texto);
    }
}
