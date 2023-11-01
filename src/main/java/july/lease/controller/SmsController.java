package july.lease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import july.lease.service.SmsService;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

@Controller
public class SmsController {
	
	@Autowired
	SmsService smsService;
	    
	// coolSMS 구현 로직 연결  
	@GetMapping("/check/sendSMS")
	public @ResponseBody String sendSMS(@RequestParam(value="to") String to) throws CoolsmsException {  	
		return smsService.PhoneNumberCheck(to);
	}
	
	// coolSMS 구현 로직 연결 
	@GetMapping("/check/sendPassword")
	public @ResponseBody String sendPassword(@RequestParam(value="to") String to) throws CoolsmsException {  	
		return smsService.TemporaryPassword(to);
	}
}
