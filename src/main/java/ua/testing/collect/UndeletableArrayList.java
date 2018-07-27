package ua.testing.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Class represents Undeletable ArrayList that extends ArrayList
 * All methods that can delete an element in the ArrayList throw an UnsupportedOperationException.
 * Unsupported methods are:
 *  <ul>
 *      <li> remove(int index)</li>
 *      <li> remove(Object o)</li>
 *      <li> clear()</li>
 *      <li> removeRange(int fromIndex, int toIndex)</li>
 *      <li> removeAll(Collection{@code <?>} c)</li>
 *      <li> retainAll(Collection{@code <?>} c)</li>
 *      <li> removeIf(Predicate{@code <? super E>} filter)</li>
 *  </ul>
 * @param <E> the type of elements in this list
 */
public class UndeletableArrayList<E> extends ArrayList<E> {

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  initialCapacity  the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
    public UndeletableArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public UndeletableArrayList() {
    }

    /**
     * Constructs a list containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param c the collection whose elements are to be placed into this list
     * @throws NullPointerException if the specified collection is null
     */
    public UndeletableArrayList(Collection<? extends E> c) {
        super(c);
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public E remove(int index){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean remove(Object o){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public void clear(){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean removeAll(Collection<?> c){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean retainAll(Collection<?> c){
        throw new UnsupportedOperationException("");
    }

    /**
     * Throws UnsupportedOperationException in case of use
     * @throws UnsupportedOperationException
     */
    @Override
    public boolean removeIf(Predicate<? super E> filter){
        throw new UnsupportedOperationException("");
    }
}
