package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.RamenService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ExtendWith(MockitoExtension.class)
class RamenControllerTest {

    @Mock
    private RamenService ramenService;

    @InjectMocks
    private RamenController ramenController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(ramenController).build();
    }

    @Test
    void test_status_is_ok_and_return_value_for_view() throws Exception{
        mockMvc.perform(get("/ramen/findall"))
                .andExpect(status().isOk())
                .andExpect(view().name("Ramen/findall"));
    }
}