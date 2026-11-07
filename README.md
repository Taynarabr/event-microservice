# Event Microservice

Microsserviço de eventos desenvolvido na disciplina de Projeto Integrador (IFAM – Campus Parintins), reproduzindo a videoaula "Construindo Microsserviços com Java", de Fernanda Kipper.

O serviço cadastra eventos, lista os eventos que ainda não aconteceram e registra inscrições de participantes. Após cada inscrição, solicita ao microsserviço de e-mail (via OpenFeign) o envio da confirmação.

## Tecnologias
- Java 21
- Spring Boot 4.1.2
- Spring Data JPA
- H2 Database (em memória)
- Spring Cloud OpenFeign
- Lombok
- Maven

## Como executar
1. Tenha o Java 21 instalado.
2. Clone o repositório:
   git clone https://github.com/Taynarabr/event-microservice.git
3. Na pasta do projeto, execute:
   - Windows: .\mvnw.cmd spring-boot:run
   - Linux/Mac: ./mvnw spring-boot:run
4. A aplicação sobe em http://localhost:8081
   (console do H2 em http://localhost:8081/h2-console)

## Observações
- A porta foi alterada para 8081 (no vídeo é 8080).
- O microsserviço de e-mail (AWS SES) deve rodar em http://localhost:8090.

## Demonstração

Fluxo completo testado localmente: o serviço de eventos (porta 8081) registra a inscrição e chama, via OpenFeign, o serviço de e-mail (porta 8090), que envia a confirmação pelo Amazon SES.

1. Criação de um evento com data futura
2. Inscrição do participante no evento
3. E-mail de confirmação recebido:
  <img width="700" alt="Confirmação de Inscrição" src="https://github.com/user-attachments/assets/69561d58-1d3c-4530-a601-7d49d579cd37" />
  - O microsserviço de e-mail (AWS SES) é o projeto desafio-backend-uber, reaproveitado da videoaula, e deve rodar em http://localhost:8090.

