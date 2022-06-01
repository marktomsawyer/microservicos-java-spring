#MICROSERVIÇOS COM JAVA E SPRING

Separar as classes do projeto de acordo com as responsabilidades (package by layer), nomeando os pacotes de forma intuitiva, como model, repository, service, controller;
Criar a classe que irá representar a tabela pagamentos no banco de dados, para isso utilizamos a dependência @Entity para que a JPA consiga fazer a relação entre a tabela e a entidade;
Usar a anotação @Table para indicar o nome da tabela no banco de dados;
Usar as anotações do lombok para não precisar escrever os construtores, getters e setters das classes. Essas anotações foram: @AllArgsConstructor, @NoArgsConstructors, @Getters, @Setters;
Usar as anotações de validação dos dados, para definir tamanhos mínimos e máximos dos campos, obrigatoriedade ou não de inclusão, entre outras. Essas anotações foram: @NotBlank, @NotNull, @Size, @Positive;
Usar as anotações do lombok para não precisar escrever os construtores, getters e setters das classes. Essas anotações foram: @AllArgsConstructor, @NoArgsConstructors, @Getters, @Setters;
Criar um tipo enumerado (Enum) para representar o Status do pedido, onde separamos em criado, confirmado e cancelado;
Criar uma interface herdando da JPA Repository, para já termos os métodos básicos que utilizaremos em nosso CRUD implementados, como findAll, findById, save, etc;
Criar uma classe com o padrão DTO para flexibilizar e/ou restringir os atributos que serão recebidos ou devolvidos pela API;
Separar a regra de negócio e o acesso ao repositório numa classe separada, denominada classe de serviço (Service);
Usar a dependência do ModelMapper para converter os dados do model para o DTO e vice versa;
Criar a classe que irá atuar com controlador (ou Controller) e usar a anotação @RestController para indicar que estamos construindo um controlador para uma API REST e o caminho/rota que deverá ser digitada para chegar nesse ponto;
Implementar os métodos anotando de acordo com o tipo da requisição http recebida @GetMapping, @PostMapping, @PutMapping e @DeleteMapping;
Usar as anotações @PathVariable, para indicar ao Spring que deve atribuir à variável o valor que estamos enviando como parâmetro no endereço da requisição e @RequestBody para indicar é para atribuir à variável o conteúdo que estamos enviando dados no corpo da requisição.


Separar as classes do projeto de acordo com as responsabilidades (package by layer), nomeando os pacotes de forma intuitiva, como model, repository, service, controller;
Criar a classe que irá representar a tabela pagamentos no banco de dados, para isso utilizamos a dependência @Entity para que a JPA consiga fazer a relação entre a tabela e a entidade;
Usar a anotação @Table para indicar o nome da tabela no banco de dados;
Usar as anotações do lombok para não precisar escrever os construtores, getters e setters das classes. Essas anotações foram: @AllArgsConstructor, @NoArgsConstructors, @Getters, @Setters;
Usar as anotações de validação dos dados, para definir tamanhos mínimos e máximos dos campos, obrigatoriedade ou não de inclusão, entre outras. Essas anotações foram: @NotBlank, @NotNull, @Size, @Positive;
Usar as anotações do lombok para não precisar escrever os construtores, getters e setters das classes. Essas anotações foram: @AllArgsConstructor, @NoArgsConstructors, @Getters, @Setters;
Criar um tipo enumerado (Enum) para representar o Status do pedido, onde separamos em criado, confirmado e cancelado;
Criar uma interface herdando da JPA Repository, para já termos os métodos básicos que utilizaremos em nosso CRUD implementados, como findAll, findById, save, etc;
Criar uma classe com o padrão DTO para flexibilizar e/ou restringir os atributos que serão recebidos ou devolvidos pela API;
Separar a regra de negócio e o acesso ao repositório numa classe separada, denominada classe de serviço (Service);
Usar a dependência do ModelMapper para converter os dados do model para o DTO e vice versa;
Criar a classe que irá atuar com controlador (ou Controller) e usar a anotação @RestController para indicar que estamos construindo um controlador para uma API REST e o caminho/rota que deverá ser digitada para chegar nesse ponto;
Implementar os métodos anotando de acordo com o tipo da requisição http recebida @GetMapping, @PostMapping, @PutMapping e @DeleteMapping;
Usar as anotações @PathVariable, para indicar ao Spring que deve atribuir à variável o valor que estamos enviando como parâmetro no endereço da requisição e @RequestBody para indicar é para atribuir à variável o conteúdo que estamos enviando dados no corpo da requisição.



O conceito de service discovery, que é o mecanismo de descoberta do endereço do microsserviço pelo nome, desacoplando um microsserviço do outro pelo IP ou porta;
O conceito de service registry, que é um servidor central onde os microsserviços ficam cadastrados para permitir a descoberta;
Implementação do service registry através do Eureka Server, que faz parte do conjunto de ferramentas do Spring Cloud;
Configuração dos serviços com o Eureka Client, para que consigam fazer corretamente o self registration (auto-registro).


Incluir um API Gateway na arquitetura do projeto Alura Food, para criar um ponto único de acesso à nossa aplicação;
Alterar a forma com que os microsserviços são acessados, passando o endereço do Gateway e o nome do microsserviço;
Criar um método que retorna a porta na qual a instância que está recebendo a requisição está sendo executada;
Fazer a integração do Gateway com o Eureka, balanceando às requisições entre as instâncias que estão disponíveis.



Utilizar o Open Feign do Spring Cloud para conseguir projetar a comunicação síncrona entre microsserviços;
Implementar no serviço de pagamentos uma requisição do tipo PUT para o serviço de pedidos, para informar que o pedido foi pago corretamente;
Conceito de circuit breaker, que interrompe um chamado a um serviço quando as requisições com falha de comunicação atingirem um número específico;
Implementar o fallback, que é a forma com que um microsserviço vai tratar a falha de comunicação, ou seja, uma estratégia para que a inoperabilidade de um serviço não afete o outro.


