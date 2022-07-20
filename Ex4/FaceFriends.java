package Abstracao.Ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FaceFriends {


    public static List<Contato> allContatos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        while(true){


            System.out.println("OPCOES: ");
            System.out.println();
            System.out.println("0 - parar ");
            System.out.println("1 - Inserir um contato ");
            System.out.println("2 - Imprimir todos os contatos ");
            System.out.println("3 - Imprimir 1 contato ");
            System.out.println("4 - Imprimir somente familiares ");
            System.out.println("5 - Imprimir somente os amigos ");
            System.out.println("6 - Imprimir somente os colegas de trabalho ");
            System.out.println("7 - Imprimir pessoas muito proximas ");

            System.out.printf("Escolha sua opcao: ");
            int opcao = sc.nextInt();

            if(opcao == 0) break;





            switch (opcao){
                case(1):
                    System.out.println("Qual o subtipo (1 - amigo; 2 - familia; 3 - Colega de trabalho)");
                    int subtipo = sc.nextInt(); // 1 - amigos 2 - familia 3 - colegadetrabalho
                    sc.nextLine();
                    System.out.println("Dados Bases: ");


                    System.out.print("Apelido: ");
                    String apelido = sc.nextLine();

                    System.out.print("nome: ");
                    String nome = sc.nextLine();

                    System.out.print("email: ");
                    String email = sc.nextLine();

                    System.out.print("Aniversario: ");
                    String data = sc.nextLine();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date realdate = formato.parse(data);


                    if(subtipo == 1){
                        System.out.print("Grau: ");
                        int grau = sc.nextInt();
                        allContatos.add(new Amigos(apelido,nome,  email, realdate, grau));


                    }else if(subtipo == 2){
                        System.out.println("Parentesco: ");
                        String parentesco = sc.next();
                        allContatos.add(new Familia(apelido,nome,  email, realdate, parentesco));

                    }else{
                        System.out.println("Tipo: ");
                        String tipo = sc.next();
                        allContatos.add(new Trabalho(apelido,nome,  email, realdate, tipo));

                    }




                    break;

                case(2):
                    ImprimeTodosOsContatos();
                    break;
                case(3):
                    System.out.println("Qual o indice do contato?");
                    PrintOneContato(sc.nextInt());
                    break;
                case(4):
                    ImprimeFamilia();
                    break;
                case(5):
                    ImprimeAmigos();
                    break;
                case(6):
                    ImprimeColegasdeTrabalho();
                    break;
                case(7):
                    PessoasMuitoProximas();
                    break;



            }



        }






    }





    private static void PrintOneContato(int indice){
        Contato e = allContatos.get(indice);

            if(e instanceof Amigos){
                System.out.println("TIPO: Amigos ");
            }
            if(e instanceof Trabalho){
                System.out.println("TIPO: Trabalho ");

            }
            if(e instanceof Familia){
                System.out.println("TIPO: Familia ");

            }






    }


    private static void InserirContato(Contato e){
        allContatos.add(e);
    }

    private static void PessoasMuitoProximas(){
        allContatos.forEach(e -> {
            if(e instanceof Amigos && ((Amigos) e).getGrau() == 1) e.ImprimirContato();
            if(e instanceof Familia && ((Familia) e).getParentesco().equalsIgnoreCase("irmão")) e.ImprimirContato();
            if(e instanceof Trabalho && ((Trabalho) e).getTipo().equalsIgnoreCase("colega")) e.ImprimirContato();

        });
    }


    private static void ImprimeFamilia(){
        allContatos.forEach(e -> {
            if(e instanceof Familia) e.ImprimirContato();
        });
    }

    private static void ImprimeAmigos(){
        allContatos.forEach(e -> {
            if(e instanceof Amigos) e.ImprimirContato();
        });
    }

    private static void ImprimeColegasdeTrabalho(){
        allContatos.forEach(e -> {
            if(e instanceof Trabalho) e.ImprimirContato();
        });
    }

    private static void ImprimeTodosOsContatos(){
        allContatos.forEach(e-> e.ImprimirContato());
        System.out.println();
    }

}
