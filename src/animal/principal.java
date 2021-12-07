/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author IFSC
 */
public class principal {
    public static void main(String[] args) {
        mamifero baleia = new mamifero();
        baleia.setAltura(23);
        baleia.setComer("carnivoro");
        baleia.setFamilia("marinha");
        baleia.setQntPeso(2000);
        baleia.imprimemamifero();
        
    }
}
