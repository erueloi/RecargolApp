package cat.recargolats.recargolapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    // Temporizador para la pantalla de bienvenida
    private static int SPLASH_TIEMPO = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(mainIntent);
                //Destruimos esta activity para prevenit
                //que el usuario retorne aqui presionando el boton Atras.
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, SPLASH_TIEMPO);
    }
}
