package cl.jav.pokemonesmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.jav.pokemonesmvvm.databinding.ActivityMainBinding

/*
Requisitos
1.[x] traer pokedex desde algun proyecto.(1 min) copiar pegar
2.[x] POJOs (1 min) copiar pegar
3.[X] Recycleview
4.[X] Adapter
5.[X] Uso de ViewBinding(gradle)
6.[X] Layout (activity
7.[X] Activar permisos(internet).
8.[] Room (pojo, dao, dataBase).
9.[maneja datos] Repositorio
10.[X] ViewModel
11.[X] Fragmentos
 a. [X] list_fragment
 b. [X] detail_fragment
12.[] Glide


----Dependencias y plugin
[] Glide
[X] ViewModel
[X] ViewBinding
[] Room
[] kotlin-kapt
[] Livedata
*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_pokemon, ListFragment
                .newInstance("", "")).addToBackStack("Volver").commit()

    }
}