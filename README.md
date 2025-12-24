# Java Core: Fundamentos, Performance e Estruturas de Dados

Este repositório documenta a trilha de aprofundamento na linguagem Java, focando além da sintaxe básica. O objetivo aqui foi entender o funcionamento interno da JVM, gerenciamento de memória, escolha eficiente de estruturas de dados e programação funcional moderna.

## 📚 Conteúdo do Repositório

O estudo foi dividido em 3 módulos progressivos:

### 🔹 Módulo 1: Anatomia e Manipulação de Dados
Foco em como o Java gerencia memória e otimização de processamento de texto.
- **Gerenciamento de Memória:** Diferença entre *Stack* e *Heap*.
- **Strings:** Imutabilidade, String Pool e performance com `StringBuilder`.
- **Datas:** Manipulação moderna com `LocalDateTime`.
- **Projeto:** *TextAnalyzer* - Um processador de textos otimizado.

### 🔹 Módulo 2: Collections Framework & Robustez
Foco em escolher a estrutura de dados correta para cada cenário e tratamento de erros.
- **List:** Comparativo de performance `ArrayList` vs `LinkedList` (Big O).
- **Set:** Garantia de unicidade e o contrato `equals()` e `hashCode()`.
- **Map:** Associação chave-valor e manipulação de dicionários.
- **Exceptions:** Criação de exceções personalizadas (`Checked` e `Unchecked`) e `try-with-resources`.
- **Projeto:** *Gerenciador Escolar* - Sistema de notas com validação e busca O(1).

### 🔹 Módulo 3: Java Moderno (Functional)
Transição do estilo imperativo para o declarativo (Java 8+).
- **Lambdas:** Sintaxe enxuta e interfaces funcionais.
- **Streams API:** Pipelines de processamento (`filter`, `map`, `reduce`) sem efeitos colaterais.
- **Optional:** Prevenção segura contra `NullPointerException`.
- **Projeto:** *Analítico de E-commerce* - Geração de relatórios gerenciais sem uso de laços `for`.

## 🛠️ Tecnologias Utilizadas
- Java 17+
- IntelliJ IDEA
- Conceitos de Big O Notation

## 🚀 Como Executar
Cada módulo possui sua própria classe `Main` ou métodos executáveis dentro das classes de projeto. Basta clonar o repositório e executar os arquivos individualmente.

```bash
git clone [https://github.com/rafalves106/Java-Core](https://github.com/rafalves106/Java-Core)
