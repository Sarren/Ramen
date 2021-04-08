package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.MeatNoMeatService;
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
class MeatNoMeatControllerTest {

    @Mock
    private MeatNoMeatService meatNoMeatService;

    @InjectMocks
    private MeatNoMeatController meatNoMeatController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(meatNoMeatController).build();
    }

    @Test
    public void test_findAll() throws Exception {
        mockMvc.perform(get("/meatnomeat/findall"))
                .andExpect(status().isOk())
                .andExpect(view().name("MeatNoMeat/findall"));
    }
}