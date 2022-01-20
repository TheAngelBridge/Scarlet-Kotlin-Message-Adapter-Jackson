package com.theangelbridge.scarlet.messageadapter.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint

/**
 * Developed by
 *   @author AlenHeo
 *   @company TheAngelBridge
 *   @contact alenheo@theangelbridge.net
 *   @created 2022/01/21
 *   @copyright TheAngelBridge Inc.
 */


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}