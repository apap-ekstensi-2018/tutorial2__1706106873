package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PageController
{
 @RequestMapping("/hello")
 public String index ()
 {
 return "hello";
 }

 @RequestMapping("/greeting")
 public String greeting (@RequestParam(value="aa") String aa, Model model){
	 model.addAttribute("aa",aa);
	 return "greeting";
 }
 /*
 @RequestMapping(value = {"/greeting", "greeting/{name}"})
 public String greetingPath(@PathVariable Optional<String> name, Model model) {
 if (name.isPresent()) {
 model.addAttribute("name", name.get());
 } else {
 model.addAttribute("name", "apap");
 }
 return "greeting";
 }*/
 @RequestMapping("/perkalian")
 public String perkalian ( Optional<Integer> a, Optional<Integer> b, Model model){
	 if (a.isPresent()) {
		 model.addAttribute("a", a.get());
		 } else {
		 model.addAttribute("a", 0);
		 }
	 if (b.isPresent()) {
		 model.addAttribute("b", b.get());
		 } else {
		 model.addAttribute("b", 0);
		 }
	 return "perkalian";
 }



}