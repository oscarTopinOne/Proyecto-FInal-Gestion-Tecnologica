## Proyecto Final Gestión Tecnologica
### Integrantes:

- Jaime Santana - 20132020212

- Oscar Javier Hernandez Cepeda - 20152020019

- Juan Sebastian Sanchez Mancilla - 20152020020 

- Oscar Ivan Torres Pinto - 20152020044

- Yohan Arles Almonacid Ortiz - 20152020916 

- Brian Alfonso Rodriguez - 20151020600


### Grafana
![grafana-logo](https://user-images.githubusercontent.com/30842893/61815686-6d6bc580-ae10-11e9-8ce6-f5fde3f872dd.jpg)

Grafana es una herramienta hecha en software libre, específicamente con licencia Apache 2.0, ideada por Torkel Ödegaard (quien todavía está al frente de su desarrollo y mantenimiento) y creada en enero de 2014. Este desarrollador sueco comenzó su carrera en el ambiente .NET y en 2012 (hasta la fecha) sigue ofreciendo servicios de desarrollo y consultoría en esta popular plataforma privativa, de forma paralela con el desarrollo de software libre.

Grafana está escrita en Lenguaje Go (creado por Google) y Node.js LTS y con una fuerte Interfaz de Programación de Aplicaciones (API); es una aplicación que ha venido escalando posiciones, con una comunidad entusiasta de más de 600 colaboradores bien integrados (son 7 desarrolladores líderes -Torkel a la cabeza- y 5 a tiempo parcial para poder coordinar tal grupo de personas). Su código fuente está publicado, cómo no, en GitHub.

#### Caracteristicas

- Modelo de datos multidimensional: con datos de series de tiempo identificados por nombre métrico y claves/ valores pares.
- Lenguaje flexible de consultas: permite aprovechar esta multidimensionalidad para consultar los datos de manera simple y flexible.
- Nodos autónomos de servidor único: debido a la poca confianza en el almacenamiento distribuido, la colección de series de tiempo ocurre a través de un modelo de extracción, por medio de HTTP.
- Configuración estática:  los objetivos se determinan mediante configuración estática o descubrimiento de servicios.
- Dispondremos de gráficos elegantes para la visualización de datos. Los gráficos son rápidos y flexibles, con numerosas opciones.
- Pone a nuestra disposición paneles dinámicos y reutilizables.
- Es altamente extensible, podemos utilizar muchos paneles y complementos disponibles en la biblioteca oficial.
- Pondrá a nuestra disposición la autenticación a través de LDAP, Google Auth, Grafana.com y Github.
- Respalda notablemente la colaboración al permitir el intercambio de datos y cuadros de mando entre equipos.
- Está disponible una demostración en línea para que pruebes Grafana antes de instalarlo en tu equipo.
#### Vista del entorno
##### 1. Vista <br />
![grafanaent](https://user-images.githubusercontent.com/30842893/61816445-fd5e3f00-ae11-11e9-8d88-ddefa40634ba.png)

### Prometheus
![prometheus](https://user-images.githubusercontent.com/30842893/61816638-6645b700-ae12-11e9-8008-4065076442db.png)

Prometheus es una base de series de tiempo y un sistema de monitoreo y alertas. Las series de tiempo almacenan datos ordenados cronológicamente, midiendo variables a lo largo del tiempo y las bases de datos enfocadas a series de tiempo son especialmente eficientes en almacenar y consultar estos datos.

El proyecto tiene una comunidad muy activa de usuarios y desarrolladores. Desde su creación en el año 2012 ha evolucionado a convertirse en un proyecto independiente de código abierto siendo parte de la Cloud Native Computing Foundation desde 2016 como el segundo proyecto alojado, después de Kubernetes.

#### Caracteristicas

Características Principales

- Modelo de datos multidimensional: con datos de series de tiempo identificados por nombre métrico y claves/ valores pares.
- Lenguaje flexible de consultas: permite aprovechar esta multidimensionalidad para consultar los datos de manera simple y flexible.
- Nodos autónomos de servidor único: debido a la poca confianza en el almacenamiento distribuido, la colección de series de tiempo ocurre a través de un modelo de extracción, por medio de HTTP.
- Configuración estática:  los objetivos se determinan mediante configuración estática o descubrimiento de servicios.

#### Arquitectura de Prometheus
Almacena todas las muestras recortadas localmente y ejecuta reglas sobre estos datos para agregar y registrar nuevas series temporales a partir de datos existentes o para generar alertas.
Prometheus elimina las métricas de los trabajos instrumentados, ya sea directamente o a través de un Gateway de inserción intermedia para trabajos de poca duración.

#### Cuando usar Prometheus
Prometheus funciona bien para grabar cualquier serie temporal puramente numérica. Se ajusta tanto a la supervisión centrada en la máquina como a la supervisión de arquitecturas orientadas a servicios altamente dinámicas.

Para microservicios, es útil en la recopilación y consulta de datos multidimensionales es una fortaleza particular. Prometheus está diseñado para brindar confiabilidad. Es un sistema al que cualquier usuario puede acudir durante una interrupción o incidente  y diagnosticar rápidamente los problemas.

Cada servidor Prometheus es independiente sin depender del almacenamiento de red u otros servicios remotos. Esto nos da confianza cuando otras partes de la infraestructura estén rotas dado que no se requiere configurar una amplia infraestructura para usarlo.

#### Cuando no usar Prometheus
Prometheus valora la fiabilidad. Siempre tiene disponible las estadísticas del sistema, incluso cuando hay fallos.

Si se requiere absoluta precisión, como en el caso de la facturación por solicitud, Prometheus no ofrece las mejores opciones ya que los datos recopilados probablemente no sean lo suficientemente detallados y completos.

En estos casos se recomienda la utilización de otro sistema para recopilar y analizar datos para la facturación, y a continuación trabajar con Prometheus para el resto del monitoreo.

#### Vista del entorno
##### 2. Vista <br />
![prome](https://user-images.githubusercontent.com/30842893/61817206-9b063e00-ae13-11e9-9922-26010814fb68.jpg)

#### Sección de Pruebas Proyecto

##### Fallos en algún componente
En la siguiente imagen se observa que ocurre un problema con el Componente FileUtil pero funciona la conexión con la Base de Datos.
![Login Fallido(1)](https://user-images.githubusercontent.com/30842893/61818795-3a790000-ae17-11e9-99fe-b670f667c508.png)

##### Corrección y comprobación exitosa de los componentes
En la siguiente imagen se observa las correcciones con el Componente FIleUtil y funcionan los demás componentes.
![Login Exitoso(2)](https://user-images.githubusercontent.com/30842893/61819035-d145bc80-ae17-11e9-869f-d37b069d258d.png)


### Referencias 
[1]. https://www.aplyca.com/es/blog/monitoreo-de-contenedores-con-prometheus-y-grafana <br />
[2]. https://pandorafms.com/blog/es/que-es-grafana/  <br />
