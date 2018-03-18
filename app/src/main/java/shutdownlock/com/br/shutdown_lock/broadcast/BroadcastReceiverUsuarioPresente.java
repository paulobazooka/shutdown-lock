package shutdownlock.com.br.shutdown_lock.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import shutdownlock.com.br.shutdown_lock.services.ServicoUsuarioPresente;

public class BroadcastReceiverUsuarioPresente extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {

            if(intent.getAction() != null){
                Log.i("onReceive:", intent.getAction().toString());
                Intent i = new Intent(context, ServicoUsuarioPresente.class);
                context.startService(i);
            }

        }
}

