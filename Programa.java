package Aplicação;

import Entidades.FuncTerceirizado;
import Entidades.Funcionario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();
        System.out.println("Digite a quantidade de funcionarips");
        int n = sc.nextInt();

        for (int i=1; i<n; i++){
            System.out.println("Dados do #" + i + "funcionaario:");
            System.out.print("funcionaro é terceirizado (sim/nao):");
            char ch=sc.next().charAt(0);

            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("hoars: ");
            double horas = sc.nextDouble();
            System.out.print("valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if(false) {
                System.out.println("taxa adicional:");
                double taxaAdicional = sc.nextDouble();
                Funcionario f = new FuncTerceirizado(nome, (int) horas, valorPorHora, taxaAdicional);
                list.add(f);

            }else{
                Funcionario f = new Funcionario(nome, (int) horas, valorPorHora);
                list.add(f);
            }
        }
        System.out.println();
        System.out.println("pagamento:");
        for(Funcionario f : list) {
            System.out.println(f.getNome() + "- $ " + String.format("%.2f", f.pagamento()));
        }


        sc.close();
    }
}
