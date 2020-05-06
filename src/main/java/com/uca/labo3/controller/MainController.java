package com.uca.labo3.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.labo3.domain.Product;

@Controller
public class MainController {
    private List<Product> productos = new ArrayList<Product>();

    @GetMapping("/compraProducto")
    public ModelAndView compra() {
	ModelAndView mav = new ModelAndView();
	productos.add(new Product(0, "Nintendo Switch", "22"));
	productos.add(new Product(1, "PS4", "25"));
	productos.add(new Product(2, "Xbox One", "50"));
	productos.add(new Product(3, "PS3", "69"));
	productos.add(new Product(4, "Wii U", "100"));
	mav.setViewName("index");
	mav.addObject("product", new Product());
	mav.addObject("productos", productos);
	return mav;
    }

    @PostMapping("/validar")
    public ModelAndView validar(Product producto) {
	ModelAndView mav = new ModelAndView();
	mav.addObject("nombre", productos.get(producto.getId()).getNombre());
	int stockProduct = Integer.parseInt(productos.get(producto.getId()).getCantidad());
	int requiredStock = Integer.parseInt(producto.getCantidad());
	if (requiredStock > stockProduct) {
	    mav.setViewName("error");
	} else {
	    mav.setViewName("compra");
	}
	return mav;
    }
}
