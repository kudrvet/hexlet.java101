package old;

/**
 * Created by kudrv on 18.02.2017.
 */

//Метод должен выполнять преобразования с учетом следующих деталей:
//
//        массив длинной 3 или менее символов - метод должен преобразовать его в число. Пример: ['1', '2', '3'] в --> 123;
//        массив длиннее трех символов - последние должны быть проигнорированы. Пример: ['1', '2', '3', '4', '5', '6'] в --> 123 (а не 123456);
//        число может быть отрицательное (учитывать первые два требования). Пример: ['-', 1', '2', '3', '4', '5', '6'] в --> -12 (а не -123456);
//        пустой входящий массив - метод должен вернуть 0.
public class FromString {

    public static int fromString(final char[] chars) {
        // BEGIN (write your solution here)
        final int CHAR_SIZE=3;
        StringBuilder sb = new StringBuilder();

        if (chars.length==0) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
           sb.append(chars[i]);
            if (i==CHAR_SIZE-1) break;
        }
        System.out.println(sb.toString());
        return  Integer.parseInt(sb.toString());
        // END
    }


}
