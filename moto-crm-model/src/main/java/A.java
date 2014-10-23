/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class A {
    
    public int i = 1;
    
    public class B {
        
        public int i = 1;
        
        public class C {
            public void m() {
                A.this.i = 3;
            }
        }
        
    }
    
    public static void main(String[] args) {
        A a = new A();
        A.B b =  a.new B();
        A.B.C c = b.new C();
    }
    
}
