package com.example.TheLookSalon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button femaleHaircutService = (Button) findViewById(R.id.femalehaircut_btn);
        Button maleHaircutService = (Button) findViewById(R.id.malehaircut_btn);
        Button hairdressing = (Button) findViewById(R.id.hairstyle_btn);
        Button haircolouring = (Button) findViewById(R.id.hairdye_btn);
        Button makeup = (Button) findViewById(R.id.makeup_btn);
        Button eyebrows = (Button) findViewById(R.id.brows_btn);
        Button eyelashes = (Button) findViewById(R.id.lash_btn);
        Button spa = (Button) findViewById(R.id.spa_btn);
        Button manicure = (Button) findViewById(R.id.manicure_btn);
        Button pedicure = (Button) findViewById(R.id.pedicure_btn);
        LinearLayout appointments = (LinearLayout) findViewById(R.id.history_btn);

        femaleHaircutService.setOnClickListener(mainListener);
        maleHaircutService.setOnClickListener(mainListener);
        hairdressing.setOnClickListener(mainListener);
        haircolouring.setOnClickListener(mainListener);
        makeup.setOnClickListener(mainListener);
        eyebrows.setOnClickListener(mainListener);
        eyelashes.setOnClickListener(mainListener);
        spa.setOnClickListener(mainListener);
        manicure.setOnClickListener(mainListener);
        pedicure.setOnClickListener(mainListener);
        appointments.setOnClickListener(mainListener);
    }

    private void openFemaleHaircutActivity() {
        Intent intent = new Intent(this, FemaleHaircutActivity.class);
        startActivity(intent);
    }

    private void openMaleHaircutActivity() {
        Intent intent = new Intent(this, MaleHaircutActivity.class);
        startActivity(intent);
    }

    private void openHairdressingtActivity() {
        Intent intent = new Intent(this, HairdressingActivity.class);
        startActivity(intent);
    }

    private void openHairColouringActivity() {
        Intent intent = new Intent(this, HairColouringActivity.class);
        startActivity(intent);
    }

    private void openMakeupActivity() {
        Intent intent = new Intent(this, MakeupActivity.class);
        startActivity(intent);
    }

    private void openMicrobladingActivity() {
        Intent intent = new Intent(this, MicrobladingActivity.class);
        startActivity(intent);
    }

    private void openLashExtensionsActivity() {
        Intent intent = new Intent(this, LashExtensionsActivity.class);
        startActivity(intent);
    }

    private void openSpaActivity() {
        Intent intent = new Intent(this, SpaActivity.class);
        startActivity(intent);
    }

    private void openManicureActivity() {
        Intent intent = new Intent(this, ManicureActivity.class);
        startActivity(intent);
    }

    private void openPedicureActivity() {
        Intent intent = new Intent(this, PedicureActivity.class);
        startActivity(intent);
    }

    private void openAppointmentActivity() {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }


    private View.OnClickListener mainListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.femalehaircut_btn:
                    openFemaleHaircutActivity();
                    break;
                case R.id.malehaircut_btn:
                    openMaleHaircutActivity();
                    break;
                case R.id.hairstyle_btn:
                    openHairdressingtActivity();
                    break;
                case R.id.hairdye_btn:
                    openHairColouringActivity();
                    break;
                case R.id.makeup_btn:
                    openMakeupActivity();
                    break;
                case R.id.brows_btn:
                    openMicrobladingActivity();
                    break;
                case R.id.lash_btn:
                    openLashExtensionsActivity();
                    break;
                case R.id.spa_btn:
                    openSpaActivity();
                    break;
                case R.id.manicure_btn:
                    openManicureActivity();
                    break;
                case R.id.pedicure_btn:
                    openPedicureActivity();
                    break;
                case R.id.history_btn:
                    openAppointmentActivity();
                    break;
                default:
                    break;
            }
        }
    };
}
