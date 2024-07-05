import java.util.*;
/**
 * Escreva uma descrição da classe AppClinica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppClinica
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String codigo,nome;
        char sexo;
        double peso, altura;
        int idade,tamanho,opcao = 0;
        Pacientes auxiliar;
        Pacientes [] listaAuxiliar;
        System.out.println("Digite o tamanho da lista de pacientes: ");
        tamanho = in.nextInt();
        ListaPacientes lista1 = new ListaPacientes(tamanho);
        do{
            menu();
            System.out.println("Digite a opção desejada: ");
            opcao = in.nextInt();
            switch(opcao){
                case 1: 
                        in.nextLine();
                        System.out.println("Informe o código do paciente: ");
                        codigo = in.nextLine();
                        System.out.println("Informe o nome do paciente: ");
                        nome = in.nextLine();
                        System.out.println("Informe o sexo do paciente: ");
                        sexo = in.next().charAt(0);
                        System.out.println("Digite o peso do paciente: ");
                        peso = in.nextDouble();
                        System.out.println("Digite a altura do paciente: ");
                        altura = in.nextDouble();
                        System.out.println("Digite a idade do paciente: ");
                        idade = in.nextInt();
                        Pacientes paciente1 = new Pacientes(nome, sexo, codigo,peso, altura, idade);
                        if(lista1.cadastraPaciente(paciente1)){
                            System.out.println("Paciente cadastado com sucesso!");
                        }
                        else{
                            System.out.println("Paciente não cadastrado...");
                        }
                        break;
                case 2: 
                        in.nextLine();
                        System.out.println("Digite um código que você deseja consultar:");
                        codigo = in.nextLine();
                        auxiliar = lista1.consultaPorCodigo(codigo);
                        if(auxiliar != null){
                            System.out.println(auxiliar.toString());
                        }
                        else{
                            System.out.println("Consulta por código inválida");
                        }
                        break;
                case 3: System.out.println("Digite uma idade: ");
                        idade = in.nextInt();
                        listaAuxiliar = lista1.idadeAcima(idade);
                        if(listaAuxiliar.length > 0){
                            for(int i = 0;i<listaAuxiliar.length;i++){
                                System.out.println(listaAuxiliar[i].toString());
                            }
                        }
                        else{
                            System.out.println("Não há nenhum paciente com idade acima do número informado...");
                        }
                        break;
                case 4: System.out.println(lista1.toString());break;
                case 5: in.nextLine();
                        System.out.println("Digite um nome que você deseja consultar:");
                        nome = in.nextLine();
                        auxiliar = lista1.consultaPorNome(nome);
                        if(auxiliar != null){
                            System.out.println(auxiliar.toString());
                        }
                        else{
                            System.out.println("Consulta por nome inválida");
                        }
                        break;
                case 6: in.nextLine();
                        System.out.println("Digite o código do paciente que você deseja altera o peso");
                        codigo = in.nextLine();
                        System.out.println("Digite o novo peso do paciente");
                        peso = in.nextDouble();
                        if(lista1.alteraPeso(codigo,peso)){
                            System.out.println("Peso alterado com sucesso!");
                        }
                        else{
                            System.out.println("Peso não alterado...");
                        }
                        break;
                case 7: System.out.println("Digite o código do paciente que você deseja altera o peso");
                        codigo = in.nextLine();
                        System.out.println("Digite a nova altura do paciente");
                        altura = in.nextDouble();
                        if(lista1.alteraAltura(codigo,altura)){
                            System.out.println("Altura alterada com sucesso!");
                        }
                        else{
                            System.out.println("Altura não alterado...");
                        }
                        break;
                case 8: in.nextLine();
                        System.out.println("Digite o código do paciente que você deseja altera o peso");
                        codigo = in.nextLine();
                        System.out.println("Digite o novo sexo do paciente");
                        sexo = in.next().charAt(0);
                        if(lista1.alteraSexo(codigo,sexo)){
                            System.out.println("Sexo alterado com sucesso!");
                        }
                        else{
                            System.out.println("Sexo não alterado...");
                        }
                        break;
                case 9: in.nextLine();
                        System.out.println("Digite o código do paciente que você quer ver o IMC: ");
                        codigo = in.nextLine();
                        if(lista1.mostraImc(codigo)> 0){
                            System.out.println(lista1.mostraImc(codigo));
                        }
                        else{
                            System.out.println("Paciente não encontrado");
                        }
                        break;
            }
        }while(opcao != 10);
    }
    public static void menu(){
        System.out.println("Digite 1 para cadastar um paciente na lista");
        System.out.println("Digite 2 para consultar um paciente por código");
        System.out.println("Digite 3 para ver todos pacientes com idade acima de determinado número");
        System.out.println("Digite 4 para ver todos pacientes");
        System.out.println("Digite 5 para consultar um paciente por nome");
        System.out.println("Digite 6 alterar o peso de um paciente");
        System.out.println("Digite 7 para alterar a altura de um paciente");
        System.out.println("Digite 8 para alterar o sexo de um paciente");
        System.out.println("Digite 9 para ver o IMC de determinado paciente");
        System.out.println("Digite 10 para sair");
    }
}
