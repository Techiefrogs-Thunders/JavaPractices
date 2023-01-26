package pack1;

import java.io.IOException;

public class OverrindinException {

    void display(){

    }
    void otherdisplay() throws IOException{

    }
    public static void main(String[] args) {
    
    }
}

class child extends OverrindinException{
    void display() throws ArithmeticException{

    }
    void otherdisplay() throws IOException{

    }
}
