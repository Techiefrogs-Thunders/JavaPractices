package Enums;

import javax.swing.plaf.synth.SynthSpinnerUI;

enum Enum3 {
    winter(10),spring(4);
    private int value;
    Enum3(int value){
        this.value=value;
    }
    public static void main(String[] args) {
        for(Enum3 e3:Enum3.values()){
            System.out.println(e3+" "+e3.value+" "+e3.ordinal());
        }
    }
}
