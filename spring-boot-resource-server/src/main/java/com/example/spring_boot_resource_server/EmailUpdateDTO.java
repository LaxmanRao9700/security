package com.example.spring_boot_resource_server;

public class EmailUpdateDTO {
	private String email;

    // Constructors (optional)
    public EmailUpdateDTO() {}
    public EmailUpdateDTO(String email) {
        this.email = email;
    }

    // Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
