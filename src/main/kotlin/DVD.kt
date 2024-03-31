package org.example

class DVD(
    id: String,
    titulo: String,
    val duracion: Int,
    val genero: String,
    estado: EstadoLibro) : ElementoBiblioteca(id, titulo, estado) {}