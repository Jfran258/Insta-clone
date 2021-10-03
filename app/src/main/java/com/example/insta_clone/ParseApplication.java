package com.example.insta_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oD8hxfsCW8n88R7qz8lVQprio0avOgurcQAvY6Si")
                .clientKey("bELi1gEeI5dIB397JGvRuxc3xYFy4RwOd9vKB3bR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
