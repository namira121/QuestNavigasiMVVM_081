package com.example.praktikum7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum7.model.DataJK
import com.example.praktikum7.ui.view.FormMahasiswaView
import com.example.praktikum7.ui.viewmodel.MahasiswaViewModel

enum class Halaman {
    Formulir,
    Detail,
}

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    viewModel: MahasiswaViewModel = viewModel(),
    modifier: Modifier = Modifier
){
    Scaffold { isiPadding ->
        val uiState by viewModel.uiState.collectAsState()
        NavHost(
            modifier = modifier.padding(isiPadding),
            navController = navController, startDestination = Halaman.Formulir.name
        ) {
            composable(route = Halaman.Formulir.name){
                val konteks = LocalContext.current

            }
        }

    }
}

