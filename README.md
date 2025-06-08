# Gestión de Ventas en un Kiosco

### Crear una clase **ProductoVendido** con los siguientes atributos:
- String **nombre**
- double **precioUnitario**
- int **cantidadVendida**

---
1. Leer el archivo **ventas.txt**. Cada línea representa una venta de un producto.
Cada vez que se lea una línea:
    - Si el producto ya fue vendido antes, se debe sumar la cantidad a la ya existente.
    - Si es la primera vez, crear un nuevo objeto ProductoVendido y agregarlo a una lista.

2. Una vez cargados todos los datos, mostrar:
    - Todos los productos vendidos con su cantidad total.
    - Cuánto dinero se recaudó en total.
    - Cuál fue el producto más vendido en unidades.
    - Mostrar el promedio de unidades vendidas por producto.

3. opcional:
    - Top 3 productos más vendidos
    - Resumen por rango de precio
    - Permitir al usuario ingresar un rango de precios, y mostrar:
        - Los productos cuyo precio unitario esté dentro del rango.
        - Cuántas veces se vendieron.
        - Cuánto generaron en total.
---
archivo ventas.txt de ejemplo;
~~~
Coca Cola,1200,3
Galletitas,800,5
Agua,600,2
Coca Cola,1200,1
Galletitas,800,4
~~~
