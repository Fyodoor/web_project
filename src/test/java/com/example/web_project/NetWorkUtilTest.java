package com.example.web_project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import sun.nio.ch.Net;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class NetWorkUtilTest {

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void getConnect() {
        NetWorkUtil.getConnect();
    }
}