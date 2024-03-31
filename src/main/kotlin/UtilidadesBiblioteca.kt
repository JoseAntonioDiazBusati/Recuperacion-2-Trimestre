package org.example

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object UtilidadesBiblioteca {
    private var contadorLibros = 0

    fun generarIdentificadorUnico(): String {
        contadorLibros++
        val fechaHoraActual = LocalDateTime.now()
        val formato = DateTimeFormatter.ofPattern("yyyyMMddHHmmss")
        val fechaHoraFormateada = fechaHoraActual.format(formato)
        return "LIB${fechaHoraFormateada}_$contadorLibros"
    }
}
