package m7e3_List;

import java.util.Arrays;

/*void add(final Object element)
        Принимает на вход новый элемент и добавляет его в List. Соотвественно после вызова этого метода size листа должен вырости на 1.

        void removeLast()
        Удаляет последний элемент из листа.

        int size()
        Возвращает размер (длинну) листа

        Object get(final int index)
        Возвращает элемент сохраненный по определенному индексу. Например:

final List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.get(0); // return 1
        l.get(1); // return 2
        l.get(2); // return 3
        если индекс указа на вход больше чем size листа или же меньше чем 0, то метод должен вернуть null.

        void set(final int index, final Object object)
        Метод перезаписывает определенную ячеку листа новым значением, пример:

final List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.get(0); // return 1
        l.get(1); // return 2
        l.get(2); // return 3
        l.set(1, 11);
        l.get(1); // return 11 */
public class ArrayList implements  IList {

    private  int size;

    private Object [] list=new Object[3];

    public void add(final Object element){
        if(size==list.length) {
            list= Arrays.copyOf(list,list.length+1);
        }
        list[size]=element;
        size++;
    }

    public void removeLast(){
        list=Arrays.copyOf(list,size-1);
        size--;
    }

    public int size() {
        return size;
    }

    public Object get(final int index){

        if(index<0||index>size) {
            return null;
        }
        return list[index];
    }

    public void set(final int index, final Object object){
    list[index]=object;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) ;

    }

    public static void main(String[] args) {
        IList list=new ArrayList();
        list.add("q");
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.removeLast();
        list.set(1,"num");

        System.out.println("Размер = "+list.size());
        System.out.println(list);
        System.out.println(list.get(6));
    }

}
