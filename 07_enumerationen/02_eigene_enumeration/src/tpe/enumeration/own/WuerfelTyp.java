package tpe.enumeration.own;

public enum WuerfelTyp {
    D4(4), D6(6), D8(8), D10(10), D12(12);
    
    public int seiten;
    
    WuerfelTyp(int i){
        this.seiten = i;
    }
    
    public double average(){
        return (seiten + 1) / 2;
    }
}