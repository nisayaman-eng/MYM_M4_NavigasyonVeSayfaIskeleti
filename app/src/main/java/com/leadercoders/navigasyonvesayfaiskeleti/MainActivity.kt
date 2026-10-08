package com.leadercoders.navigasyonvesayfaiskeleti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.leadercoders.navigasyonvesayfaiskeleti.ders2.KahveSiparisi
import com.leadercoders.navigasyonvesayfaiskeleti.ui.theme.GR01_MYM_M4_NavigasyonVeSayfaIskeletiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GR01_MYM_M4_NavigasyonVeSayfaIskeletiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    //DERS _ 1
                    //D413_NavControllerVeNavHost(modifier = Modifier.padding(innerPadding))
                    //D415_TemelNavigasyonApp(modifier = Modifier.padding(innerPadding))
                    //HikayeUygulamasi(modifier = Modifier.padding(innerPadding))
                    //D422_SayfalarArasiVeriTasima(modifier = Modifier.padding(innerPadding))
                    //D424_VeriGondermeApp(modifier = Modifier.padding(innerPadding))
                    KahveSiparisi(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

