package io.github.jhipster.fassas.cucumber.stepdefs;

import io.github.jhipster.fassas.FassasApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FassasApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
