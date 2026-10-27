# Projeto Eletrônicos e Notificações - Danilo Roberto

## Informações do Aluno

- **Nome:** Danilo Roberto
- **RM:** 566966
- **Turma:** 2CCPS
- **Curso:** Ciência da Computação
- **GitHub:** [@seu-usuario]

## Descrição do Projeto
Este projeto é o resultado prático dos conceitos abordados nas aulas de Programação Orientada a Objetos, aplicando pilares fundamentais como abstração, encapsulamento, herança, polimorfismo, interfaces e composição. A ideia central é modelar dispositivos eletrônicos (`Eletronico`, `Tablet`) e demonstrar como diferentes objetos podem ser tratados de forma genérica e integrada através de contratos em interfaces (`Notificavel`).

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos
**Pergunta:** Por que precisamos criar uma classe? Não seria mais fácil apenas criar variáveis soltas no main? Pense: E se o sistema tiver 1 milhão de itens? Como a Classe ajuda a resolver isso?

**Sua Resposta:**

Criar uma classe é essencial para estruturar os dados e comportamentos de forma coesa. Se usássemos apenas variáveis soltas no método `main`, o código rapidamente se tornaria impossível de manter, sem organização ou padronização para representar múltiplos registros. A classe funciona como um molde: com ela, conseguimos instanciar quantas instâncias forem necessárias de maneira limpa, escalável e organizada, permitindo gerenciar milhões de objetos utilizando coleções e estruturas orientadas a objetos.

### Aula 2 - Métodos
**Pergunta:** Se nós podemos simplesmente alterar os atributos diretamente no código principal, por que dá tanto trabalho criar um método específico para fazer isso? Quais seriam os riscos se deixássemos qualquer código alterar os dados diretamente?

**Sua Resposta:**

O uso de métodos específicos garante que regras de negócio e validações sejam aplicadas antes que qualquer estado de um objeto seja modificado. Se permitíssemos alterações diretas em atributos públicos, perderíamos o controle sobre a integridade dos dados, correndo o risco de inserir valores inconsistentes (como baterias negativas ou estados corrompidos), o que quebraria a previsibilidade do sistema.

### Aula 3 - Encapsulamento
**Pergunta:** No nosso código, os atributos são `private`, mas os métodos de acesso são `public`. Por que é seguro deixar os métodos públicos, mas perigoso deixar o atributo original público? Pense na diferença entre dar uma cópia de um documento e entregar o original para rasura.

**Sua Resposta:**

Manter os atributos como `private` protege o estado interno do objeto contra modificações externas descontroladas. Os métodos públicos atuam como uma camada controlada de interface (uma barreira de segurança), permitindo que o sistema leia ou altere dados apenas se passarem por validações prévias, enquanto o acesso direto ao atributo original daria passe livre para qualquer alteração sem validação ou rastreio.

### Aula 4 - Construtores
**Pergunta:** Por que é um erro grave gerar getters e setters para tudo automaticamente na IDE? Como a modelagem de construtores e métodos restritos protege o sistema de falhas lógicas?

**Sua Resposta:**

Gerar getters e setters irrestritos para todos os atributos viola o princípio do encapsulamento, transformando classes em meros "registros burros" sem regras de negócio. No mundo real, certas propriedades (como identificadores únicos ou características estruturais imutáveis após a criação) não devem ser modificadas livremente após a inicialização via construtor. Restringir essas modificações assegura que o objeto nasça em um estado válido e permaneça íntegro durante todo o seu ciclo de vida.

### Aula 5 - Associação
**Pergunta:** No construtor de uma classe associada, por que exigimos o objeto inteiro (como parâmetros de composição) em vez de pedir apenas tipos primitivos (como `String` do nome)? Pense nas regras de negócio e manipulação de estados.

**Sua Resposta:**

Passar o objeto associado inteiro em vez de apenas strings isoladas garante que mantenhamos uma referência real e funcional para interagir com aquele domínio. Por exemplo, no projeto, se precisarmos interagir ou atualizar dados internos da composição, ter o objeto completo permite que os métodos executem operações diretamente na referência correta, mantendo o relacionamento estruturado do modelo "TEM-UM".

### Aula 6 - Herança
**Pergunta:** Quando uma classe filha herda de uma mãe com atributos privados (`private`), ela não consegue acessá-los diretamente, sendo obrigada a usar métodos públicos ou `super()`. O que isso está protegendo?

**Sua Resposta:**

Essa restrição protege o princípio do encapsulamento e evita o acoplamento excessivo entre as camadas da hierarquia. Se as subclasses pudessem manipular livremente as variáveis privadas da superclasse sem restrições, qualquer alteração na classe mãe poderia quebrar o funcionamento interno das filhas. O uso de `super()` e métodos de acesso garante que a inicialização e a manipulação dos dados sigam o contrato definido pela classe base.

### Aula 7 - Polimorfismo
**Pergunta:** Por que o contrato de comportamento precisa existir na base da hierarquia (superclasse ou interface) para que o polimorfismo funcione em um loop genérico?

**Sua Resposta:**

O polimorfismo depende de referências genéricas para tratar diferentes objetos de forma unificada. Se o método ou comportamento não estiver definido na classe base ou na interface, o compilador não reconhecerá a chamada ao iterar sobre uma coleção genérica, pois ele enxerga os itens apenas pelo tipo mais genérico da referência. Definir o contrato na base garante que qualquer filha ou implementação cumpra a assinatura esperada.

### Aula 8 - Classes Abstratas
**Pergunta:** Faz sentido existir um objeto que é APENAS um `Eletronico` genérico sem ser um tipo específico? Por que precisamos dizer explicitamente ao Java que a classe é `abstract`?

**Sua Resposta:**

Não faz sentido instanciar um conceito genérico que serve apenas como modelo conceitual para subclasses mais específicas. Transformar a classe em `abstract` impede que o desenvolvedor crie instâncias diretas de um objeto incompleto, garantindo que apenas as implementações concretas (como `Tablet`) possam ser utilizadas no sistema, preservando a coesão da modelagem.

### Aula 9 - Interfaces
**Pergunta:** Por que o Java permite herança simples de classes, mas a implementação múltipla de interfaces? Como as interfaces resolvem conflitos de contratos?

**Sua Resposta:**

A herança múltipla de classes geraria ambiguidades complexas de código e estado (como o clássico "Problema do Diamante"). As interfaces resolvem isso porque definem apenas contratos de comportamento (assinaturas de métodos), sem carregar estado interno ou variáveis de instância. Como a classe concreta é obrigada a implementar os métodos da interface, o Java garante que o comportamento seja definido de forma segura e sem ambiguidades de herança de código.

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

- **Qual foi o domínio que você escolheu para seu projeto pessoal?** Sistema de Gestão de Dispositivos Eletrônicos e Central de Notificações.
- **Quais classes você criou?** `Eletronico` (abstrata), `Tablet` (subclasse), `Pelicula` (classe auxiliar de composição), `Notificavel` (interface) e `SistemaPrincipal` (classe executável).
- **Qual foi o maior desafio técnico que você enfrentou?** O maior desafio técnico foi estruturar corretamente a hierarquia de herança combinada com a implementação de uma interface polimórfica (`Notificavel`). Garantir que a classe abstrata definisse os atributos comuns e obrigasse as subclasses a tratarem a autonomia de bateria, enquanto a interface permitia processar alertas em massa num array genérico no `SistemaPrincipal`, exigiu bastante atenção à sintaxe e aos conceitos de POO aprendidos ao longo das aulas.

## Conclusão

- **O que você aprendeu nestas aulas?** Aprendi a estruturar sistemas orientados a objetos robustos, compreendendo desde a criação simples de classes até conceitos avançados de reutilização de código, segurança de dados com encapsulamento, hierarquias de herança e desacoplamento através de interfaces.
- **Qual conceito foi mais difícil de entender?** A aplicação conjunta de polimorfismo com arrays de interfaces exigiu um esforço maior de abstração mental para visualizar como o código principal consegue interagir com objetos distintos através de um contrato comum. Superei essa dificuldade criando exemplos práticos e testando passo a passo no ambiente de desenvolvimento.
- **O que você melhoraria no seu projeto se pudesse refazer?** Se pudesse refazer, implementaria uma camada de persistência em arquivos ou banco de dados para salvar o estado dos dispositivos, além de expandir o sistema para incluir novas subclasses de eletrônicos (como Smartphones e Laptops) interagindo com múltiplas centrais de alertas.

## Estrutura do Projeto
Plaintext

```text
fiap-poo/
├── README.md
└── src/
    ├── main/
    │   └── SistemaPrincipal.java
    └── model/
        ├── Eletronico.java
        ├── Notificavel.java
        ├── Pelicula.java
        └── Tablet.java
```
