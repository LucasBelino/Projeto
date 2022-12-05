/**
 * Classe para manipular o registro, leitura e exclusao de novos funcionarios
 * Utiliza-se a manipualacao de arquivos para as funcoes citadas acima
 * @author Lucas Belino
 * @version 1.0.5
 */
package br.inatel.projetopoo.control; //Diretório

//Imports
import br.inatel.projetopoo.model.Funcionarios;
import java.io.*;
import java.util.ArrayList;

public class ArqFuncionarios {
    /**
     * Método para armazenar os dados no arquivo
     * @param u
     */
    public void registrar(Funcionarios u) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("Funcionarios.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            String linhaEscrever;

            bw.write("Funcionario");// Parametro de leitura
            bw.newLine();
            bw.write(u.nome + "\n");
            bw.write(u.registro + "\n");
            bw.write(u.cpf + "\n");
            bw.write(u.endereco + "\n");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close(); //tentando fechar evitando lixo
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * Método para leitura do arquivo de funcionarios
     * @return
     */
    public ArrayList<Funcionarios> ler() {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        ArrayList<Funcionarios> encontrado = new ArrayList<>(); //Aceitando somente objetos de funcionarios

        try {
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) { //Enquanto o "cursor" não chegar numa linha vazia
                if (linhaLer.contains("Funcionario")) {
                    Funcionarios aux = new Funcionarios();

                    aux.nome = br.readLine();
                    aux.registro = Integer.parseInt(br.readLine()); //Convertendo dado recebido para inteiro
                    aux.cpf = br.readLine();
                    aux.endereco = br.readLine();
                    encontrado.add(aux); //inserindo no ArrayList
                }
                linhaLer = br.readLine(); //retornando no inicio
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return encontrado;
    }

    /**
     * Funcao de exclusao
     * Necessaria melhoria
     * @version 1.0.0
     */
    /*public ArrayList<Funcionarios> excluir() {
        File fil = new File("Funcionarios.txt");

        try {
            FileReader fr = new FileReader(fil);
            BufferedReader br = new BufferedReader(fr);

            String linha = br.readLine();
            ArrayList<String> save = new ArrayList<>();

            while (linha != null) {
                if (linha.equals() == false) {
                    save.add(linha);
                }
                linha = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(fil, true);
            fw2.close();

            FileWriter fw = new FileWriter(fil);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < save.size(); i++) {
                bw.write(save.get(i));
                bw.newLine();
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }*/
}

