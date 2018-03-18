package shutdownlock.com.br.shutdown_lock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shutdownlock.com.br.shutdown_lock.broadcast.BroadcastReceiverUsuarioPresente;


public class MainActivity extends AppCompatActivity {

   // private BroadcastReceiverUsuarioPresente broadcastReceiverUsuarioPresente = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        // Create an IntentFilter instance.
        IntentFilter intentFilter = new IntentFilter();

        // Add network connectivity change action.
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_UNLOCKED");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");

        // Set broadcast receiver priority.
        intentFilter.setPriority(100);

        // Create a network change broadcast receiver.
        broadcastReceiverUsuarioPresente = new BroadcastReceiverUsuarioPresente();

        // Register the broadcast receiver with the intent filter object.
        registerReceiver(broadcastReceiverUsuarioPresente, intentFilter);

        Log.i("TAG", "onCreate: broadcastReceiverUsuarioPresente Registrada.");
*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
/*
        // Unregister broadcastReceiverUsuarioPresente when destroy.
        if(broadcastReceiverUsuarioPresente!=null){
            unregisterReceiver(broadcastReceiverUsuarioPresente);
            Log.i("TAG", "onDestroy: broadcastReceiverUsuarioPresente Desregistrada");
        }*/
    }
}