/**
 * Programa para a empresa Ink's - Fornecedora de tintas
 * Classe principal de manipulacao do programa
 * @version 1.0.5
 * @author Lucas Belino da Silva
 */
package br.inatel.projetopoo.control; //Diretório

//Imports
import br.inatel.projetopoo.model.FeiradeSantana;
import br.inatel.projetopoo.model.Funcionarios;
import br.inatel.projetopoo.model.Recife;
import br.inatel.projetopoo.model.Salvador;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArqFuncionarios arq = new ArqFuncionarios();
        Funcionarios f = new Funcionarios();
        FeiradeSantana fs = new FeiradeSantana();
        Recife rc = new Recife();
        Salvador sa = new Salvador();

        boolean flag =  true;

        //Interacao com o usuario
        while (flag)
        {
            System.out.println("-=-=-=-  Ink's -=-=-=-\n");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Funcionarios ativos");
            System.out.println("3 - Unidade Especifica");
            //System.out.println("4 - Excluir funcionario"); Necessaria melhoria
            System.out.println("0 - Finalizar\n");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op)
            {
                case 1:
                    System.out.println("Digite o nome: ");
                    f.nome = sc.nextLine();
                    System.out.println("Digite o registro: ");
                    f.registro = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o CPF: ");
                    f.cpf = sc.nextLine();
                    System.out.println("Digite o endereco: ");
                    f.endereco = sc.nextLine();

                    arq.registrar(f);
                    System.out.println("Funcionario Cadastrado!");
                    break;

                case 2:
                    ArrayList<Funcionarios> funcs = arq.ler();
                    for (int i=0; i< funcs.size(); i++)
                    {
                        System.out.println("-= " + funcs.get(i).nome + " =-"+"\n");
                        System.out.println("Registro: " + funcs.get(i).registro);
                        System.out.println("CPF: " + funcs.get(i).cpf);
                        System.out.println("Endereco: "+ funcs.get(i).endereco+"\n");
                    }
                    break;
                case 3:
                    System.out.println("Qual unidade deseja verificar?");
                    System.out.println("1 - Recife");
                    System.out.println("2 - Feira de Santana");
                    System.out.println("3 - Salvador\n");

                    int dc = sc.nextInt();
                    sc.nextLine();

                    switch (dc)
                    {
                        case 1:
                            System.out.println("-=-=-=-  Recife -=-=-=-\n");
                            rc.fundacao();
                            rc.endereco();
                            rc.mostraTintas();
                            rc.bonificacao();
                            break;
                        case 2:
                            System.out.println("-=-=-=-  Feira de Santana -=-=-=-\n");
                            fs.fundacao();
                            fs.endereco();
                            fs.mostraTintas();
                            fs.bonificacao();
                            break;
                        case 3:
                            System.out.println("-=-=-=-  Salvador -=-=-=-\n");
                            sa.fundacao();
                            sa.endereco();
                            sa.mostraTintas();
                            sa.bonificacao();
                            break;
                    }
                break;
                /*case 4:
                    ArrayList<Funcionarios> fun = arq.excluir();

                    System.out.println("Insira o registro do funcionario: ");
                    int reg = sc.nextInt();
                    sc.nextInt();

                    for (int i=0; i< fun.size(); i++)
                    {
                        if(fun.get(i).registro == reg)
                        arq.excluir(reg);
                    }
                break;*/
                case 0:
                    flag = false;
                    System.out.println("Finalizado!");
                    System.out.println("(Ink's) colorindo seu mundo :D");
                    break;
                default:
                    System.out.println("Entre com uma opção valida!");
                    break;
            }
        }


    }

}