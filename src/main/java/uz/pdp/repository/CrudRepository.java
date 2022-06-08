package uz.pdp.repository;

import java.util.List;

public interface CrudRepository<T,K> {
    K create(T object);

    List<K> read();

    K findStudentById(int id);

     K update(T object);

    K delete(int id);
}
