package org.example

class ResgistroPrestamo {
    private val prestamosActuales = mutableListOf<Prestamo>()
    private val historialPrestamos = mutableListOf<Prestamo>()

    fun registrarPrestamo(prestamo: Prestamo) {
        prestamosActuales.add(prestamo)
        historialPrestamos.add(prestamo)
    }

    fun devolverLibro(libro: Libro, usuario: Usuario) {
        val prestamo = prestamosActuales.find { libro.getId() == libro.getId() && usuario == usuario }
        if (prestamo != null) {
            prestamosActuales.remove(prestamo)
        } else {
            println("El libro ${libro.getTitulo()} no está actualmente prestado a ${usuario.getNombre()}.")
        }
    }

    fun consultarHistorialPrestamosLibro(libro: Libro): List<Prestamo> {
        return historialPrestamos.filter { libro.getId() == libro.getId() }
    }

    fun consultarHistorialPrestamosUsuario(usuario: Usuario): List<Prestamo> {
        return historialPrestamos.filter { usuario == usuario }
    }

}