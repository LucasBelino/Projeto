/**
 * Classe herda metodos da classe Unidade
 * Classe da unidade de Recife
 * @version 08.09.2004
 */
package br.inatel.projetopoo.model; //Diretorio

//Imports
import br.inatel.projetopoo.control.Unidade;
import br.inatel.projetopoo.interfaces.Promocoes;

public class Recife extends Unidade implements Promocoes {

    @Override
    public void mostraTintas() {
        System.out.println("-= Tintas =-\n");
        System.out.println("1 - Acrilica");
        System.out.println("2 - Esmalte");
        System.out.println("3 - Latex PVA\n");
    }

    @Override
    public void bonificacao() {
        System.out.println("-= Bonificacao =-\n");
        System.out.println("Requisito: 50 vendas");
        System.out.println("Bonificacao: 4% x valor final das vendas\n");
    }

    @Override
    public void fundacao() {
        System.out.println("A unidade foi fundada em 08/09/2004");
    }

    @Override
    public void endereco() {
        System.out.println("Endereco: Av. Caxanga, 990 - Madalena, Recife - PE, 50610-120\n");
    }
}
