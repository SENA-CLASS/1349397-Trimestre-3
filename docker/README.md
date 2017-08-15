Docker

comandos basicos [ver enlace manual oficual](https://docs.docker.com/reference/)

docker --version -> muestra la version de docker que esta instalada
docker images -> muestra las imagenes que estan monstadas actualmente

docker save [imagen o codigo imagen] > [nombre archivo tar] -> copiar una imagen a un archivo tar
docker load < [archivo tar] -> sirve para carga una imagen al daemon

docker ps -> muestra los contenedores que estan funcionando
docker ps [OPTIONS]  -> buscar opciones en la pagina
docker ps -a -> muestra todos los contenedores sin importar que esten funcionando


docker kill [id del contenedor] -> mata el proceso de ese contenedor

contenedores
docker rm -> borra un contenedor
docker create [opcionres] mirar la pagina
docker start [nombre contenedor o id contenedot]-> sirve para ejecutar el contenedor
docker stop [nombre contenedor o id contenedor]-> sirve para parar un contenedor
