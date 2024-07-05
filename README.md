# POO_clinica

Esta aplicação em Java permite gerenciar uma lista de pacientes em uma clínica médica, oferecendo funcionalidades básicas como cadastro, consulta, alteração de dados e cálculo de IMC.

## Funcionalidades:
Cadastro de Pacientes: Permite cadastrar novos pacientes na lista.
Consulta por Código: Consulta informações de um paciente específico pelo código.
Consulta por Nome: Consulta informações de um paciente específico pelo nome.
Listagem por Idade: Lista todos os pacientes com idade acima de um valor específico.
Alteração de Peso, Altura e Sexo: Permite alterar o peso, altura e sexo de um paciente já cadastrado.
Cálculo de IMC: Calcula e exibe o Índice de Massa Corporal de um paciente.

## Classes Principais:
AppClinica.java
Este é o ponto de entrada do programa. Ele contém o método main que interage com o usuário através do console para realizar as operações mencionadas acima.

ListaPacientes.java
Esta classe gerencia a lista de pacientes, incluindo métodos para adicionar pacientes, consultar por código ou nome, listar pacientes com idade acima de um determinado valor, e mais.

Pacientes.java
Representa a classe de dados dos pacientes, contendo atributos como código, nome, sexo, peso, altura e idade. Inclui métodos para cálculo de IMC, cálculo de peso ideal e representação textual do paciente.

