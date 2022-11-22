package package2;

import package1.Ex6Interface;

public class Ex6Base {
     protected class Ex6BaseInner implements Ex6Interface {
     public String say() { return "Hi"; }
     }
     public Ex6BaseInner getEx6BaseInner() {
    
     return new Ex6BaseInner();
     }
    }
