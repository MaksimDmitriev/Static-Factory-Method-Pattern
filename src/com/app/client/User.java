package com.app.client;

class User {

    private final int mId;
    private final String mName;

    public User(int id, String name) {
        mId = id;
        mName = name;
    }

    @Override
    public String toString() {
        return "id=" + mId + " name=" + mName;
    }
}
