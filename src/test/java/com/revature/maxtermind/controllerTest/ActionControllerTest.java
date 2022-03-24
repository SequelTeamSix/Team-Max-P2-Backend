package com.revature.maxtermind.controllerTest;

import com.revature.maxtermind.controller.ActionController;
import com.revature.maxtermind.service.ActionService;
import com.revature.maxtermind.service.EmployeeService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ContextConfiguration
@AutoConfigureMockMvc
@EnableWebMvc
@SpringBootTest(classes = ActionController.class)
public class ActionControllerTest {

    JSONObject jsonRequest;
    JSONObject jsonReturn;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ActionService service;
}
