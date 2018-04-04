package com.boa.cashfilm;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boa.cashfilm.item.dto.Item;
import com.boa.cashfilm.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	ItemService itemService;
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

	// cfmyitem 주문상품 등록 Action
	@RequestMapping(value="/item/insertCfMyItem", method=RequestMethod.POST)
	public String insertCfMyItem(Item item) {
		itemService.insertCfMyItem(item);
		return "redirect:/item/itemList";
	}
	
	// cfmyitem 주문상품 등록 Form
	@RequestMapping(value="/item/insertCfMyItem", method=RequestMethod.GET)
	public String insertCfMyItem() {
		return "item/insertCfMyItem";
	}
	
	// cfmyitem 상품전체조회
	@RequestMapping(value="/item/itemList", method=RequestMethod.GET)
	public String selectCfMyItem(Model model) {
		List<Item> list = itemService.selectCfMyItem();
		model.addAttribute("list", list);
		return "item/itemList";
	}
	
	// cfmyitem 상품수정 Action
	@RequestMapping(value="/item/updateCfMyItem", method=RequestMethod.POST)
	public String updateCfMyItem(Item item) {
		itemService.updateCfMyItem(item);
		return "redirect:/item/itemList";
	}
	
	// cfmyitem 상품수정 Form
	@RequestMapping(value="/item/updateCfMyItem", method=RequestMethod.GET)
	public String updateCfMyItem(Model model, @RequestParam(value="myItemCode") int myItemCode) {
		Item item = itemService.selectAndupdateCfMyItem(myItemCode);
		model.addAttribute("item", item);
		return "item/updateCfMyItem";
	}
	
	// cfmyitem 상품삭제 Action
	@RequestMapping(value="/item/deleteCfMyItem", method=RequestMethod.GET)
	public String deleteCfMyItem(Item item) {
		itemService.deleteCfMyItem(item);
		return "redirect:/item/itemList";
	}
	
}
