package com.example.aulamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.lifecycle.LiveData

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

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
                myApp(viewModel.soma)
            }
        }
    }

    @Composable
    fun myApp(somaData: LiveData<Int>) {
        val soma : Int? by somaData.observeAsState()
        Scaffold(
            topBar = {

            },
            bodyContent = {
                Column(
                        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(soma.toString())
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = {
                    viewModel.incremento(1)
                }){
                    Icon(Icons.Filled.Add)
                }
            },
            bottomBar = {}
        )
    }
}