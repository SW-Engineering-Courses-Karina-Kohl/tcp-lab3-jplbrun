public abstract class FiguraGeometrica implements CalculosGeometricos{
    private int id;
    private String cor;
    private static int totaFiguras; 

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public FiguraGeometrica(String cor){
        this.cor = cor;
        this.id = 0;
        this.totaFiguras++;
    }
}