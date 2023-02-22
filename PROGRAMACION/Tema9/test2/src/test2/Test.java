/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author rutvac
 */
public class Test<T,U> {
    T obj;
    U onj;
    
    Test(T obj,U onj){
        this.obj=obj;
        this.onj=onj;
    }
    public void print(){
        System.out.println(obj);
        System.out.println(onj);
    }
}
