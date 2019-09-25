package nitmeghalaya.cognitia2019.services

import FCM_NOTIFICATION_CHANNEL_ID
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import nitmeghalaya.cognitia2019.R
import nitmeghalaya.cognitia2019.screens.MainActivity
import org.koin.core.KoinComponent

class MyFirebaseMessagingService: FirebaseMessagingService(), KoinComponent {

    //Called only when the app is in foreground
    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        createNotificationChannel()
        Log.d("Received", remoteMessage.data.toString())

        val title = remoteMessage.notification?.title ?: ""
        val body = remoteMessage.notification?.body ?: ""

        val notificationIntent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0)

        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationBuilder = NotificationCompat.Builder(this, FCM_NOTIFICATION_CHANNEL_ID)
            .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.ic_notification))
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(title)
            .setContentText(body)
            .setAutoCancel(true)
            .setSound(defaultSoundUri)
            .setContentIntent(pendingIntent)
            .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(1, notificationBuilder.build())
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                FCM_NOTIFICATION_CHANNEL_ID,
                "Push notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(serviceChannel)
        }
    }
}
