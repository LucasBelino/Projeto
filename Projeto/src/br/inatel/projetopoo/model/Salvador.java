/**
 * Classe herda metodos da classe Unidade
 * Classe da unidade de Salvador
 * @version 15.08.2018
 */
package br.inatel.projetopoo.model; //Diretório

//Imports
import br.inatel.projetopoo.control.Unidade;
import br.inatel.projetopoo.interfaces.Promocoes;

public class Salvador extends Unidade implements Promocoes {

    @Override
    public void mostraTintas() {
        System.out.println("-= Tintas =-\n");
        System.out.println("1 - Acrilica");
        System.out.println("2 - Esmalte\n");
    }

    @Override
    public void bonificacao() {
        System.out.println("-= Bonificacao =-\n");
        System.out.println("Requisito: 100 vendas");
        System.out.println("Bonificacao: 8% x valor final das vendas\n");
    }

    @Override
    public void fundacao() {
        System.out.println("A unidade foi fundada em 15/08/2018");
    }

    @Override
    public void endereco() {
        System.out.println("Endereco: Rodovia BA-526 - Jardim das Margaridas, Salvador - BA, 40001-970\n");
    }
}
