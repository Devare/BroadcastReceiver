package mx.com.devare.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

import java.util.Objects;

public class MyBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED")){
            Toast.makeText(context, "Se Conecto el cable de energia", Toast.LENGTH_SHORT).show();
        }

        if (Objects.equals(intent.getAction(), "android.net.wifi.WIFI_STATE_CHANGED")){
            Toast.makeText(context, "Has cambiado el estado del wifi", Toast.LENGTH_SHORT).show();
        }

        if (Objects.equals(intent.getAction(), "mx.com.devare.broadcastreceiver.intent.action.ACTION_VIBRAR")){
            Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            assert v != null;
            v.vibrate(400);
            Toast.makeText(context, "Esta vibrando", Toast.LENGTH_SHORT).show();
        }

    }
}
