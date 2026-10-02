package AgoritmoCinquentaaeTres;
import java.util.HashMap;
import java.util.Map;

public class AlgoritmoCinquentaeTres {
    // Generics - Definir qualquer tipo <T> - Generico
    // ex: Map<String, Aluno> dicionarioAlunos = new HashMap()
    // toda classe herda de Object
    
    public void main(){

        Map<String, Aluno> alunos = new HashMap<>();
        
        Aluno e1 = new Aluno("natalia", "ciencia da computaçao", 2026);
        alunos.put("Natalia a ++", e1);
        
        Aluno e2 = new Aluno("natalia", "ciencia da computação", 2023);
        alunos.put("Natalia gotosa", e2);

        for(Aluno e:alunos.values()){
            IO.println(e);
        }

        for(String matricula : alunos.keySet()){
            Aluno e = alunos.get(matricula);
            IO.println(matricula + " -> " + e);
        }

        IO.println("Digite a matricula: ");
        String busca = IO.readln();

        Aluno encontrado = alunos.get(busca);

        if(encontrado != null){
            IO.println("Encontrado " +busca+ " -> " +encontrado);
        }else{
            IO.println("Matricula " +busca+ " Nao encontrada.");
        }

        for(Map.Entry<String, Aluno> entry : alunos.entrySet()){
            
        }


    }
}
