package com.example.cyrinehammmi.gps;

import java.util.ArrayList;

/**
 * Created by Cyrine Hammémi on 30/01/2018.
 */

public class ResponseModel <T> {
    boolean status;
    T Data ;
    String msg;
    ArrayList<String> errors;
}
