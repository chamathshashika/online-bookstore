/**
 * 
 */
package com.chamath.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chamath.onlinebookstore.entity.Book;

/**
 * @author chamath
 *
 */

@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
