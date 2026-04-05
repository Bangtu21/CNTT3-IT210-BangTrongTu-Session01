package com.example.session01.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//(Lớp định nghĩa Bean)
@Component
public class SystemConfig {
    @Value("Bàng Trọng Tú")
    private String branchName;

    @Value("9:00")
    private String openingHours;

    public void display(){
        System.out.println("Tên: "+branchName);
        System.out.println("Giờ mở của: "+openingHours);
    }
}
