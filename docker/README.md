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
docker run [opciones] mirar la pagina
docker start [nombre contenedor o id contenedot]-> sirve para ejecutar el contenedor
docker stop [nombre contenedor o id contenedor]-> sirve para parar un contenedor


para los puertos se habren con el -p
docker create --name some-mysql -e MYSQL_ROOT_PASSWORD=123456789  mysql:5.7.18 
docker run -p 5306:3306 --name some-mysql -e MYSQL_ROOT_PASSWORD=123456789 -d mysql:5.7.18

para ver los puertos que esta usando un contenedor
docker port [nombre del conenedor or id]

para conectarme a un servidor uso el comando
docker exec -it [nombre contenedor] bash


docker commit crear una nueva imagen
docker push sube una imagen a un repositorio en linea

dockerfile
crear una imagen a partir de otra
docker build -t "simple_flask:dockerfile" .


actualizar un contenedor se usa el comando update
docker update --restart always [nombre contenedor] // con esto hago que el ocntenedor suba de forma automatica






