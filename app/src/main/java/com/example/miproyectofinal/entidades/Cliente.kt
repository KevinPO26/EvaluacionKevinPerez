package com.example.prueba.entidades

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cliente")
data class Cliente (
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "apellido") var apellido: String,
    @ColumnInfo(name = "nombreUsuario") var nombreUsuario: String,
    @ColumnInfo(name = "pwd") var pwd: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int= 0
)