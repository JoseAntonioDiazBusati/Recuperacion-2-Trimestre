package org.example

class LibroElectronico(
    id: String,
    titulo: String,
    val formatoDigital: String,
    val tamañoArchivo: Long,
    estado: EstadoLibro) : ElementoBiblioteca(id, titulo, EstadoLibro.DISPONIBLE){}