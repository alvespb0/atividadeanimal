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
public class mamifero extends comer {
    String familia;
    void imprimemamifero(){
        System.out.println("peso: "+qntPeso+"KG");
        System.out.println("altura: "+altura+"metros");
        System.out.println("carnivoro ou herbivoro: "+comer);
        System.out.println("familia: "+familia);
    }
    
    public mamifero (){
        
    }
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
}
