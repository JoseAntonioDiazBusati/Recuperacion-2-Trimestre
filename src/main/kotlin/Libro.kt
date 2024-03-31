package org.example

class Libro(
    val id: String,
    val titulo: String,
    val autor: String,
    val anoPublicacion: Int,
    val tematica: String,
    var estado: EstadoLibro = EstadoLibro.DISPONIBLE) {
    init {
        require(id.isNotBlank()) { "El ID del libro no puede estar vacío." }
        require(titulo.isNotBlank()) { "El título del libro no puede estar vacío." }
        require(autor.isNotBlank()) { "El nombre del autor del libro no puede estar vacío." }
        require(anoPublicacion > 0) { "El año de publicación del libro debe ser un valor positivo." }
        require(tematica.isNotBlank()) { "La temática del libro no puede estar vacía." }
    }
    fun getId(): String {
        return id
    }

    fun getTitulo(): String {
        return titulo
    }

    fun getAutor(): String {
        return autor
    }

    fun getAnoPublicacion(): Int {
        return anoPublicacion
    }

    fun getTematica(): String {
        return tematica
    }
}