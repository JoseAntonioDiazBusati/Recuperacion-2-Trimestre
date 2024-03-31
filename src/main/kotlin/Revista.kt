package org.example

class Revista(
    id: String,
    titulo: String,
    val edicion: Int,
    val tematica: String,
    estado: EstadoLibro) : ElementoBiblioteca(id, titulo, estado){}