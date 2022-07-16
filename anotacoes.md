### Módulo Domain Model

- Entidades possuem uma identidade única, enquanto VOs são considerados iguais, se todos os seus atributos tiverem valores iguais. Na implementação da classe Estudante,a entidade é Estudante porque possui o CPF como identidade única, pois duas pessoas com o mesmo nome não necessariamente são a mesma pessoa. Diferente deste cenário, temos o e-mail que pode ser considerao o mesmo e-mail quando dois ou mais e-mails possuírem endereços iguais.

### Módulo Services

O objetivo da classe Service é representar uma classe que executa alguma ação que não pertence a nenhuma entidade ou VO. 

As nossas regras de negócio devem ficar nas entidades e VOs, mas nem sempre isso faz sentido. Quando precisamos executar alguma ação que não faça parte de nenhuma entidade nem de um VO, podemos utilizar uma classe Service.