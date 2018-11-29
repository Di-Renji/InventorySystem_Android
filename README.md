**Android Inventory System**
# Integrantes
* Asmat Sanchez, Andree.
* Lavado Aredo, Joel.
* Ñique Castro, Marco.

# Prototipos
![](https://i.imgur.com/V1J6yuE.png)
![](https://i.imgur.com/EMp5czc.png)
![](https://i.imgur.com/Rm1E0Pt.png)
![](https://i.imgur.com/CnXoPI2.png)
![](https://i.imgur.com/u3J6B8S.png)
![](https://i.imgur.com/Iv9lziz.png)
![](https://i.imgur.com/rL1aAth.png)
![](https://i.imgur.com/HytbAsr.png)
![](https://i.imgur.com/WhIglp6.png)
![](https://i.imgur.com/s1SiYUX.png)
![](https://i.imgur.com/LEr82rD.png)
![](https://i.imgur.com/xg7If7Y.png)
![](https://i.imgur.com/4klXL0N.png)
![](https://i.imgur.com/GcQx62n.png)
![](https://i.imgur.com/x6MUNjr.png)



# Historias de Usuario
NUMERO: 1	TITULO: Iniciar Sesión
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Medio	PUNTOS ESTIMADOS:  2
RIESGO: Bajo	PUNTOS REALES: 2
DESCRIPCION: 
El usuario llena los campos para obtener el acceso (nombre de usuario y contraseña) mediante cajas de texto, posteriormente dará click en el botón “Iniciar Sesión”. Si no recuerda su contraseña podrá seleccionar la opción de “¿Olvidaste tu contraseña?” en la parte inferior del único botón de la pantalla. Hacer los pasos correctos lo llevara a la pantalla de menú donde están las acciones principales que realizar el aplicativo.
OBSERVACIONES: 
Al tercer inicio de sesión erróneo la aplicación se cerrará automáticamente.

NUMERO: 2	TITULO: Ver Inventario
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Medio	PUNTOS ESTIMADOS:  3
RIESGO: Bajo	PUNTOS REALES: 3
DESCRIPCION: 
El usuario en el Menú Principal seleccionará el botón “Inventario”, donde le llevara a una ventana donde aparecen todos los registros de los productos y sus características en un Datagridview, además podrá realizar una búsqueda por su nombre de producto y podrá acceder al CRUD del producto.
OBSERVACIONES: 
Las columnas del Datagridview serán: código, producto, folio, precio, Com/Entradas, Ven/Salidas, existencias, stock, mensaje.

NUMERO: 3	TITULO: CRUD de producto
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 4
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 6
RIESGO: Alto	PUNTOS REALES:  6
DESCRIPCION: 
Se visualizará en la pantalla los campos de texto correspondientes al producto (código, producto, categoría, unidad, precio, folio). 
-	Para agregar un nuevo producto basta con llenar los campos y seleccionar el botón “Guardar”, 
-	Para modificar se llenará el campo del nombre del producto y pulsara el botón de la lupa situada a un costado de este campo para su búsqueda, si la encuentra los demás datos del producto se llenarán automáticamente en el resto de campos de texto para su edición, y luego pulsar el botón “Modificar”.
-	Para eliminar se realiza el mismo proceso que modificar, con la excepción de que después de encontrar el producto y llenado en los campos se pulsara el botón “Eliminar”.
Existirá un botón de “Cancelar” para cancelar la operación y redirigirse a la pantalla anterior de Inventario
OBSERVACIONES: 	

NUMERO: 4	TITULO: Ver Proveedor
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Medio	PUNTOS ESTIMADOS:  3
RIESGO: Bajo	PUNTOS REALES: 3
DESCRIPCION: 
El usuario en el Menú Principal seleccionará el botón “Proveedores”, donde le llevara a una ventana donde aparecen todos los registros de los proveedores y sus características en un Datagridview, además podrá realizar una búsqueda por su nombre y podrá acceder al CRUD del proveedor.
OBSERVACIONES: 
Las columnas del Datagridview serán: código, proveedor, dirección, teléfono, email, ruc, fecha

NUMERO: 5	TITULO: CRUD de Proveedor
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 4
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES: 7
DESCRIPCION: 
Se visualizará en la pantalla los campos de texto correspondientes al proveedor (código, proveedor, dirección, teléfono, email, ruc, fecha). 
-	Para agregar un nuevo proveedor basta con llenar los campos y seleccionar el botón “Guardar”, 
-	Para modificar se llenará el campo del nombre del proveedor y pulsara el botón de la lupa situada a un costado de este campo para su búsqueda, si la encuentra los demás datos del proveedor se llenarán automáticamente en el resto de campos de texto para su edición, y luego pulsar el botón “Modificar”.
-	Para eliminar se realiza el mismo proceso que modificar, con la excepción de que después de encontrar el proveedor y llenado en los campos se pulsara el botón “Eliminar”.
Existirá un botón de “Cancelar” para cancelar la operación y redirigirse a la pantalla anterior de Proveedor
OBSERVACIONES: 	

NUMERO: 6	TITULO: Ver Cliente
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Medio	PUNTOS ESTIMADOS:  3
RIESGO: Bajo	PUNTOS REALES: 3
DESCRIPCION: 
El usuario en el Menú Principal seleccionará el botón “Clientes”, donde le llevará a una ventana donde aparecen todos los registros de los clientes y sus características en un Datagridview, además podrá realizar una búsqueda por su nombre y podrá acceder al CRUD del cliente.
OBSERVACIONES: 
Las columnas del Datagridview serán: código, nombre, dirección, teléfono, email, dni, fecha

NUMERO: 7	TITULO: CRUD de Cliente
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 4
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES:  7
DESCRIPCION: 
Se visualizará en la pantalla los campos de texto correspondientes al cliente (código, nombre, dirección, teléfono, email, dni, fecha). 
-	Para agregar un nuevo cliente basta con llenar los campos y seleccionar el botón “Guardar”, 
-	Para modificar se llenará el campo del nombre del cliente y pulsara el botón de la lupa situada a un costado de este campo para su búsqueda, si la encuentra los demás datos del cliente se llenarán automáticamente en el resto de campos de texto para su edición, y luego pulsar el botón “Modificar”.
-	Para eliminar se realiza el mismo proceso que modificar, con la excepción de que después de encontrar el cliente y llenado en los campos se pulsara el botón “Eliminar”.
Existirá un botón de “Cancelar” para cancelar la operación y redirigirse a la pantalla anterior de Clientes
OBSERVACIONES: 	

NUMERO: 8	TITULO: Asignar Proveedor a Entrada
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES: 7
DESCRIPCION: 
Se mostrará en ventana los campos del proveedor al que se le asignara la entrada (código, proveedor, dirección, teléfono, email, ruc, fecha), para su búsqueda se realizara por nombre de proveedor pulsando el botón de la lupa ubicada a lado del campo de nombre; si el proveedor es encontrado los demás datos serán llenados en las demás cajas de texto. Existe el botón “Siguiente” para poder realizar una entrada de productos y un botón “Cancelar” que hace retornar al menú principal.
OBSERVACIONES: 	

NUMERO: 9	TITULO: Asignar Cliente a Salida
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 2
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES: 7
DESCRIPCION: 
Se mostrará en ventana los campos del cliente al que se le asignará la salida (código, nombre, dirección, teléfono, email, dni, fecha), para su búsqueda se realizará por nombre de cliente pulsando el botón de la lupa ubicada a lado del campo de nombre; si el cliente es encontrado los demás datos serán llenados en las demás cajas de texto. Existe el botón “Siguiente” para poder realizar una Salida de productos y un botón “Cancelar” que hace retornar al menú principal.
OBSERVACIONES: 	

NUMERO: 10	TITULO: Generar Entradas
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 3
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES: 7
DESCRIPCION: 
La ventana se muestra después de asignar un proveedor. Se muestran campos de texto del producto, donde se buscará el producto y automáticamente llenará el resto de campos, sin contar los campos de Cantidad, que al ser ingresado calculará el importe. Después de esto se pulsa el botón “Agregar” para añadir el producto a la Entrada y se limpiaran los campos para realizar la búsqueda de otro producto, también se visualizará el botón de “Cancelar” para abortar la operación y “Finalizar” para dar por terminado el proceso de Generar Entradas.
OBSERVACIONES: 	
Existe un campo de texto Total, donde se irán sumando los importes de los productos agregados.

NUMERO: 11	TITULO: Generar Salidas
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 3
PRIORIDAD: Alto	PUNTOS ESTIMADOS: 7
RIESGO: Alto	PUNTOS REALES: 7
DESCRIPCION: 
La ventana se muestra después de asignar un cliente. Se muestran campos de texto del cliente, donde se buscará el y automáticamente llenará el resto de campos, sin contar los campos de Cantidad, que al ser ingresado calculará el importe. Después de esto se pulsa el botón “Agregar” para añadir el producto a la Salida y se limpiaran los campos para realizar la búsqueda de otro producto, también se visualizará el botón de “Cancelar” para abortar la operación y “Finalizar” para dar por terminado el proceso de Generar Salidas.
OBSERVACIONES:
Existe un campo de texto Total, donde se irán sumando los importes de los productos agregados	

NUMERO: 12	TITULO: Reportar Acumulados
USUARIO: usuario
MODIFICACION DE HISTORIA N.º: 1	ITERACION ASIGNADA: 3
PRIORIDAD: Medio	PUNTOS ESTIMADOS: 3
RIESGO: Bajo	PUNTOS REALES: 3
DESCRIPCION: 
La ventana aparece después de pulsar el botón “Acumulados” del menú principal. Aquí se mantiene el detalle de los productos con su tipo de movimiento realizado (entrada o salida). Mediante el botón “Gmail” o “Outlook”, se enviarán estos datos por PDF a un correo.
OBSERVACIONES:


# Diseño de base de dato estructurada
![](https://i.imgur.com/y2JHptX.jpg)

# Diseño de base de datos firebase
![](https://i.imgur.com/o0Lt1pW.png)

![](https://i.imgur.com/XkEBf69.png)

![](https://i.imgur.com/xF12DVB.png)

![](https://i.imgur.com/Y2yHJA3.png)

![](https://i.imgur.com/bbRG9iY.png)

![](https://i.imgur.com/CD2a9hW.png)

![](https://i.imgur.com/6mzbFpu.png)

![](https://i.imgur.com/qQdO4i4.png)

# Problemas encontrados en el desarrollo
1. Compatibilidad librerias de Firestore, ya que se encuentra en beta.
2. Problemas de runtime con graddle, no lei correctamente el archivo settings.graddle, luego de haberlo exportado.
3. Paquetes removidos o rotos de una migracion de google services version a otra.
4. 
# Screenshoots
![](https://i.imgur.com/aZ3dvrd.png)
![](https://imgur.com/a/Vf4TE5b)

# Cuadro Resumen


| Historia de Usuario | Puntos | Terminada |
| -------- | -------- | -------- |
| Iniciar Sesión     | 8     | Si     |
| Ver Inventario     | 8     | Si     |
| CRUD de producto     | 8     | Si     |
| Ver Proveedor     | 8     | Si     |
| CRUD de Proveedor     | 8     | Si     |
| Ver Cliente     | 8     | Si     |
| CRUD de Cliente     | 8     | Si     |
| Asignar Proveedor a Entrada     | 7     | 25%     |
| Asignar Cliente a Salida     | 7     | 25%     |
| Generar Entradas     | 14     | 25%     |
| Generar Salidas     |14     | 25%     |
| Reportar Acumulados     |2     | No     |
