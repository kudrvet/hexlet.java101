package old;

import static java.lang.Math.random;

/**
 * Created by kudrv on 26.01.2017.
 */
public class B {

    double[]nums;
    void primer() {
        int size=(int)(random()*10);
         nums=new double[size];
        for( int x=0;x<nums.length;x++) {
            nums[x]= random()*5;
        }

    }

}
