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
public class Gato extends Animal{
    String cor;

    public Gato(String nome,String cor) {
        super(nome);
        this.cor=cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void falar() {
        System.out.println("Meow meow");
    }

    @Override
    public String toString() {
        return "Gato{" +"nome "+this.getNome()+ " cor=" + cor + '}';
    }
    
}
