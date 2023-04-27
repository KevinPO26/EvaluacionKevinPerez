package com.example.prueba.datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.prueba.entidades.Cliente

@Dao
interface DaoCliente {
    @Query("SELECT * FROM cliente")
    suspend fun obtenerCliente(): MutableList<Cliente>

    @Insert
    suspend fun agregarCliente(cliente: Cliente)

    @Query("UPDATE cliente SET nombre =:nombre, apellido =:apellido, nombreUsuario =:nombreUsuario, pwd =:pwd  WHERE id =:id")
    suspend fun actualizarCliente(id: Int, nombre: String, apellido:String, nombreUsuario: String, pwd: String)


    @Query("DELETE FROM cliente WHERE id=:id")
    suspend fun borrarCliente(id: Int)
}