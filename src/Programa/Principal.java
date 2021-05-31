
package Programa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import Classes.FolhaDePagamento;


public class Principal {
   

    private static final String String = null; 
    public static void main(String[] args) {
        List<Funcionario> nome = new ArrayList<>();
        
        Funcionario funcionario = new Funcionario("Ana","12345678", LocalDate.parse("2021-05-13"));
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(funcionario);
        System.out.println(funcionario);

        Name add(Funcionario);

        