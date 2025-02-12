// package com.example.fitnessapp.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.multipart.MultipartFile;
// import org.springframework.web.servlet.ModelAndView;

// import com.example.fitnessapp.entity.Image;
// import com.example.fitnessapp.service.ImageService;

// import jakarta.servlet.http.HttpServletRequest;
// import javax.sql.rowset.serial.SerialException;
// import java.io.IOException;
// import java.sql.Blob;
// import java.sql.SQLException;
// import java.util.List;

// @Controller
// @RequestMapping("/api/r")
// public class ClientController {
//     @Autowired
//     private ImageService imageService;

//     @GetMapping("/ping")
//     @ResponseBody
//     public String hello_world(){
//         return "Hello World!";
//     }

//     // display image
//     @GetMapping("/display")
//     public ResponseEntity<byte[]> displayImage(@RequestParam("id") long id) throws IOException, SQLException
//     {
//         Image image = imageService.viewById(id);
//         byte [] imageBytes = null;
//         imageBytes = image.getImage().getBytes(1,(int) image.getImage().length());
//         return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
//     }

//     // view All images
//     @GetMapping("/get")
//     @CrossOrigin(origins = "http://localhost:3000")
//     public ModelAndView home(){
//         ModelAndView mv = new ModelAndView("index");
//         List<Image> imageList = imageService.viewAll();
//         mv.addObject("imageList", imageList);
//         return mv;
//     }

//     // add image - get
//     @GetMapping("/add")
//     public ModelAndView addImage(){
//         return new ModelAndView("addimage");
//     }

//     // add image - post
//  @CrossOrigin(origins = "http://localhost:3000")
//     @PostMapping("/add")
//     public String addImagePost(HttpServletRequest request,@RequestParam("image") MultipartFile file) throws IOException, SerialException, SQLException
//     {
//         byte[] bytes = file.getBytes();
//         Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);

//         Image image = new Image();
//         image.setImage(blob);
//         imageService.create(image);
//         return "redirect:/";
//     }
// }
