package com.example.bigbasket_ecom.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.bigbasket_ecom.Model.Product;
import com.example.bigbasket_ecom.Repository.*;
import com.example.bigbasket_ecom.Service.ProductService;

@RestController
//@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
    
    @Autowired
    private ProductRepository productRepository; 
    
    @Autowired
    private ProductService productService;
    
    @SuppressWarnings("null")
    @PostMapping("/createProduct")
    public boolean addProduct(@RequestBody Product product) {
  
        productRepository.save(product);
       return true;
    }
    // @PostMapping("/createProduct")
    // public ResponseEntity<Product> handlePostRequest(@RequestBody Product product) {
    //     // Process the request body or perform other logic
    //     productRepository.save(product);
    //     return new ResponseEntity<>(HttpStatus.OK);
    // }

    @GetMapping("/getProductById/{Id}")
    public Optional<Product> getProductById(@PathVariable int Id) {
        return productRepository.findById(Id);
    }

    @GetMapping("/getAllProductsByCategoryId/{categoryId}")
    public List<Product> getAllProductsByCategoryId(@PathVariable int categoryId) {
        return productRepository.findAllBycategoryId(categoryId);
    }
    
    @GetMapping("/getAllProducts")
    public List<Product> index(Model model){
        
        return productRepository.findAll();
    }
    // @GetMapping("/getAllProducts")
    // public ResponseEntity<List<Product>> getAllProducts() {
    //     List<Product> data = productRepository.findAll();
    //     return ResponseEntity.ok(data);
    // }
    @DeleteMapping("/deleteProductById/{id}")
    public boolean deleteProductById(@PathVariable int id,Model model)
    {
        productRepository.deleteById(id);
        return true;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product updateProduct) {
        Product updatedEntity = productService.updateProduct(id, updateProduct);
        return ResponseEntity.ok(updatedEntity);
    }

    @GetMapping("/search")
    public List<Product> getAllProductsByName(@RequestParam String productName) {
        return productRepository.findAllByProductName(productName);
    }


}
