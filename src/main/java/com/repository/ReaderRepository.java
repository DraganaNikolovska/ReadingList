package com.repository;

import com.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Dragana.Nikolovska on 11/2/2016.
 */
@Repository
public interface ReaderRepository extends JpaRepository<Reader, String> {

}
