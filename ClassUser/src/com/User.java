package com;

public class User {


        private Integer uid;
        public String username;
        String password;
        protected char gender;


        public User() {


        }


        public User(Double d, String str) {


        }


        public void Register() {
            System.out.println("user register");
        }


        public boolean Login(String name) {
            System.out.println("user login --- " + name);
            return true;
        }
    }
