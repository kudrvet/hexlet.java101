package old;

/**
 * Created by kudrv on 16.02.2017.
 */
public enum Figure {
    X("X"),O("0");

    private String figure;

    Figure(String figure){
        this.figure=figure;
        }

    public String getFigure(){
        return figure;
        }

}
