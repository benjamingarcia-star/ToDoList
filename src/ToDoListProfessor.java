
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ToDoListProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] tarefas = new String[10];
        boolean[] concluidas = new boolean[10];
        
        int opcao = 0;
        
        while(opcao != 5){
            System.out.println("==========LISTA DE TAREFAS==========");
            System.out.println("1- Adicionar Tarefas");
            System.out.println("2- Listar Tarefas");
            System.out.println("3- Concluir Tarefas");
            System.out.println("4- Excluir Tarefas");
            System.out.println("5- Sair");
            
            System.out.println("Escolha uma das opcoes: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    int posicaoLivre = -1;
                    
                    for(int i = 0; i < tarefas.length; i++){
                        if(tarefas[i] == null){
                            posicaoLivre = i;
                            break;
                        }
                    }
                    
                    if (posicaoLivre == -1){
                        System.out.println("A lista de tarefas esta cheia");
                    }else{
                        System.out.println("Digite a tarefa: ");
                        tarefas[posicaoLivre] = scanner.nextLine();
                        concluidas[posicaoLivre] = false;
                        System.out.println("Tarefa adicionada com sucesso!");
                    }
                    
                    break;
                case 2:
                    System.out.println("==========MINHAS TAREFAS==========");
                    
                    boolean existeTarefa = false;
                    
                    for(int i = 0; i < tarefas.length; i++){
                        if (tarefas[i] != null) {
                            existeTarefa = true;
                            
                            if (concluidas[i] == true){
                                System.out.println((i + 1) + " - [x]" + tarefas[i]);
                            }else{
                                System.out.println((i + 1) + " - [ ]" + tarefas[i]);
                            }
                        }
                    }
                    if (existeTarefa == false){
                            System.out.println("Nenhuma tarefa cadastrada");
                    }
                    
                    break;
                case 3:
                    System.out.println("Digite o numero que deseja: ");
                    int numeroConcluir = scanner.nextInt();
                    
                    int indiceConcluir = numeroConcluir - 1;
                    
                    if (indiceConcluir >= 0 && indiceConcluir < tarefas.length && tarefas[indiceConcluir] != null){
                        concluidas[indiceConcluir] = true;
                        System.out.println("Tarefa concluida com sucesso!");
                    }else{
                        System.out.println("Tarefa Inválida!");
                    }
        }
    }
}
}
