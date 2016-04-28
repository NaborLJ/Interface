/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author Nabor
 */
public class Can extends Animal{
    private String raza;

    public Can(String nome,String raza) {
        super(nome);
        this.raza=raza;
    }
    
    @Override
    public void falar() {
        System.out.println("GUAU GUAU");
    }
    public void andar(){
        System.out.println("anda o can");
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Can{" + "nome "+this.getNome()+" raza=" + raza + '}';
    }
}
