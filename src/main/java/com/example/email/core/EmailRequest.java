package com.example.email.core;

public record EmailRequest(String to, String subject, String body) {
}
