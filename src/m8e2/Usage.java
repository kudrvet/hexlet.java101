package m8e2;

import java.util.Arrays;

/**
 * Created by kudrv on 24.02.2017.
 */
public class Usage {

    public static void main(String[] args) {
        University leti = new University("leti","Popova");
        University.Student i= University.createStudent(leti,"vasya",23);
        System.out.println(i);
    }
}
