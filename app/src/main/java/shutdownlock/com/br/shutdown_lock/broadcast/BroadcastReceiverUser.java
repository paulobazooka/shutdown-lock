package shutdownlock.com.br.shutdown_lock.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiverUser extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

            switch (intent.getAction().toString()){
                case "android.intent.action.SCREEN_OFF":
                    Log.i("ACTION:", "SCREEN_OFF");
                    break;

                case "android.intent.action.USER_PRESENT":
                    Log.i("ACTION:", "USER_PRESENT");
                    break;

                case "android.intent.action.CLOSE_SYSTEM_DIALOGS":
                    Log.i("ACTION:", "CLOSE_SYSTEM_DIALOGS");
                    break;
            }
    }
}
