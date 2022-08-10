# Java Sensor-API Backend Developer

- Descrição do desenvolvimento da API Java Backend!

 - O projeto consiste em uma API REST que retorna um endpoint de leitura de series temporais, a finalidade
da API é mostrar uma amostra de dados de temperatura, nome do ponto solicitado e identificação do ponto, hoarario e data do tipo timestamp em formato JSON.

# O que foi Desenvolvido e resolução de problemas durante o desenvolvimento da API:
- Abaixo o que inicialmente foi pensado para a aplicação do  desenvolvimento do serviço.

- 01:
- Desenvolver uma API REST em JAVA que retorna os dados dos arquivos em anexo no e-mail de maneira estruturada conforme as seguintes  orientações:
- a)Retornar um endpoint de leitura dados de séries temporais que mostre a timestamp (ts), amostra de temperatura (dado) e identificação - do ponto (xid) no formato JSON. 
- b)A consulta deve mostrar id do ponto,  nome do ponto, a timestamp em vetor e dado de temperatura em vetor.
- c)A estrutura do endpoint deverá conter o campo de id e tempo para realização da consulta.

- 02:
- Realizar o deploy da API REST desenvolvida na questão anterior utilizando o HEROKU com o sistema operacional Linux.

- 03:
O código desenvolvido deverá ser publicado em uma página pública como projeto API REST no  GitLab (sua conta pessoal)

- Foram adcionadas novas funcionalidades como deletar e atualizar
- Padrão De Projeto usado DDD Domain-Driven Design
- Estrutura Padrão no desenvolvimento de REST-API
- Lambda Expression e Java Stream 

# Tecnologias Usadas
- Java Runtime 17 
- Spring Boot framework
- Hibernate
- JPA
- Postgresql
# Kernel e IDE (Ambiente de desenvolvimento !)
- Linux Mint 20.0 LTS
- Intellij
- SpringToolSuit (STS)

# Foram criados as seguintes funcionalidades!

- Listar Todos os serviços relacionados a serie temporais
- Criar um novo Serviço retornando uma data de criação,horario de criação e atualização do horário em forma de timestamp, amostra de dados da temperatura, nome do ponto, identificação do ponto xid.
- Encontrar um serviço apartir de um id
- Atualizar o serviço por um id em específico
- Remover o serviço atráves de um id 

# Corpo Da Requisição:(exemplo de como foi testado a API em JSON! POST MAPPING)
    
    - "nomePonto":"[Ambiente] Armazém 03",
    - "temperatura": 21.21,
    - "deadLine":"2022-05-24T23:59:59.999"  
       
# Resposta da Requisição!

       - "id": 8,
       - "nomePonto": "[Ambiente] Armazém 03",
       - "temperatura": 21.21,
       - "deadLine": "2022-05-24T23:59:59.999",
       - "dataRealizacao": "2022-07-21T14:54:56.978+00:00",
       - "dataAtualizacao": "2022-07-21T11:54:56.978514"


# Variáveis usadas
- "id" = "xid" (Identificação do ponto)
- "nomePonto" = "Nome do ponto"
- "temperatura" = "Dado" (Amostra de dados de temperatura)
- "deadLine" = "Timestamp (ts data + horário a ser cadastrado nesse formato ano-més-dia-tempo exemplo:2022-01-01T23:59:59.999 )"
- "dataRealização" = "Timestamp da maquina local, ou seja o tempo e data do seu pc ou notebook" (Data da dataRealização do serviço)
- "dataAtualizacao"= "Atualiza o fuso-Horario + horario local, caso esteja atrasado"

# Como Testar a aplicação ?

- Usando o Postman Ou Insomnia acesse o link onde o deploy da API foi realizada
- link do deploy: https://apirest-sensorwebdev.herokuapp.com/Sensor/
- link do deploy: https://apirest-sensorwebdev.herokuapp.com/Sensor/sensors

- O primeiro link é onde o EndPoint para listar todos os serviços ficam
- O segundo link é onde os outros EndPoints de (inserir,atualizar por id e excluir por id e consulta por id) 











