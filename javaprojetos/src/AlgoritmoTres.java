public class AlgoritmoTres {

    void main(){
        int nota1, nota2, nota3, nota4;
        double media, somaNotas;
        //Entrada das notas dos alunos
        IO.println("Digite as quatro notas trimestrais do aluno: ");

        nota1 = Integer.parseInt(IO.readln("Digite a nota 1: "));
        nota2 = Integer.parseInt(IO.readln("Digite a nota 2: "));
        nota3 = Integer.parseInt(IO.readln("Digite a nota 3: "));
        nota4 = Integer.parseInt(IO.readln("Digite a nota 4: "));
        //soma das notas
        somaNotas = nota1 + nota2 + nota3 + nota4;
        IO.println("O valor da soma das notas é = " + somaNotas);
        //media das notas
        media = somaNotas / 4;
        IO.println("O valor da media das notas é = " + media);
        //saida das notas, soma e media
        IO.println("Considerações finais");
        IO.println("O aluno obteve a soma de: " + somaNotas + "com uma media de: " + media);
    }
}
