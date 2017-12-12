package mx.com.devare.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    IntentFilter mIntentFilter;
    MyBroadCastReceiver myBroadCastReceiver;
    Button btn_action_vibrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentesUI();
        inicializarSetOnclickListener();
        //inicializarBroadcast();
    }

    private void inicializarBroadcast() {
        myBroadCastReceiver=new MyBroadCastReceiver();
        mIntentFilter=new IntentFilter();
    }


    private void inicializarComponentesUI() {
        btn_action_vibrar=(Button) findViewById(R.id.btn_action_vibrar);
    }

    private void inicializarSetOnclickListener() {
        btn_action_vibrar.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //registerReceiver(myBroadCastReceiver,mIntentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // unregisterReceiver(myBroadCastReceiver);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_action_vibrar:
                generarVibracion();
                break;
        }
    }

    private void generarVibracion() {
        Intent i = new Intent();
        i.setAction("mx.com.devare.broadcastreceiver.intent.action.ACTION_VIBRAR");
        sendBroadcast(i);
    }
}
