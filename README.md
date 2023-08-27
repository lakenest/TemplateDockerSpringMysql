# TemplateDockerSpringMysql
**** Docker cambiar de red ****
docker network create --driver bridge my-net
docker network disconnect bridge container_name
docker network connect my-net container_name

**** Build DockerFile Api REST ****
docker build -t user/users_service:V1 .
docker run --network my-net -d -p 18082:8082 --name name_container ImageID

**** Api REST ****
Consultar usuario -- GET : http://localhost:18082/api/users
Agregar usuarios -- POST : http://localhost:18082/api/users
Entrada: 
{
"firstName":"container",
"lastName":"last",
"email":"user@mail.com",
"createdBy":"container",
"updatedBy":"container"
}
