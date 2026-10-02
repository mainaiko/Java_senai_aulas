package desafio;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AlgoritmoCinquentaeCinco {

    private static final String NOME_DO_ARQUIVO = "ambientes.txt";

    // Formatação de data
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args){
        
        Map<String, Dicionario> laboratorios = new HashMap<>();
        carregarDoArquivo(laboratorios);

        String menu = "--- Menu de Ambientes ---\n"
                    + "1. Cadastrar\n"
                    + "2. Listar\n"
                    + "3. Pesquisar\n"
                    + "4. Excluir\n"
                    + "5. Alterar\n"
                    + "6. Sair\n\n"
                    + "Escolha uma opção:";

        int opcao = 0;

        do {
            try {
                // Usa showInputDialog para receber dados no loop
                String entrada = JOptionPane.showInputDialog(null, menu, "Sistema de Dicionário", JOptionPane.QUESTION_MESSAGE);
                
                if (entrada == null) { 
                    opcao = 6; // Se clicar em cancelar, sai do programa
                    continue;
                }
                
                opcao = Integer.parseInt(entrada);

                // Separa cada opção do menu em um método
                switch (opcao) {
                    case 1:
                        cadastrarAmbiente(laboratorios);
                        break;
                    case 2:
                        listarAmbientes(laboratorios);
                        break;
                    case 3:
                        pesquisarAmbiente(laboratorios);
                        break;
                    case 4:
                        excluirAmbiente(laboratorios);
                        break;
                    case 5:
                        alterarAmbiente(laboratorios);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        } while(opcao != 6);
    }

    private static void cadastrarAmbiente(Map<String, Dicionario> mapa) {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente (ex: F07):");
        if (chave == null || chave.trim().isEmpty()) return;
        chave = chave.toUpperCase();

        if(mapa.containsKey(chave)){
            JOptionPane.showMessageDialog(null, "Erro: Ambiente já cadastrado!");
        } else {
            String descricao = JOptionPane.showInputDialog("Digite a descrição do ambiente:");
            // Obtém a data e hora atuais e aplica formato
            String dataHora = LocalDateTime.now().format(FORMATADOR);
            
            mapa.put(chave, new Dicionario(chave, descricao, dataHora));
            salvarNoArquivo(mapa);
            // Usa showMessageDialog para exibir resultados
            JOptionPane.showMessageDialog(null, "Ambiente cadastrado com sucesso!\nRegistrado em: " + dataHora);
        }
    }

    private static void listarAmbientes(Map<String, Dicionario> mapa) {
        if(mapa.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.");
            return;
        }
        
        StringBuilder sb = new StringBuilder("---- Lista de ambientes ----\n\n");

        // Percorre o mapa com entrySet()
        for(Map.Entry<String, Dicionario> entry : mapa.entrySet()){
            Dicionario d = entry.getValue();
            sb.append("Chave: ").append(entry.getKey())
              .append(" | Descrição: ").append(d.getDescricao())
              .append(" | Modificado em: ").append(d.getDataRegistro()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void pesquisarAmbiente(Map<String, Dicionario> mapa) {
        String chave = JOptionPane.showInputDialog("Digite o código para pesquisar:");
        if (chave == null || chave.trim().isEmpty()) return;
        chave = chave.toUpperCase();

        if(mapa.containsKey(chave)){
            Dicionario d = mapa.get(chave);
            String resultado = "Ambiente Encontrado:\n" +
                               "Código: " + d.getLaboratorio() + "\n" +
                               "Descrição: " + d.getDescricao() + "\n" +
                               "Data de Registro: " + d.getDataRegistro();
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void excluirAmbiente(Map<String, Dicionario> mapa) {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente para excluir:");
        if (chave == null || chave.trim().isEmpty()) return;
        chave = chave.toUpperCase();

        if(mapa.containsKey(chave)){
            mapa.remove(chave);
            salvarNoArquivo(mapa);
            JOptionPane.showMessageDialog(null, "Ambiente excluído com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado para exclusão.");
        }
    }

    private static void alterarAmbiente(Map<String, Dicionario> mapa) {
        String chave = JOptionPane.showInputDialog("Digite o código do ambiente para alterar:");
        if (chave == null || chave.trim().isEmpty()) return;
        chave = chave.toUpperCase();

        if(mapa.containsKey(chave)){
            String novaDescricao = JOptionPane.showInputDialog("Digite a nova descrição:");
            String novaDataHora = LocalDateTime.now().format(FORMATADOR); // Atualiza a data
            
            Dicionario d = mapa.get(chave);
            d.setDescricao(novaDescricao);
            d.setDataRegistro(novaDataHora);
            
            salvarNoArquivo(mapa);
            JOptionPane.showMessageDialog(null, "Ambiente alterado com sucesso!\nAtualizado em: " + novaDataHora);
        } else {
            JOptionPane.showMessageDialog(null, "Ambiente não encontrado.");
        }
    }

    // manipulação de arquivos

    private static void carregarDoArquivo(Map<String, Dicionario> mapa){
        File arquivo = new File(NOME_DO_ARQUIVO);
        BufferedReader br = null;
        FileReader fr = null;

        try {
            if(!arquivo.exists()){
                arquivo.createNewFile();
                return;
            }
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            String linha;
            while((linha = br.readLine()) != null){
                String[] partes = linha.split(";");
                // Agora espera 3 partes (Chave, Descricao, Data)
                if(partes.length >= 2){
                    String chave = partes[0];
                    String descricao = partes[1];
                    String dataRegistro = partes.length == 3 ? partes[2] : "Data Indisponível";
                    mapa.put(chave, new Dicionario(chave, descricao, dataRegistro));
                }
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void salvarNoArquivo(Map<String, Dicionario> mapa) {
         //Grava no .txt com FileWriter e try-with-resources
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(NOME_DO_ARQUIVO))) {
            for (Dicionario d : mapa.values()) {
                // Salva os 3 atributos separados por ponto e vírgula
                bw.write(d.getLaboratorio() + ";" + d.getDescricao() + ";" + d.getDataRegistro());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
}
