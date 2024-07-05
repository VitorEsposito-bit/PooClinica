
/**
 * Escreva uma descrição da classe ListaPacientes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaPacientes
{
    private Pacientes [] listaPacientes;
    private int proximoIndice;
    
    public ListaPacientes(int tamanho){
        listaPacientes = new Pacientes[tamanho];
        proximoIndice = 0;
    }
    public Pacientes consultaPorNome(String nome){
        if(proximoIndice==0){
            return null;
        }
        for(int i = 0;i<proximoIndice;i++){
            if(nome.equals(listaPacientes[i].getNome())){
                return listaPacientes[i];
            }
        }
        return null;
    }
    public Pacientes consultaPorCodigo(String codigo){
        if(proximoIndice==0){
            return null;
        }
        for(int i = 0;i<proximoIndice;i++){
            if(codigo.equals(listaPacientes[i].getCodigo())){
                return listaPacientes[i];
            }
        }
        return null;
    }
    public Pacientes[] idadeAcima(int idade){
        int indiceSeguinte = 0;
        Pacientes[]listaIdadeAcima = new Pacientes[proximoIndice];
        for(int i = 0;i<proximoIndice;i++){
            if(listaPacientes[i].getIdade() > idade){
                listaIdadeAcima[indiceSeguinte] = listaPacientes[i];
                indiceSeguinte++;
            }
        }
        return listaIdadeAcima;
    }
    public String toString(){
        String saida = "";
        for(int i=0;i<proximoIndice;i++){
            saida = saida + listaPacientes[i].toString();
        }
        return saida;
    }
    public boolean cadastraPaciente(Pacientes paciente1){
        if(proximoIndice == 0){
            listaPacientes[proximoIndice] = paciente1;
            proximoIndice++;
            return true;
        }
        for(int i = 0;i<proximoIndice;i++){
            if(listaPacientes[i].getCodigo() == paciente1.getCodigo() && listaPacientes[i].getNome() == paciente1.getNome()){
                return false;
            }
        }
        listaPacientes[proximoIndice] = paciente1;
        proximoIndice++;
        return true;
    }
    public boolean alteraPeso(String codigo, double novoPeso){
        for(int i = 0; i < proximoIndice;i++){
            if(codigo.equals(listaPacientes[i].getCodigo())){
                listaPacientes[i].setPeso(novoPeso);
                return true;
            }
        }
        return false;
    }
    public boolean alteraAltura(String codigo, double novaAltura){
        for(int i = 0; i < proximoIndice;i++){
            if(codigo.equals(listaPacientes[i].getCodigo())){
                listaPacientes[i].setAltura(novaAltura);
                return true;
            }
        }
        return false;
    }
    public boolean alteraSexo(String codigo, double novoSexo){
        for(int i = 0; i < proximoIndice;i++){
            if(codigo.equals(listaPacientes[i].getCodigo())){
                listaPacientes[i].setAltura(novoSexo);
                return true;
            }
        }
        return false;
    }
    public double mostraImc(String codigo){
        for(int i = 0; i <proximoIndice;i++){
            if(codigo.equals(listaPacientes[i].getCodigo())){
                 return listaPacientes[i].calculaImc();
            }
        }
        return 0;
    }
}

