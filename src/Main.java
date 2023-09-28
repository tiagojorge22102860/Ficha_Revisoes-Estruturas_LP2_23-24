import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static ArrayList meusColegas(){
        ArrayList<Pessoa> colegas=new ArrayList<>();
        colegas.add(new Pessoa("Luke","Skywalker",123456789));
        colegas.add(new Pessoa("Han","Solo",100100112));
        colegas.add(new Pessoa("Darth","Vader",111111110));
        return colegas;
    }

    static HashMap meusAlunos(){
        HashMap<Pessoa, Integer>alunos=new HashMap<Pessoa, Integer>();
        alunos.put(new Pessoa("Luke","Skywalker",123456789),123456789);
        alunos.put(new Pessoa("Han","Solo",100100112),100100112);
        alunos.put(new Pessoa("Darth","Vader",111111110),111111110);
        return alunos;
    }

    static boolean existePessoaEmAL(ArrayList<Pessoa> pessoas,Pessoa pessoa){
        if (pessoas==null){
            return false;
        }
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).nome.equals(pessoa.nome)){
                if (pessoas.get(i).apelido.equals(pessoa.apelido)){
                    if (pessoas.get(i).nrBI== pessoa.nrBI){
                        return true;
                    }
                }
            }

        }
        return false;
    }

    static HashMap<String,Integer> tornarHM(Pessoa[] pessoas){
        int count=1;
        HashMap<String,Integer>nomes=new HashMap<>();
        for (int i = 0; i < pessoas.length; i++) {
            if (nomes.containsKey(pessoas[i].nome)){
                count++;
            }
            nomes.put(pessoas[i].nome,count);

        }
        return nomes;
    }
    static HashMap<String, ArrayList<Pessoa>> tornarHM2(Pessoa[]pessoas){
        HashMap<String,ArrayList<Pessoa>> map=new HashMap<>();
        for (Pessoa pessoa: pessoas) {
            String nome= pessoa.nome;
            if (!map.containsKey(nome)){
                map.put(nome,new ArrayList<>());
            }
            map.get(nome).add(pessoa);
        }
        return map;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
