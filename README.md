# Cities-API

## Tecnologias Utilizadas

* Java 8
* Spring Boot
* Docker
* PostgreSQL
* IntelliJ Community
* Heroku CLI

## Diferencial desta Versão

* Implementei o método get a partir do nome das cidades;
* Implementei uma classe unicamente responsável pela resposta ao get;
* Implementei uma resposta em forma de String, contendo o trajeto, a distância geográfica em quilômetros, e um possível tempo de viagem por avião.

Obs.: Os outros métodos de calcular distância foram retirados.

#### Exemplo de Funcionamento:
~~~
in: http://localhost:8080/timeDistance/byName?from=Belo Horizonte-MG&to=Recife-PE

out: ### FROM Belo Horizonte-MG TO Recife-PE ### GEOGRAPHICAL DISTANCE: 1430Km #### AVERAGE TIME BY PLANE: 2h:22min ###
~~~

## Créditos do Trabalho Anterior

* [Base do Projeto](https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api)
* [Banco de Dados](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)
