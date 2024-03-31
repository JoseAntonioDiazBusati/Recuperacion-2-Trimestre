package org.example

class GestorElemento<T : ElementoBiblioteca> {
    private val elementos: MutableList<T> = mutableListOf()

    fun agregarElemento(elemento: T) {
        elementos.add(elemento)
    }

    fun eliminarElementoPorId(id: String) {
        elementos.removeIf { it.id == id }
    }

    fun obtenerElementos(): List<T> {
        return elementos.toList()
    }

    // Método para buscar elementos por diversos criterios
    fun filtrarPorCriterio(criterio: (elemento: T) -> Boolean): List<T> {
        return elementos.filter(criterio)
    }
}