package com.example.prueba.datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.prueba.entidades.Administrador

@Dao
interface DaoAdministrador {
    @Query("SELECT * FROM administrador")
    suspend fun obtenerAdmin(): MutableList<Administrador>

    @Insert
    suspend fun agregarAdmin(administrador: Administrador)

    @Query("UPDATE administrador SET nombre =:nombre, apellido =:apellido, nombreUsuario =:nombreUsuario, pwd =:pwd  WHERE id =:id")
    suspend fun actualizarAdmin(id: Int, nombre: String, apellido:String, nombreUsuario: String, pwd: String)


    @Query("DELETE FROM administrador WHERE id=:id")
    suspend fun borrarAdmin(id: Int)
}