package com.sau;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class Add {  
@RequestMapping("/add")  
    public String display()  
    {  
        return "viewpages.jsp";
    }     
}  