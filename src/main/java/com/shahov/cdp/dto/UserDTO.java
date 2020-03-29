package com.shahov.cdp.dto;

import com.shahov.cdp.model.UserRole;

public class UserDTO extends DataClass {

    private String firstName;
    private String lastName;
    private String email;
    private UserRole userRole;

    public static UserDTO guest(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserRole(UserRole.GUEST);
        return userDTO;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
