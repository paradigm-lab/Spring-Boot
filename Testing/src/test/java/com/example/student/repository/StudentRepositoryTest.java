package com.example.student.repository;

import com.example.student.entity.Gender;
import com.example.student.entity.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckWhenStudentEmailExists() {

        // Given (Call the Service Layer)
        String email = "facade@gmail.com";
        Student student = new Student(
                "Facade",
                email,
                Gender.MALE
        );
        underTest.save(student);

        // When
        Boolean expected = underTest.selectExistsEmail(email);

        // Then
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckWhenStudentEmailDoesNotExists() {

        // Given (Call the Service Layer)
        String email = "facade@gmail.com";

        // When
        Boolean expected = underTest.selectExistsEmail(email);

        // Then
        assertThat(expected).isFalse();
    }
}