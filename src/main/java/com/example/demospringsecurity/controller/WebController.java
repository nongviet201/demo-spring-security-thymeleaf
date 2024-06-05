package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    // Ai cũng có thể truy cập
    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }


    // Có role USER mới truy cập được
    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/user/info")
    public String getUserInfo() {return "user-info";}



    // Có role ADMIN mới truy cập được
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("/admin/dashboard")
    public String getAdminDashboard() {return "admin/dashboard";}

    @GetMapping("/admin/manage/user")
    public String getAdminManagerUser() {return "admin/manage-user";}

    @GetMapping("/admin/manage/category")
    public String getAdminManagerCategory() {return "admin/manage-category";}

    @GetMapping("/admin/manage/product")
    public String getAdminManagerProduct() {return "admin/manage-product";}

    @GetMapping("/admin/manage/brand")
    public String getAdminManagerBrand() {return "admin/manage-brand";}

    @GetMapping("/admin/manage/order")
    public String getAdminManagerOrder() {return "admin/manage-order";}

    @GetMapping("/admin/manage/blog")
    public String getAdminManagerBlog() {return "admin/manage-blog";}
}
