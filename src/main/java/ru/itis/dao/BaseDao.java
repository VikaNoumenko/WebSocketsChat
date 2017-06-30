package ru.itis.dao;

import java.util.List;

/**
 * 04.05.2017
 * BaseDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface BaseDao<T> {
    T find(int id);
    int save(T model);
    void update(T model);
    void delete(int id);
    List<T> findAll();
}
