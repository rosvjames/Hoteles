// Subclase para habitaciones estándar
class HabitacionEstandar extends Habitacion {
    public HabitacionEstandar(int numero) {
        super(numero, 2, 50.0); // Capacidad: 2, Precio: 50
    }
}

// Subclase para habitaciones de lujo
class HabitacionDeluxe extends Habitacion {
    public HabitacionDeluxe(int numero) {
        super(numero, 4, 120.0); // Capacidad: 4, Precio: 120
    }
}
