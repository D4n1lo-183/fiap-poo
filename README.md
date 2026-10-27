# Projeto Java - Eletrônicos e Notificações

## Dados do aluno
- Nome: Danilo Roberto
- RM: 566966
- Turma: 2CCPS
- Curso: Ciência da Computação

Este projeto é uma aplicação Java simples criada para praticar conceitos de Programação Orientada a Objetos (POO), como:

- abstração
- encapsulamento
- herança
- polimorfismo
- interfaces
- composição

A ideia central é modelar dispositivos eletrônicos e demonstrar como diferentes objetos podem ser tratados de forma genérica através de uma interface de notificação.

---

## Objetivo do projeto

O sistema simula um cenário em que tablets podem ser monitorados por uma central de alertas. A classe `Tablet` herda de `Eletronico` e implementa a interface `Notificavel`, permitindo que qualquer objeto que cumpra esse contrato possa enviar mensagens para o sistema.

Isso mostra, na prática, o uso de:

- classes abstratas para representar comportamentos comuns;
- interfaces para definir contratos; 
- arrays de objetos por interface para aplicar polimorfismo.

---

## Estrutura do projeto

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

---

## Descrição das classes

### `Eletronico`
Classe abstrata que representa um dispositivo eletrônico genérico.

Atributos principais:

- `nivelBateria`
- `ligado`
- `cor`
- `marca`
- `armazenamento`

Métodos principais:

- `ligar()`
- `carregarBateria(double carga)`
- `calcularAutonomiaBateria()`

Essa classe define comportamento comum para todos os eletrônicos, além de exigir que subclasses implementem a lógica específica de autonomia.

### `Notificavel`
Interface que define o contrato:

```java
void enviarNotificacao(String mensagem);
```

Qualquer classe que implementar essa interface deve saber como enviar notificações para o sistema.

### `Tablet`
Classe que herda de `Eletronico` e implementa `Notificavel`.

Ela representa um tablet com acesso à cor, marca, armazenamento e a opção de possuir caneta.

Além disso, sobrescreve:

- `enviarNotificacao(String mensagem)`
- `calcularAutonomiaBateria()`

### `Pelicula`
Classe auxiliar que representa uma película de proteção, contendo:

- `resistencia`
- `material`

### `SistemaPrincipal`
Classe responsável por instanciar os objetos e demonstrar o uso do sistema.

Ela cria tablets, monta um array de `Notificavel` e envia mensagens para todos os dispositivos que implementam a interface.

---

## Fluxo de execução

O ponto de entrada do projeto está na classe `SistemaPrincipal` dentro do pacote `main`.

### Compilar o projeto

No Windows, a partir da raiz do projeto:

```powershell
dir /s /b src\*.java > sources.txt
javac -d out @sources.txt
```

### Executar a aplicação

```powershell
java -cp out main.SistemaPrincipal
```

> Observação: para que a aplicação possa ser executada pelo comando `java`, o método principal da classe deve seguir o padrão Java:
>
> ```java
> public static void main(String[] args)
> ```
>
> No projeto atual, a classe `SistemaPrincipal` está com um método `main` sem o parâmetro `String[] args` e sem a visibilidade `public`, o que pode impedir a execução direta no ambiente Java padrão.

---

## Exemplo de saída esperada

```text
Meu Tablet é: Azul Vidro
O do professor é: Preto Plastico

--- Missão: Array de Interfaces (Polimorfismo com Notificavel) ---
[CENTRAL DE NOTIFICAÇÕES | Tablet Apple]: Atualização de segurança crítica pendente.
[CENTRAL DE NOTIFICAÇÕES | Tablet Motorola]: Atualização de segurança crítica pendente.
```

---

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- IDE Java (VS Code + extensão Java / JDK)

---

## Aprendizados praticados

Este projeto trabalha com os seguintes conceitos de estudo:

- reutilização de código por herança;
- definição de comportamentos por interfaces;
- uso de polimorfismo em coleções e arrays;
- organização por pacotes (`main` e `model`);
- modelagem orientada a objetos em um cenário simples e didático.

---
