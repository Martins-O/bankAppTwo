package listImplement;

import java.util.Iterator;

public class MyArrayListImpl<E> implements MyList<E> {

    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public MyArrayListImpl(){}
    public MyArrayListImpl(E[] objects){
        for (int index = 0; index < objects.length; index++) {
            add(objects[index]);
        }
    }

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: "+ index + "Size: "+size);

        ensureCapacity();
        for (int element = size - 1; element >= index ; element--) {
            data[element + 1] = data[element];
            data[index] = e;

            size++;
        }
    }

    private void ensureCapacity(){
        if (size >= data.length){
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int lastIndexOf(E e) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object e) {
        for (int element = 0; element < size; element++) {
            if(e.equals(data[element]))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
}

