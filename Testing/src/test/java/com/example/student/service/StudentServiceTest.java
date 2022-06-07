package com.example.student.service;

import com.example.student.entity.Gender;
import com.example.student.entity.Student;
import com.example.student.exception.BadRequestException;
import com.example.student.repository.StudentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;
    private AutoCloseable autoCloseable;
    private StudentService underTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new StudentService(studentRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllStudents() {
        // When
        underTest.getAllStudents();

        // Then
        verify(studentRepository).findAll();
    }

    @Test
    void canAddStudent() throws BadRequestException {

        // Given
        Student student = new Student(
                "Facade",
                "facade@gmail.com",
                Gender.FEMALE
        );

        // When
        underTest.addStudent(student);

        // Then
        ArgumentCaptor<Student> studentArgumentCaptor = ArgumentCaptor.forClass(Student.class);

        verify(studentRepository)
                .save(studentArgumentCaptor.capture());


        Student capturedStudent = studentArgumentCaptor.getValue();
        assertThat(capturedStudent).isEqualTo(student);
    }

    @Test
    void willThrowWhenEmailIsTaken() throws BadRequestException {

        // Given
        Student student = new Student(
                "Facade",
                "facade@gmail.com",
                Gender.FEMALE
        );

        given(studentRepository.selectExistsEmail(student.getEmail()))
                .willReturn(true);

        // When
        // Then
        assertThatThrownBy(() -> underTest.addStudent(student))
                .isInstanceOf(BadRequestException.class)
                .hasMessageContaining("Email " + student.getEmail() + " taken");

        verify(studentRepository, never()).save(any());
    }

    @Test
    @Disabled
    void deleteStudent() {
    }
}