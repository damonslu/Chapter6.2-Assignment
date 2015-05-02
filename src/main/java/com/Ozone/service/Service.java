/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/
package com.Ozone.service;

import java.util.List;

/**
 *
 * @author Lucrecia
 */
public interface Service<T, ID> {

    public T findById(final ID id);

    public List<T> findAll();

    public void persist(final T entity);

    public void merge(final T entity);

    public void remove(final T entity);

    public void removeById(final Long entityId);

    public List<T> findInRange(int firstResult, int maxResults);

    public long count();

    public T getByCustomerName(String name, String value);

    public List<T> getOrderByCustomerName(String name, String value);
}
