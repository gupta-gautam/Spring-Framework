package com.tight.coupling;

// A - MySQL , PostGreSQL
// B - Web Service , MongoDB

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
