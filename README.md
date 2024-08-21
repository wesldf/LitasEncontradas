# LitasdeContatos

## Descrição
Este projeto é uma aplicação Java que gerencia uma lista de contatos utilizando listas encadeadas. Ele foi desenvolvido como parte do trabalho final de sistematização, com foco na implementação de estruturas de dados e algoritmos de busca.

## Funcionalidades
- Adicionar um novo contato
- Buscar um contato por nome ou número de telefone
- Remover um contato
- Listar todos os contatos

## Pré-requisitos
- Java 8 ou superior

## Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/rayonny/LitasdeConatatos.git
javac *.java
java ContactManager
Uso
Ao rodar o programa, você verá um menu com opções para adicionar, buscar, remover e listar contatos.
Use as opções numeradas para interagir com o sistema conforme as instruções do menu.

Estrutura do Projeto

Contact.java: Classe que representa um contato, armazenando nome, número de telefone e e-mail.

Node.java: Classe que representa um nó na lista encadeada, armazenando um contato e a referência para o próximo nó.

ContactList.java: Classe que gerencia a lista encadeada de contatos, oferecendo métodos para adicionar, buscar, remover e listar contatos.

ContactManager.java: Classe principal que implementa a interface de usuário e controla o fluxo do programa.

Memória do Desenvolvimento

O projeto utiliza listas encadeadas para gerenciar a lista de contatos. A estrutura de dados permite inserção, busca e remoção de contatos de forma eficiente.
O algoritmo de busca percorre a lista encadeada sequencialmente, comparando o nome ou número de telefone do contato. 
A escolha por listas encadeadas se deve à sua flexibilidade em relação à inserção e remoção de elementos, sem necessidade de realocação de memória como em arrays
