# Sistema de Funcionários


# Sobre o projeto


O Sistema de Funcionários 

É um sistema simples, onde foi desenvolvido com intuito de aprender sobre a teamplate Engine Thymeleaf que facilita a criação de páginas HTML. Assim criando teamplates de forma mais fácil (Facilitanto a vida do Back-End).

O Sistema é um CRUD onde podemos 
   - Listar todos os Funcionários;
   - Cadastrar um Novo Funcionário;
   - Editar Dados de um Funcionário já Cadastrado;
   - Excluir um Funcionário.

## Layout web

Na página principal são listados os usuários cadastrados que o sistema possui e suas informações.


![Web 1](https://raw.githubusercontent.com/erolkss/employee_system/main/src/main/resources/assets/img/home_page.png)

Para Cadastrar um Novo Colaborador deve ser informando, **Nome Completo**, **Email**, **Endereço**, **Gênero** e uma **Senha**.

![Web 2](https://github.com/erolkss/employee_system/blob/main/src/main/resources/assets/img/Add_new_employee.png?raw=true)

Para editar dados de um Funcionário basta clicar no botão: ![Web 3](https://github.com/erolkss/employee_system/blob/main/src/main/resources/assets/img/Button_Edtit.png?raw=true) 
Onde serão carregados os dados salvos do Funcionário. Sobrescreva algum dado e clicar em **Update** para que a alteração esteja sendo salva no Sistema.

Antes:

![Web 4](https://github.com/erolkss/employee_system/blob/main/src/main/resources/assets/img/Edit_Employee_1.png?raw=true)

Depois:

![Web 5](https://github.com/erolkss/employee_system/blob/main/src/main/resources/assets/img/Edit_Employee_2.png?raw=true)

Para Excluir um Funcionário basta na Página Principal clicar no botão: ![Web 6](https://github.com/erolkss/employee_system/blob/main/src/main/resources/assets/img/Button_Delete.png?raw=true) Assim o Funcionário estará sendo excluido da Base de Dados




# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML
- Thymeleaf
- Bootstrap


# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/erolkss/employee_system.git

# executar o projeto
./mvnw spring-boot:run
```


# Autor

**Lucas Eduardo Lima**

https://www.linkedin.com/in/lucaserolima/
