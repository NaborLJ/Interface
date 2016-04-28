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
public abstract class Animal implements IAnimal{
    private String nome;
    
    public Animal (String nome){
        this.nome=nome;
    }
    public String getNome(){
       return nome;
    }
    public abstract void falar();
}
