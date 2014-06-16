package nl.finan.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Step {

    private static final Logger LOGGER = LoggerFactory.getLogger(Step.class);

    @Given("this is a given step")
    public void test(){
        LOGGER.info("Log! ");
    }
}