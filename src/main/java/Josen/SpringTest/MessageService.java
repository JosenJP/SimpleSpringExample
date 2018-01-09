/**
 * 
 */
package Josen.SpringTest;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *
 */
@Component
public class MessageService implements IMessageService
{

    public String getMessage()
    {
        // TODO Auto-generated method stub
        return "Message is working";
    }

}
