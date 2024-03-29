package com.patterns.Composite.menuiterator;

import java.util.Iterator;

public final class NullIterator implements Iterator {

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
