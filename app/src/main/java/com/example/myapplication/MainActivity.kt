package com.example.volumecontrol

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var audioManager: AudioManager
    private val handler = Handler(Looper.getMainLooper()) // Handler to schedule tasks
    private val volumeUpInterval: Long = 7200000 // 2 hour interval (7200000 milliseconds)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize AudioManager
        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        // Start repeating volume up every 1 second
        handler.post(volumeUpRunnable)
    }

    // Runnable that will be executed every 1 second to press volume up
    private val volumeUpRunnable = object : Runnable {
        override fun run() {
            // Simulate volume up press
            audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI)

            // Re-schedule this runnable to run again after 1 second
            handler.postDelayed(this, volumeUpInterval)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        // Remove callbacks when the activity is destroyed to prevent memory leaks
        handler.removeCallbacks(volumeUpRunnable)
    }
}
