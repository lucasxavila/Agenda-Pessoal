# Atividade Final - Programação de Soluções Computacionais: Agenda Pessoal

Este repositório contém uma aplicação simples em Java que implementa uma **Agenda Pessoal**, desenvolvida como trabalho final da disciplina de Programação de Soluções Computacionais.

## Alunos

- Lucas Guilherme Ávila Barreto – 1232021323  
- Matheus Lopes Ferreira Leite – 1232022908

## Descrição

O sistema permite que os usuários **autenticados** adicionem, visualizem e excluam eventos pessoais em uma agenda. Os eventos são registrados com título, data/hora, localização e descrição, e são armazenados em uma lista de memória. Cada novo evento também é gravado em um arquivo de log (`agenda_log.txt`).

## Funcionalidades de acordo com a IA

- **Autenticação de Usuário**: O sistema exige nome de usuário e senha para acessar a agenda.
- **Adicionar Evento**: Permite cadastrar novos eventos com detalhes completos.
- **Visualizar Eventos**: Lista todos os eventos adicionados.
- **Excluir Evento**: Remove um evento selecionado da agenda.
- **Registro em Arquivo**: Os eventos adicionados são logados em um arquivo texto para fins de auditoria.

> Algumas funcionalidades listadas como ideais pela IA (lembretes, sincronização, compartilhamento, segurança avançada, entre outras) **não foram implementadas**, mas foram avaliadas como sugestões interessantes para evoluções futuras.

## Crítica à Geração de Requisitos por IA

A IA forneceu uma análise de requisitos bastante **abrangente e coerente**, cobrindo desde funcionalidades básicas até aspectos avançados como **privacidade, exportação/importação de dados** e **eventos recorrentes**.

Contudo, para o escopo deste projeto, consideramos a proposta da IA **além do necessário**, pois a implementação de certas funções exigiria bibliotecas externas, integração com servidores, ou múltiplos usuários. Para projetos acadêmicos com tempo limitado, **a flexibilidade é essencial**, e uma definição de requisitos excessivamente rígida pode dificultar ajustes durante o desenvolvimento.

## Diagrama de Classes

**Usuário**
- nome: String
- senha: String
- login(): boolean

**Agenda**
- eventos: List<Evento>
- adicionarEvento(evento): void
- visualizarEventos(): void
- excluirEvento(teclado): void

**Evento**
- titulo: String
- dataHora: String
- localizacao: String
- descricao: String
- toString(): String

## Como Executar

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/lucasxavila/agenda-pessoal.git
3. Navegue até o diretório do projeto:
   ```bash
   cd agenda-pessoal
4. Compile os arquivos Java:
   ```bash
   javac -d bin src/*.java
5. Execute o programa:
   ```bash
   java -cp bin Main
