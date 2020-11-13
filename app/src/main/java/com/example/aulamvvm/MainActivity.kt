package com.example.aulamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.Toolbar
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

//        viewModel.soma.observe(this, Observer {
//             tvRes.text = it.toString()
//        })
//
//        fbIncrement.setOnClickListener {
//            viewModel.incremento(1)
//        }
//
//        tb_home.setNavigationOnClickListener {
//            viewModel.refresh()
//        }

        setContent {
            MaterialTheme {
                myApp()
            }
        }
    }

    @Composable
    fun myApp() {
        Scaffold(
            topBar = {

            },
            bodyContent = {},
            floatingActionButton = {
                FloatingActionButton(onClick = {}){
                    Icon(Icons.Filled.Add)
                }
            },
            bottomBar = {}
        )
    }
}