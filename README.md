# Llanquihue Tour App - Sistema de Gestión

## Descripción
Sistema de gestión de tours para la agencia "Llanquihue Tour" de la Region de Los Lagos, Chile. Continuación de las actividades del Curso "Desarrollo Orientado a Objetos".
La aplicación incorpora nuevas entidades relevantes para la operación de la agencia (clientes, guías turísticos, colaboradores externos y vehiculos), aplicando conceptos de herencia, encapsulamiento y polimorfismo; además integra interfaces definida en el contrato comun mostrarResumen(), implementado por todas las clases gestionables del sistema.

## Estructura del Proyecto
```
src/
|__ ui/
|   |__ Main.java
|   |__ test.java
|__ model/
|   |__ ServicioTuristico.java
|   |__ RutaGastronomica.java
|   |__ PaseoLacustre.java
|   |__ ExcursionCultural.java
|   |__ Tour.java
|   |__ Direccion.java
|   |__ Persona.java
|   |__ Cliente.java
|   |__ GuiaTuristico.java
|   |__ ColaboradorExterno.java
|   |__ Vehiculo.java
|   |__ Registrable.java
|__ service/
|   |__ ServicioTour.java
|__ data/
|   |__ GestorDatos.java
|   |__ GestorServicios.java
|   |__ GestorEntidades.java
|__ resources/
|   |__ tours.txt
```

## Instrucciones para compilar y ejecutar

1. Clonar o descargar el repositorio desde GitHub
2. Abrir el proyecto LLanquihueTourApp en el IDE (NetBeans)
3. Verificar que la clase principal del proyecto sea Main
4. Ejecutar el archivo Main.java con el botón "Run" o "Shift + F6"

## Autor del Proyecto

**Nombre completo** | Eduardo Soto Estrada |
**Carrera** | Desarrollo de Aplicaciones |
**Sede** | Online |
**Fecha de entrega** | 13/07/2026 |
