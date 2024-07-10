# ms-magalu-notification
Desafio backend da Magalu com Spring Boot, Scheduler e MySQL.

![img-1.png](img%2Fimg-1.png)
![img-2.png](img%2Fimg-2.png)
![img-3.png](img%2Fimg-3.png)

* Caso já tenha o MySQL instalado na máquina e queira usar o container via Docker:

```shell
sudo service mysql stop
```

* Documentação para configurar o container e a conexão com banco de dados:
  <a href="https://spring.io/guides/gs/accessing-data-mysql">Acessing data MySQL</a>

```shell
cd docker
docker-compose up
```

* Endpoints

```shell
curl --request POST \
  --url http://localhost:8080/notifications \
  --header 'Content-Type: application/json' \
  --data '{
	"dateTime": "2024-07-10T14:54:00",
	"destination": "dyane.aaraujo@gmail.com",
	"message": "Seja bem vinda!",
	"channel": "EMAIL"
}'
```