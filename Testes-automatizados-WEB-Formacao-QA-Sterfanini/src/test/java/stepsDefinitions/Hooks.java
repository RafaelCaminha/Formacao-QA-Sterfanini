package stepsDefinitions;

import io.cucumber.java.*;
import static utils.Utils.*;

public class Hooks {
    
    @Before
    public void setUp(){
        acessarSistema();
        
    }
    @After
    public void tearDown() {
        driver.quit();
        
    }
}
