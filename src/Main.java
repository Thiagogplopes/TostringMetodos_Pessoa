import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("thiago", 18);
        Pessoa pessoa2 = new Pessoa("eder", 22);
        Pessoa pessoa3 = new Pessoa("joao", 19);




        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);


        System.out.println("o tamanho da lista é " + listaDePessoas.size());


        System.out.println("a primeira pessoa " + listaDePessoas.get(0));

        System.out.println(listaDePessoas);
        for (Pessoa pessoa: listaDePessoas);

        System.out.println(listaDePessoas);



    }

}