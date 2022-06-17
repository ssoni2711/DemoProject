package com.javatpoint.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.javatpoint.repository.BooksRepository;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

	@InjectMocks
	BooksService booService;

	
	@Mock
	BooksRepository booksRepository;	
	
	public void getAllBooks() throws Exception {

	//	List<>
	//	when(booksRepository.findAll()).thenReturn();
		
	}

}
