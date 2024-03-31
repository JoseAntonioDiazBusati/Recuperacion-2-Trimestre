package org.example

class Catalogo<T : ElementoBiblioteca> {
    private val gestorElementos: GestorElemento<T> = GestorElemento()

    fun agregarElemento(elemento: T) {
        gestorElementos.agregarElemento(elemento)
    }

    fun eliminarElementoPorId(id: String) {
        gestorElementos.eliminarElementoPorId(id)
    }

    fun obtenerElementos(): List<T> {
        return gestorElementos.obtenerElementos()
    }

    fun filtrarPorCriterio(criterio: (elemento: T) -> Boolean): List<T> {
        return gestorElementos.filtrarPorCriterio(criterio)
    }
}