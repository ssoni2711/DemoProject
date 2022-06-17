package com.javatpoint.controller;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
public class BooksTestController {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	BooksService booksService;

	@Test
	public void getAllBooks() throws Exception {

		int id = 5;
		
		when(booksService.getBooksById(id)).thenReturn(new Books());
		
		this.mockMvc.perform(get("/book/5").contentType(MediaType.APPLICATION_JSON));
		
		verify(booksService, atLeast(1)).getBooksById(id);
		
	}
}
