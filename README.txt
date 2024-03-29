exec in docker: docker-compose -f stack.yml up
	
Aula Atual
4.25. Modelando e implementando a atualização de recursos com PUT
4.26. Modelando e implementando a exclusão de recursos com DELETE
4.27. Implementando a camada de domain services (e a importância da linguagem ubíqua)
4.28. Refatorando a exclusão de cozinhas para usar domain services
4.29. Desafio: modelando e implementando a consulta de recursos de restaurantes
4.30. Modelando e implementando a inclusão de recursos de restaurantes
4.31. Desafio: Modelando e implementando a atualização de recursos de restaurantes
4.32. Desafio: implementando serviços REST de cidades e estados
4.33. Analisando solução para atualização parcial de recursos com PATCH
4.34. Finalizando a atualização parcial com a API de Reflections do Spring

5.1. Implementando consultas JPQL em repositórios
5.3. Criando um repositório com Spring Data JPA (SDJ)
5.4. Refatorando o código do projeto para usar o repositório do SDJ
5.5. Desafio: refatorando todos os repositórios para usar SDJ
5.6. Criando consultas com query methods
5.7. Usando as keywords para definir critérios de query methods
5.8. Conhecendo os prefixos de query methods
5.9. Usando queries JPQL customizadas com @Query
5.10. Externalizando consultas JPQL para um arquivo XML
5.11. Implementando um repositório SDJ customizado
5.12. Implementando uma consulta dinâmica com JPQL
5.13. Implementando uma consulta simples com Criteria API
5.14. Adicionando restrições na cláusula where com Criteria API
5.15. Tornando a consulta com Criteria API com filtros dinâmicos
5.16. Conhecendo o uso do padrão Specifications (DDD) com SDJ
5.17. Implementando Specifications com SDJ
5.18. Criando uma fábrica de Specifications
5.19. Injetando o próprio repositório na implementação customizada e a anotação @Lazy
5.20. Estendendo o JpaRepository para customizar o repositório base

6.1. Mapeando relacionamento bidirecional com @OneToMany
6.2. Mapeando relacionamento muitos-para-muitos com @ManyToMany
6.3. Analisando o impacto do relacionamento muitos-para-muitos na REST API
6.4. Mapeando classes incorporáveis com @Embedded e @Embeddable
6.5. Testando e analisando o impacto da incorporação de classe na REST API
6.6. Mapeando propriedades com @CreationTimestamp e @UpdateTimestamp
6.7. Desafio: mapeando relacionamento muitos-para-um
6.8. Desafio: mapeando relacionamento um-para-muitos
6.9. Desafio: mapeando relacionamentos muitos-para-muitos
6.10. Entendendo o Eager Loading
6.11. Entendendo o Lazy Loading
6.12. Alterando a estratégia de fetching para Lazy Loading
6.13. Alterando a estratégia de fetching para Eager Loading
6.14. Resolvendo o Problema do N+1 com fetch join na JPQL

7.1. Entendendo o funcionamento de um pool de conexões
7.2. Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot
7.3. Configurando o pool de conexões do Hikari
7.4. Schema generation em produção não é uma boa prática
7.5. Flyway: ferramenta de versionamento de schemas de banco de dados
7.6. Adicionando o Flyway no projeto e criando a primeira migração
7.7. Evoluindo o banco de dados com novas migrações
7.8. Criando migrações complexas com remanejamento de dados
7.9. Criando migração a partir de DDL gerado por schema generation
7.10. Adicionando dados de testes com callback do Flyway
7.11. Reparando migrações com erros
7.12. Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido

8.2. Lançando exceções customizadas anotadas com @ResponseStatus
8.3. Lançando exceções do tipo ResponseStatusException
8.4. Estendendo ResponseStatusException
8.5. Simplificando o código com o uso de @ResponseStatus em exceptions
8.6. Desafio: refatorando os serviços REST
8.7. Analisando os impactos da refatoração
8.8. Criando a exception NegocioException
8.9. Desafio: usando a exception NegocioException
8.10. Afinando a granularidade e definindo a hierarquia das exceptions de negócios
8.11. Desafio: lançando exceptions de granularidade fina
8.12. Tratando exceções em nível de controlador com @ExceptionHandler
8.13. Tratando exceções globais com @ExceptionHandler e @ControllerAdvice
8.14. Desafio: implementando exception handler
8.15. Criando um exception handler global com ResponseEntityExceptionHandler
8.16. Customizando o corpo da resposta padrão de ResponseEntityExceptionHandler
8.17. Conhecendo a RFC 7807 (Problem Details for HTTP APIs)
8.18. Padronizando o formato de problemas no corpo de 8.18. Padronizando o formato de problemas no corpo de respostas com a RFC 7807respostas com a RFC 7807
8.19. Desafio: usando o formato de problemas no corpo de respostas
8.20. Customizando exception handlers de ResponseEntityExceptionHandler
8.21. Tratando a exception InvalidFormatException na desserialização
8.22. Habilitando erros na desserialização de propriedades inexistentes ou ignoradas
8.23. Desafio: tratando a PropertyBindingException na desserialização
8.24. Lançando exception de desserialização na atualização parcial (PATCH)
8.25. Desafio: tratando exception de parâmetro de URL inválido
8.26. Desafio: tratando a exceção NoHandlerFoundException
8.27. Desafio: tratando outras exceções não capturadas
8.28. Estendendo o formato do problema para adicionar novas propriedades
8.29. Desafio: estendendo o formato do problema

9.1. Validação do modelo com Bean Validation
9.2. Adicionando constraints e validando no controller com @Valid
9.3. Desafio: tratando exception de violação de constraints de validação
9.4. Estendendo o Problem Details para adicionar as propriedades com constraints violadas
9.5. Conhecendo e adicionando mais constraints de validação no modelo
9.6. Validando as associações de uma entidade em cascata
9.7. Agrupando e restringindo constraints que devem ser usadas na validação
9.8. Convertendo grupos de constraints para validação em cascata com @ConvertGroup
9.9. Desafio: adicionando constraints de validação no modelo
9.10. Customizando mensagens de validação na anotação da constraint
9.11. Customizando e resolvendo mensagens de validação globais em Resource Bundle
9.12. Desafio: customizando mensagens de validação
9.13. Resolvendo mensagens de validação com Resource Bundle do Bean Validation
9.14. Usando o Resource Bundle do Spring como Resource Bundle do Bean Validation
9.15. Criando constraints de validação customizadas usando composição
9.16. Criando constraints de validação customizadas com implementação de ConstraintValidator
9.17. Criando constraints de validação customizadas em nível de classe
9.18. Ajustando Exception Handler para adicionar mensagens de validação em nível de classe
9.19. Executando processo de validação programaticamente
9.20. Desafio: tratando a exception customizada de validações programáticas