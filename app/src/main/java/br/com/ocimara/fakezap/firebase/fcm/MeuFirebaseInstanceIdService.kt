package br.com.ocimara.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService
import android.content.ContentValues.TAG
import com.google.firebase.iid.FirebaseInstanceId
import com.orhanobut.hawk.Hawk


/**
 * Created by logonrm on 19/03/2018.
 * Service é o cara que roda em background
 */
class MeuFirebaseInstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        // Get updated InstanceID token.
      //  val refreshedToken = FirebaseInstanceId.getInstance().token
      //  Log.d(TAG, "Refreshed token: " + refreshedToken!!)

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
       // sendRegistrationToServer(refreshedToken)
        super.onTokenRefresh()
        Hawk.put("TOKENFIREBASE",FirebaseInstanceId.getInstance().token)
    }

    //hawk - liblioteca do gitHub
    //https://github.com/orhanobut/hawk




}
