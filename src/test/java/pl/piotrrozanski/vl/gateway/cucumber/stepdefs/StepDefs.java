package pl.piotrrozanski.vl.gateway.cucumber.stepdefs;

import pl.piotrrozanski.vl.gateway.VirtualLibraryGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = VirtualLibraryGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
