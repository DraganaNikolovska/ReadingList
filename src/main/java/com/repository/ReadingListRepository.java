package com.repository;

import com.domain.Book;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dragana.Nikolovska on 11/1/2016.
 */
@Repository
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(String reader);
}
