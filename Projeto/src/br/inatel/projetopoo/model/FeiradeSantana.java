/**
 * Classe herda metodos da classe Unidade
 * Classe da unidade de Feira de Santana
 * @version 10.04.1999
 */
package br.inatel.projetopoo.model; //Diretorio

//Imports
import br.inatel.projetopoo.control.Unidade;
import br.inatel.projetopoo.interfaces.Promocoes;

public class FeiradeSantana extends Unidade implements Promocoes {

    @Override
    public void mostraTintas() {
        System.out.println("-= Tintas =-\n");
        System.out.println("1 - Esmalte");
        System.out.println("2 - Latex PVA\n");
    }

    @Override
    public void bonificacao() {
        System.out.println("-= Bonificacao =-\n");
        System.out.println("Nao ha promocao ativa nesta unidade\n");
    }

    @Override
    public void fundacao() {
        System.out.println("A unidade foi fundada em 10/04/1999");
    }

    @Override
    public void endereco() {
        System.out.println("Endereco: Praca Pres.Mwdici, 92 - Centro, Feira de Santana - BA, 44001-696\n");
    }
}
