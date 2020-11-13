package com.raywenderlich.anotherfreakinmusicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    var mediaPlayer: MediaPlayer? = null

    private lateinit var playButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.playButton)
        playButton.setOnClickListener {
            mediaPlayer = MediaPlayer.create(this, R.raw.cruelsummer)
            mediaPlayer!!.start()


        }

    }

//    override fun onStop(savedInstanceState: Bundle?) {
//        super.onStop(stopButton)
//        ContentView(R.layout.activity_main)
//
//        stopButton = findViewById(R.id.stopButton)
//        stopButton.setOnClickListener {
//            mediaPlayer = MediaPlayer.create(this, R.raw.cruelsummer)
//            mediaPlayer!!.stop()
//        }
//    }
}