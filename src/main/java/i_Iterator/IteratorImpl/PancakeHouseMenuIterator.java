package i_Iterator.IteratorImpl;

import i_Iterator.Iterator;

import java.util.ArrayList;

/**
 * Created by ll on 17/05/2018.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object o = items.get(position);
        position++;
        return o;
    }
}
