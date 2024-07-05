import java.util.*;
/**
 * Escreva uma descrição da classe Pacientes aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pacientes
{
    private String codigo;
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    private int idade;
    
    public Pacientes(String nome, char sexo,String codigo,double peso,double altura,int idade){
        if(nome!=null){
           this.nome = nome;
           if(Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F'){
               this.sexo = sexo;
           }
           else{
               System.out.println("Erro ao atribuir sexo");
           }
        }
        else{
            System.out.println("Erro ao atribuir nome");
        }
        this.codigo = codigo;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome!=null){
           this.nome = nome;
        }
        else{
            System.out.println("Erro ao atribuir nome");
        }
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        if(Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F'){
            this.sexo = sexo;
        }
        else{
            System.out.println("Erro ao atribuir sexo");
        }
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double sexo){
        this.altura = altura;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public double calculaImc(){
        return peso/(altura*altura);
    }
    public double pesoIdeal(){
        if(Character.toUpperCase(sexo) == 'M'){
            return (72.7*altura) - 58;
        }
        else{
            return (62.1*altura)-44.7;
        }
    }
    public String toString(){
        return "\nEste paciente se chama " + nome + ",e é do sexo " + sexo + ". Tem peso e altura de respectivamente: " + peso + ", " + altura + ". E idade: " + idade + ".";
    }
}
