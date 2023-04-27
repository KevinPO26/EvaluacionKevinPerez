package com.example.miproyectofinal.datos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.prueba.datos.DaoAdministrador
import com.example.prueba.datos.DaoCliente
import com.example.prueba.entidades.Administrador
import com.example.prueba.entidades.Cliente

@Database(
    entities = [Cliente::class, Administrador::class],
    version = 1
)
abstract class DataBase: RoomDatabase(){
    abstract fun daoCliente(): DaoCliente
    abstract fun daoAdmin(): DaoAdministrador
}