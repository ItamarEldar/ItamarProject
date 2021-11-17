package com.example.itamarproject;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DataModel {
    static public ArrayList<User> users = new ArrayList<>();
    public static void saveUsers()
    {
        FirebaseDatabase.getInstance().getReference("users").setValue(DataModel.users);
    }
}
