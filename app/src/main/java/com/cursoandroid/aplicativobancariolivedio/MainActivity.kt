package com.cursoandroid.aplicativobancariolivedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_menu)
        iniciaViews()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this,2)
    }

    private fun setItensLista() {
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                      "Cartões"
                ),
                MenuItemModel(
                      "Meus Comprovantes"
                ),
                MenuItemModel(
                      "Investimentos"
                ),
                MenuItemModel(
                      "Portabilidade de Salário"
                ),
                MenuItemModel(
                      "Cartões"
                ),
                MenuItemModel(
                      "Meus Comprovantes"
                ),
                MenuItemModel(
                      "Investimentos"
                ),
                MenuItemModel(
                      "Portabilidade de Salário"
                ),
            )
        )
    }
}