package Josen.SpringTest;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Component
public class App 
{
    @Autowired
    private MessageService messageService;
    
    public MessageService MessageService()
    {
        return messageService;
    }
    
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.register(MessageConfig.class);
        appContext.refresh();
        
        try
        {
            App appMain = (App)appContext.getBean("appMain");

        
            MessageService messageService = appMain.MessageService();
            if (null != messageService)
            {
                System.out.println(messageService.getMessage());
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
        appContext.close();
    }
}
