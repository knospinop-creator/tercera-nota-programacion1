// Ejercicio 4: Arquitectura multicapa en Java

import java.util.HashMap;
import java.util.Map;

class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

// Capa de acceso a datos
class ProductoRepository {
    private Map<Integer, Producto> baseDeDatos = new HashMap<>();
    private int currentId = 1;

    public void guardar(Producto producto) {
        producto.setId(currentId++);
        baseDeDatos.put(producto.getId(), producto);
    }

    public Producto buscar(int id) {
        return baseDeDatos.get(id);
    }
}

// Capa de lógica de negocio
class ProductoService {
    private ProductoRepository repository = new ProductoRepository();

    public void guardarProducto(Producto producto) {
        if (producto.getPrecio() > 0) {
            repository.guardar(producto);
        } else {
            System.out.println("El precio debe ser mayor a 0");
        }
    }

    public Producto buscarProducto(int id) {
        return repository.buscar(id);
    }
}

// Capa de presentación
class ProductoController {
    private ProductoService service = new ProductoService();

    public void crearProducto(String nombre, double precio) {
        service.guardarProducto(new Producto(nombre, precio));
    }

    public void mostrarProducto(int id) {
        Producto p = service.buscarProducto(id);
        if (p != null) {
            System.out.println("Producto: " + p.getNombre() + " - $" + p.getPrecio());
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ProductoController controller = new ProductoController();
        controller.crearProducto("Cuaderno", 3.5);
        controller.crearProducto("Lápiz", 0.5);
        controller.mostrarProducto(1);
        controller.mostrarProducto(2);
        controller.mostrarProducto(3);
    }
}
