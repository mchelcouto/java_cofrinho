# Cofrinho de Moedas 💰

Um sistema de gerenciamento de cofrinho virtual desenvolvido em **Java** que permite armazenar e gerenciar diferentes tipos de moedas (*Dólar, Euro e Real*) com conversão automática para **Real brasileiro**.

---

## 📋 Descrição do Projeto

Este projeto foi desenvolvido como **atividade prática** para a disciplina **Programação Orientada a Objetos (POO)** no curso de **Ciência da Computação** da **Uninter**.

O sistema implementa um cofrinho virtual onde o usuário pode:

- ➕ **Adicionar moedas** de diferentes países e valores  
- ➖ **Remover moedas** específicas do cofrinho  
- 📃 **Listar todas as moedas** armazenadas  
- 💱 **Calcular o valor total** convertido para Real brasileiro  

---

## 🎯 Objetivos de Aprendizado

O projeto foca na aplicação prática dos seguintes conceitos de **POO**:

- **Herança** → Implementação de classes filhas que herdam de uma classe abstrata  
- **Polimorfismo** → Métodos que se comportam de forma diferente em cada subclasse  
- **Encapsulamento** → Uso adequado de modificadores de acesso  
- **Abstração** → Criação de uma classe abstrata como modelo base  

---

## 📁 Estrutura do Projeto

```bash
COFRINHO/
├── .vscode/
├── lib/
├── src/
│   ├── App.java        # Classe principal com menu de interação
│   ├── Moeda.java      # Classe abstrata base
│   ├── Cofrinho.java   # Classe que gerencia a coleção de moedas
│   ├── Dolar.java      # Classe para moedas em Dólar
│   ├── Euro.java       # Classe para moedas em Euro
│   └── Real.java       # Classe para moedas em Real
└── README.md
```

---

## 🏗️ Arquitetura das Classes

### Diagrama UML Implementado

```
┌─────────────────────┐
│ Cofrinho            │
├─────────────────────┤
│ - listaMoedas       │
├─────────────────────┤
│ + adicionar()       │
│ + remover()         │
│ + listagemMoedas()  │
│ + totalConvertido() │
└─────────────────────┘
       │ contém
       ▼
┌─────────────────────┐
│ <>                  │
│ Moeda               │
├─────────────────────┤
│ # valor: double     │
├─────────────────────┤
│ + info()            │
│ + converter()       │
└─────────────────────┘
             △
             │ herda
      ┌──────┼──────┐
      ▼      ▼      ▼
┌───────┐ ┌─────┐ ┌──────┐
│ Dolar │ │Euro │ │ Real │
└───────┘ └─────┘ └──────┘
```

---

## 📚 Descrição das Classes

### 🎭 Moeda (Classe Abstrata)
- **Atributos:** valor (*double*)  
- **Métodos abstratos:** `info()`, `converter()`  
- **Função:** Serve como modelo base para todas as moedas  

### 💵 Dólar
- **Herda de:** Moeda  
- **Cotação:** `1 USD = R$ 5,20`  
- **Método info():** Retorna informações formatadas em dólar  
- **Método converter():** Converte valor para reais  

### 💶 Euro
- **Herda de:** Moeda  
- **Cotação:** `1 EUR = R$ 5,65`  
- **Método info():** Retorna informações formatadas em euro  
- **Método converter():** Converte valor para reais  

### 💴 Real
- **Herda de:** Moeda  
- **Cotação:** `1 BRL = R$ 1,00`  
- **Método info():** Retorna informações formatadas em real  
- **Método converter():** Retorna o próprio valor  

### 🏦 Cofrinho
- **Atributos:** `listaMoedas (ArrayList)`  
- **Função:** Gerencia a coleção de moedas e operações do sistema  

---

## 🚀 Como Executar

### Pré-requisitos
- **Java Development Kit (JDK)** 8 ou superior  
- **Visual Studio Code** com *Extension Pack for Java*  

### Passos para Execução

Clone ou baixe o projeto:

```bash
git clone https://github.com/mchelcouto/java_cofrinho.git
cd COFRINHO
```

Abra no **VS Code**:

```bash
code .
```

Execute o projeto:

- **Opção 1:** Clique com botão direito em *App.java* → "Run Java"  
- **Opção 2:** Use o terminal integrado:  

```bash
cd src
javac *.java
java App
```

---

## 🎮 Como Usar

### Menu Principal

Ao executar o programa, você verá o seguinte menu:

```
=== BEM-VINDO AO COFRINHO DE MOEDAS ===
=== MENU DO COFRINHO ===
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular Total em Reais
0 - Sair
Escolha uma opção:
```

### Funcionalidades Detalhadas

- ➕ **Adicionar Moeda** → Escolha o tipo (Dólar, Euro ou Real) e o valor  
- ➖ **Remover Moeda** → Escolha pela lista numerada de moedas  
- 📃 **Listar Moedas** → Mostra todas as moedas armazenadas  
- 💱 **Calcular Total** → Exibe o valor total convertido em reais  

---

## 📊 Exemplo de Uso

```
=== ADICIONAR MOEDA ===
Dólar (USD)
Euro (EUR)
Real (BRL)
Escolha o tipo de moeda: 1
Digite o valor da moeda: 10.50
Moeda adicionada com sucesso!

=== MOEDAS NO COFRINHO ===
Dólar - Valor: $10.50

=== TOTAL CONVERTIDO ===
Total em Reais: R$ 54.60
```

---

## 🔧 Funcionalidades Técnicas

### ✅ Validações Implementadas
- Verificação de entrada numérica  
- Validação de valores positivos  
- Verificação de cofrinho vazio  
- Tratamento de exceções de entrada  

### 📌 Conceitos de POO Aplicados
- **Herança:** Classes Dolar, Euro e Real herdam de Moeda  
- **Polimorfismo:** Métodos `info()` e `converter()` variam em cada classe  
- **Encapsulamento:** Atributos privados com métodos públicos de acesso  
- **Abstração:** Classe `Moeda` define o contrato para as subclasses  

### 💰 Cotações Utilizadas
- 1 USD = R$ 5,20  
- 1 EUR = R$ 5,65  
- 1 BRL = R$ 1,00  

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **IDE:** Visual Studio Code  
- **Extensões:** Extension Pack for Java  
- **Estruturas de Dados:** ArrayList  
- **Paradigma:** Programação Orientada a Objetos  

---

## 📚 Exemplos de Código

### Herança
```java
public class Dolar extends Moeda {
    // Herda atributos e métodos de Moeda
}
```

### Polimorfismo
```java
@Override
public double converter() {
    return valor * 5.20; // Implementação específica do Dólar
}
```

### Encapsulamento
```java
private ArrayList<Moeda> listaMoedas; 
public void adicionar(Moeda moeda) {   
    listaMoedas.add(moeda);
}
```

---

## 🎓 Objetivos Atingidos

- ✅ Implementação correta de herança  
- ✅ Uso adequado de polimorfismo  
- ✅ Criação de classes abstratas  
- ✅ Gerenciamento de coleções  
- ✅ Tratamento de exceções  
- ✅ Interface de usuário interativa  
- ✅ Organização de código em múltiplas classes  

---

## 🐛 Tratamento de Erros

O sistema inclui tratamento para:  

- Entradas inválidas (não numéricas)  
- Valores negativos ou zero  
- Índices inválidos para remoção  
- Operações em cofrinho vazio  

---

## 🚧 Possíveis Melhorias

- [ ] Cotações dinâmicas via API  
- [ ] Persistência de dados em arquivo  
- [ ] Interface gráfica com JavaFX  
- [ ] Histórico de transações  
- [ ] Mais tipos de moedas  
- [ ] Sistema de backup automático  

---

## 👨‍💻 Autor

**Michel Douglas do Couto**  
Disciplina: **Programação Orientada a Objetos**  
Curso: **Ciência da Computação - Uninter**  

---

