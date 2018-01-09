package Josen.SpringTest;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class MessageConfig
{
       
    @Bean(name = "appMain")
    public App CreateAppMain()
    {
        return new App();
    }
    
}
