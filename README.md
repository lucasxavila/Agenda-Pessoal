# PSCFinal
Agenda Pessoal criada em java
TRABALHO FINAL PROGRAMAÇÃO 
DE SOLUÇÕES COMPUTACIONAIS

Alunos: 
Lucas Guilherme Ávila Barreto - 1232021323
Matheus Lopes Ferreira Leite - 1232022908

   O sistema deve ser capaz de realizar as seguintes funções: Permitir que os usuários adicionem, visualizem, excluam e registrem eventos em suas agendas.

Requisitos funcionais de acordo com a IA:

Autenticação de Usuário: O sistema deve permitir que os usuários se autentiquem para acessar suas agendas pessoais, garantindo que apenas usuários autorizados possam visualizar e modificar os eventos.
Adicionar Eventos: Os usuários devem poder adicionar novos eventos à sua agenda, especificando detalhes como título do evento, data, hora, localização e uma descrição opcional.
Visualizar Eventos: Os usuários devem poder visualizar todos os eventos em sua agenda, organizados por data e hora, para que possam ter uma visão geral de suas atividades futuras.
Atualizar Eventos: Os usuários devem poder modificar os detalhes de um evento existente, como data, hora, localização ou descrição, caso haja alterações.
Excluir Eventos: Os usuários devem poder excluir eventos da sua agenda, caso decidam não mais participar ou se o evento for cancelado.
Definir Lembretes: Os usuários devem poder configurar lembretes para eventos específicos, para serem notificados em um determinado tempo antes do evento ocorrer (por exemplo, 15 minutos, 1 hora, etc.).
Notificações: O sistema deve ser capaz de enviar notificações aos usuários quando se aproximar a hora de um evento, de acordo com as configurações de lembretes definidas pelo usuário.
Sincronização: Idealmente, o sistema deve ser capaz de sincronizar os eventos da agenda pessoal do usuário entre diferentes dispositivos, para garantir que as atualizações feitas em um dispositivo sejam refletidas em todos os outros.
Privacidade e Segurança: Deve haver medidas para garantir a privacidade e segurança dos dados do usuário, garantindo que apenas o usuário autorizado tenha acesso aos seus eventos.
Recorrência de Eventos: Os usuários devem poder agendar eventos recorrentes, como reuniões semanais ou mensais, e especificar a frequência e a duração da recorrência.
Compartilhamento de Eventos: Os usuários devem poder compartilhar eventos específicos com outros usuários, permitindo que amigos, familiares ou colegas vejam ou participem de determinados eventos.
Exportar/Importar Calendários: Os usuários devem poder exportar ou importar seus calendários em diferentes formatos (por exemplo, iCal, CSV), para integração com outros aplicativos ou para backup.



Crítica à IA:

   Com base na nossa avaliação aos requisitos funcionais gerados pela IA, chegamos a conclusão de que a mesma tem uma boa eficácia e até mesmo muito completa,fornecendo uma informação clara e objetiva para os desenvolvedores do projeto, gerando requisitos que não planejávamos para nosso projeto como sincronização, privacidade e segurança, compartilhamento de eventos, exportar/importar calendários, entre outros. A rigidez excessiva pode dificultar a adaptação a mudanças visto que se trata de um projeto no qual pode sofrer variáveis adaptações durante seu desenvolvimento.

Diagrama de Classe:

Usuário
----------------------------
-nome: String
-senha: String
---------------------------
+login()


Agenda
----------------------------
-evento: List
----------------------------
+adicionarEvento()
+visualizarEvento()
+excluirEvento()

Evento
----------------------------
-titulo:String
-dataHora: DateTime
-localizacao: String
-descricao: String


