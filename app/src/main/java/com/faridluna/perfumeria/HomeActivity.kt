package com.faridluna.perfumeria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Business
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.faridluna.perfumeria.ui.theme.AppTheme
import com.faridluna.perfumeria.ui.theme.PerfumeriaTheme
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

data class Perfumes(
    val id: Int = 0,
    val nombre: String = "",
    val marca: String = "",
    val descripcion: String = "",
    val calificacion: String = "",
    val numero_resenas: String = "",
)

interface ApiService {
    @GET ("perfumes/perfumes.php")
    suspend fun getPerfumes (): List<Perfumes>
}

object RetrofitClient {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://farid.alwaysdata.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PerfumeriaTheme {
        HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(){
    var Home by remember { mutableStateOf<List<Perfumes>>(emptyList()) }
    var cargando by remember { mutableStateOf(true) }
    var error by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        try {
            Home = RetrofitClient.api.getPerfumes()
        } catch (e: Exception) {
            error = true
            e.printStackTrace()
        }
        finally {
            cargando = false
        }
    }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
        when {
            cargando -> CircularProgressIndicator(
                Modifier.align(Alignment.Center),
                color = MaterialTheme.colorScheme.tertiary
            )
            error -> Column(Modifier.align(Alignment.Center).padding(AppTheme.spacing.large),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(Icons.Outlined.Business,
                    contentDescription = null,
                    modifier =Modifier.size(AppTheme.sizes.iconContainerMedium),
                    tint = MaterialTheme.colorScheme.tertiary)
                Spacer(Modifier.height(AppTheme.spacing.large))
                Text("No se pudieron cargar los datos", style = MaterialTheme.typography.titleMedium)
            } else -> LazyColumn() {
                items(Home, key = {it.id }) { perfumes ->
                PerfumesCard(perfumes)
                }
        }
        }
        }

    }
}

@Composable
fun PerfumesCard(perfumes: Perfumes) {
    ElevatedCard(Modifier.padding(AppTheme.spacing.large)) {
        Text(perfumes.nombre)
        Text(perfumes.marca)
        Text(perfumes.descripcion)
    }
}

