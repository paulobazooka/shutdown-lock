package shutdownlock.com.br.shutdown_lock.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import shutdownlock.com.br.shutdown_lock.broadcast.BroadcastReceiverUsuarioPresente;

public class ServicoUsuarioPresente extends Service {

    private long tempo = 0;
    private int cont = 0;

    @Override
    public IBinder onBind(Intent intent) {

        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

       Thread cThread = new Thread(new Runnable() {
           @Override
           public void run() {
               while(cont < 100) {

                   if ((System.currentTimeMillis() - tempo) > 1000) {
                       tempo = System.currentTimeMillis();
                       Log.i("CONT:", Integer.toString(cont));
                       cont++;
                   }
               }
               cont = 0;
           }
       });

       cThread.start();
       Log.i("Serviço:", "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Serviço", "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
       // Log.i("Serviço", "onDestroy");
    }
}
