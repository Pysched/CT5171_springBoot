package	org.example;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import	org.springframework.web.bind.annotation.GetMapping;
import	org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public	class	MyController	{
    @GetMapping("/")
    @ResponseBody
    public	String	index()	{
       DateTime time = DateTime.now();
       DateTime xmas = DateTime.parse("25/12/2023", DateTimeFormat.forPattern("dd/MM/yyyy"));
       int days = Days.daysBetween(time, xmas).getDays();
       return days + " days left to christmas ";
    }
    @RequestMapping ("/home")
        public String home(){
            return " index.html";

    }
}