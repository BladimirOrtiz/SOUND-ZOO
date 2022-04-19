package com.example.soundzoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.media.MediaPlayer
class Panel : AppCompatActivity() {
    private lateinit var s1: MediaPlayer
    private lateinit var s2: MediaPlayer
    private lateinit var s3: MediaPlayer
    private lateinit var s4: MediaPlayer
    private lateinit var s5: MediaPlayer
    private lateinit var s6: MediaPlayer
    private lateinit var s7: MediaPlayer
    private lateinit var s8: MediaPlayer
    private lateinit var s9: MediaPlayer
    private lateinit var sound: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel)
        val caballo = findViewById<ImageButton>(R.id.btncaballo)
        val elefante = findViewById<ImageButton>(R.id.btnelefante)
        val gallo = findViewById<ImageButton>(R.id.btngallo)
        val gato = findViewById<ImageButton>(R.id.btngato)
        val mono = findViewById<ImageButton>(R.id.btnmono)
        val perro = findViewById<ImageButton>(R.id.btnperro)
        val rana = findViewById<ImageButton>(R.id.btnrana)
        val vaca = findViewById<ImageButton>(R.id.btnvaca)
        val pato = findViewById<ImageButton>(R.id.btnpato)
        s1 = MediaPlayer.create(this, R.raw.caballo)
        s2 = MediaPlayer.create(this, R.raw.elefante)
        s3= MediaPlayer.create(this, R.raw.gallo)
        s4 = MediaPlayer.create(this, R.raw.gato)
        s5 = MediaPlayer.create(this, R.raw.mono)
        s6= MediaPlayer.create(this, R.raw.perro)
        s7 = MediaPlayer.create(this, R.raw.rana)
        s8 = MediaPlayer.create(this, R.raw.vaca)
        s9= MediaPlayer.create(this, R.raw.pato)
        sound = MediaPlayer()
    }

    fun caballo(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
          }
        sound = s1
        sound.start()
        }

  fun elefante(view: View) {
      if (sound.isPlaying) {
          sound.pause()
          sound.seekTo(0)
      }
      sound = s2
      sound.start()

    }

    fun gallo(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s3
        sound.start()
    }
    fun gato(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s4
        sound.start()
    }
    fun mono(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s5
        sound.start()
    }
    fun perro(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s6
        sound.start()
    }
    fun rana(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s7
        sound.start()
    }
    fun vaca(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s8
        sound.start()
    }
    fun pato(view: View) {
        if (sound.isPlaying) {
            sound.pause()
            sound.seekTo(0)
        }
        sound = s9
        sound.start()
    }
}