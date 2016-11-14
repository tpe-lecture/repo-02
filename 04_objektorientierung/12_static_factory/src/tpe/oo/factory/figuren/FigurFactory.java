package tpe.oo.factory.figuren;

public class FigurFactory {

    public Figur createFigur(){
        int i = (int)(Math.random() * 10); 
        if (i % 3 == 0) {
            return new Lady(board);    
        }
        else if (i % 3 == 1) {
            return new Ninja();    
        }
        else { // i % 3 == 2
            return new Wizard();
        }
    }
}
