package com.shannon.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.shannon.myapplication.ui.theme.MyApplicationTheme

@Composable
fun LoginView(){
    Column {
        Text (
            text = "halo sharon"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginViewPreview() {
    MyApplicationTheme {
        LoginView()
    }
}
