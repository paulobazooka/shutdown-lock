package shutdownlock.com.br.shutdown_lock;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import shutdownlock.com.br.shutdown_lock.broadcast.BroadcastReceiverUser;


public class MainActivity extends AppCompatActivity {

    private BroadcastReceiverUser broadcastReceiverUser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an IntentFilter instance.
        IntentFilter intentFilter = new IntentFilter();

        // Add network connectivity change action.
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.USER_PRESENT");

        // Set broadcast receiver priority.
        intentFilter.setPriority(100);

        // Create a network change broadcast receiver.
        broadcastReceiverUser = new BroadcastReceiverUser();

        // Register the broadcast receiver with the intent filter object.
        registerReceiver(broadcastReceiverUser, intentFilter);

        Log.i("TAG", "onCreate: broadcastReceiverUser Registrada.");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Unregister broadcastReceiverUser when destroy.
        if(broadcastReceiverUser !=null){
            unregisterReceiver(broadcastReceiverUser);
            Log.i("TAG", "onDestroy: broadcastReceiverUser Desregistrada");
        }
    }
}