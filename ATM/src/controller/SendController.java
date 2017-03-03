package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DAO.SendDAO;
import Models.SendModel;

@Controller
public class SendController {

	@Autowired
	SendDAO sDAO;
/*	@SuppressWarnings("null")
	@RequestMapping(value="/SendPrice" , method = RequestMethod.GET)
	public String SendPrice(ModelMap model) {
	      model.addAttribute("title", "Show Page for Student");
	      
	      return "SendPrice";
	   }*/
	
	   @SuppressWarnings("null")
	   @RequestMapping(value="/SendPrice" , method = RequestMethod.POST)
	   public void SendPriceSave(ModelMap model, HttpServletRequest req) {
		   String Price = req.getParameter("Price");
		   String CardId = req.getParameter("CardId");
		   
		   SendModel send = new SendModel();
		   
		   send.setPrice(Integer.parseInt(Price));
		   send.setCardId(Integer.parseInt(CardId));
		   
		   sDAO.insert(send);
	   }

}