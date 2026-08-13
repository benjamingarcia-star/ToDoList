/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while(opcao != 5){
            System.out.println("=== LISTA DE TAREFAS ===");
            System.out.println("1- Adicionar tarefa");
            System.out.println("2- Listar tarefas");
            System.out.println("3- Concluir tarefas");
            System.out.println("4- Excluir tarefa");
            System.out.println("5- Sair");
            
            System.out.println("Digite a opcao que voce quer: ");
            int escolha = scanner.nextInt();
        }

    }
    
}
