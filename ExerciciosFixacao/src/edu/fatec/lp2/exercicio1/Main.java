package edu.fatec.lp2.exercicio1;

import java.util.Scanner;

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de contatos:");
        int numContatos = scanner.nextInt();
        scanner.nextLine();

        Contatinho[] contatos = new Contatinho[numContatos];
        for (int i = 0; i < numContatos; i++) {
        System.out.println("Digite o nome do contato " + (i+1) + ":");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato " + (i+1) + ":");
        String celular = scanner.nextLine();

        contatos[i] = new Contatinho(nome, celular);
        }

        WhatsApp whatsapp = new WhatsApp(contatos);
        }