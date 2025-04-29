package com.moonbolt.cityclash.interfaces;

public interface HttpCallback {
    void onSuccess(String response);
    void onFailure(Throwable t);
}
