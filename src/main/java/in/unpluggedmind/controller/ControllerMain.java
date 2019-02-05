/**
 * 
 */
package in.unpluggedmind.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class ControllerMain {

	@RequestMapping("/")
	public String welcome() {
		return "Interfaces Alive and Kicking";
	}

	@RequestMapping(value="/iso", method = RequestMethod.POST)
	@ResponseBody
	public String acceptISO8583(@RequestBody String msg) 
	{
		System.out.println("Interfaces [" + getClass().getName() + "]");
		System.out.println("Msg received [" + msg + "]");
		
		String RspMsg = Accept.parseISO(msg);
		
		if (msg == null) {
			return (  "Interfaces [" + getClass().getName() + "] Request  [Message is Null]" + "\n"
					+ "Interfaces [" + getClass().getName()	+ "] Response [Failed Processing. No Response Message]");
		} else {
			return (  "Interfaces [" + getClass().getName() + "] Request  [" + msg + "]" + "\n" 
					+ "Interfaces [" + getClass().getName() + "] Response [" + RspMsg.toString() + "]");
		}

	}
	
}
